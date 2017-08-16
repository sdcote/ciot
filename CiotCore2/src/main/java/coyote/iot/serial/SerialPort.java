/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * This represents a wrapper around an object which communicates with a 
 * specific serial device/port using a vendor-specific API.
 */
public interface SerialPort extends Closeable {

  /**
   * Get a stream to send data out to external devices.
   * 
   * @return an output stream to which we can write bytes of data
   */
  public OutputStream getOutputstream();




  /**
   * Get a stream of bytes from the serial port.
   * 
   * @return an input stream from which we can read bytes of data
   */
  public InputStream getInputstream();




  /**
   * Configure the details of how the serial port is expected to operate.
   * 
   * @param config The configuration data
   */
  public void configure(SerialConfig config);

}
