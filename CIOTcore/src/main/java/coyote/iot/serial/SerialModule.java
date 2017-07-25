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
 * A contract with all serial modules.
 * 
 * <p>Each implementation will have its own way of doing things
 */
public interface SerialModule {

  public SerialPort open( SerialConfig cfg );

}
