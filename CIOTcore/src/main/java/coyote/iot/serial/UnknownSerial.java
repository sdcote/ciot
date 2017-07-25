/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 *
 * Contributors:
 *   Stephan D. Cote 
 *      - Initial concept and implementation
 */
package coyote.iot.serial;

/**
 * The module returned if no native drivers were detected on the host platform.
 */
public class UnknownSerial implements SerialModule {

  @Override
  public SerialPort open( SerialConfig cfg ) {
    return null;
  }




  @Override
  public String[] getPortNames() {
    return new String[0];
  }

}
