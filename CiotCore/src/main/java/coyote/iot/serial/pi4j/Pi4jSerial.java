/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial.pi4j;

import coyote.iot.serial.AbstractSerialModule;
import coyote.iot.serial.SerialConfig;
import coyote.iot.serial.SerialModule;
import coyote.iot.serial.SerialPort;


/**
 * 
 */
public class Pi4jSerial extends AbstractSerialModule implements SerialModule {

  public Pi4jSerial() throws ClassNotFoundException {
    Class<?> clazz = Class.forName("com.pi4j.io.serial.SerialFactory");
  }




  @Override
  public SerialPort open(SerialConfig cfg) {
    return null;
  }




  @Override
  public String[] getPortNames() {
    return new String[0];
  }

}
