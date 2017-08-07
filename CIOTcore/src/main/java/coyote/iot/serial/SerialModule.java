/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

/**
 * A contract with all serial modules.
 * 
 * <p>Each implementation will have its own way of doing things
 */
public interface SerialModule {

  /**
   * Return a serial port object matching the given configuration.
   * 
   * <p>For most implementations only the DeviceName is important.
   * @param cfg
   * @return
   */
  public SerialPort open(SerialConfig cfg);




  /**
   * Create a list of all serial port names available to the API.
   * 
   * @return a list of names the caller can use to open portsList may be empty 
   *         but never null.
   */
  public String[] getPortNames();

}
