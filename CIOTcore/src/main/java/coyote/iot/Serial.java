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
package coyote.iot;

import coyote.iot.serial.UnknownSerial;
import coyote.iot.serial.SerialConfig;
import coyote.iot.serial.SerialModule;
import coyote.iot.serial.SerialPort;


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
 */
public class Serial {

  private static final SerialModule module;

  static {
    // Try to determine which module to use
    
    // look for libraries?
    
    module = new UnknownSerial();
  }




  private Serial() {}




  SerialPort open( SerialConfig cfg ) {
    return module.open( cfg );
  }

}
