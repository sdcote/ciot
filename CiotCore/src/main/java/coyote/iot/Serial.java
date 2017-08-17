/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import coyote.iot.serial.SerialConfig;
import coyote.iot.serial.SerialModule;
import coyote.iot.serial.SerialPort;
import coyote.iot.serial.UnknownSerial;
import coyote.iot.serial.jssc.JsscSerial;
import coyote.iot.serial.pi4j.Pi4jSerial;
import coyote.loader.log.Log;


/**
 * This is an abstraction layer over any of a number of serial communications 
 * implementations.
 * 
 * <p>The goal is to enhance portability of code between Windows and *nix and 
 * various native libraries. By binding code to this layer, your components 
 * should be able to run on different serial communication implementations.
 * 
 * <p>This is a challenging class to design as it has to support multiple 
 * native implementations while still providing unique features of each. If 
 * the API seems odd, it's because trade-offs were made to ensure portability.
 * 
 * <p>Try to support the following implementations:
 * RXTX: http://rxtx.qbang.org/
 * PI4J: https://github.com/Pi4J
 * 
 * Maybe even:
 * usb4java: http://usb4java.org/
 * JSSC: https://code.google.com/archive/p/java-simple-serial-connector/
 * http://fazecast.github.io/jSerialComm/
 * http://www.sparetimelabs.com/purejavacomm/purejavacomm.php
 * 
 */
public class Serial {

  // This holds the underlying serial access implementation module
  private static SerialModule module;

  // All Serial Ports are stored in a table by name representing the ports on the system 
  private static final Map<String, SerialPort> ports = new Hashtable<String, SerialPort>();

  private static String[] portNames = null;

  static {
    // Try to determine which module to use. Each will throw an exception if they cannot be loaded
    try {
      module = new JsscSerial();
    } catch (ClassNotFoundException e) {
      Log.debug("Could not load JSSC");
    }

    if (module == null) {
      try {
        module = new Pi4jSerial();
      } catch (ClassNotFoundException e) {
        Log.debug("Could not load Pi4j");
      }
    }

    if (module == null) {
      module = new UnknownSerial();
    }
  }




  private Serial() {
    // private constructor
  }




  /**
   * Retrieve a list of all serial port names available to the API.
   * 
   * <p>These names are specific to the platform and should not be considered 
   * constant between hosts. Two *nix hosts may have different default serial 
   * port names.
   * 
   * @return a list of names the caller can use to open portsList may be empty 
   *         but never null.
   */
  public static String[] getPortNames() {
    if (portNames == null) {
      portNames = module.getPortNames();
    }
    return portNames;
  }




  /**
   * Open the serial port described by the given configuration.
   * 
   * @param cfg Description of the serial port to open.
   * 
   * @return the opened Serial Port
   * 
   * @throws IOException if the serial port could not be opened.
   * @throws IllegalStateException if the serial port is already open.
   */
  public static SerialPort open(SerialConfig cfg) throws IOException {
    if (ports.containsKey(cfg.getPortName())) {
      throw new IllegalStateException("Serial port is already open: " + cfg.getPortName());
    }

    SerialPort retval = module.open(cfg);
    if (retval != null) {
      ports.put(cfg.getPortName(), retval);
    } else {
      throw new IOException("Could not open serial port is already open: " + cfg.getPortName());
    }
    return retval;
  }




  /**
   * Open the named serial port with a default configuration.
   * 
   * <p>You can configure the returned port later to meet your needs.
   * 
   * @param name the name of the port to open.
   * 
   * @return the opened Serial Port
   * 
   * @throws IOException if the serial port could not be opened.
   * @throws IllegalStateException if the serial port is already open.
   */
  public static SerialPort open(String name) throws IOException {
    if (ports.containsKey(name)) {
      throw new IllegalStateException("Serial port is already open: " + name);
    }
    SerialConfig cfg = new SerialConfig().setPortName(name);

    SerialPort retval = module.open(cfg);
    if (retval != null) {
      ports.put(cfg.getPortName(), retval);
    } else {
      throw new IOException("Could not open, serial port is already open: " + cfg.getPortName());
    }
    return retval;
  }




  /**
   * @return the module responsible for creating SerialPort instances.
   */
  static SerialModule getModule() {
    return module;
  }




  /**
   * Set the module to a specific implementation.
   * 
   * <p>The primary purpose for this acessor is to enable testing, allowing 
   * the module to be replaced with a Mock object which will return Mock 
   * SerialPorts without placing test code in the main artifact.
   * 
   * <p>Default access implies test classes will need to be in same package as 
   * this fixture. This is the case for testing.
   * 
   * @param module the module to set
   */
  static void setModule(SerialModule module) {
    Serial.module = module;
  }

}
