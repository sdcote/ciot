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

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 
 */
public interface SerialPort extends Closeable {

  public OutputStream getOutputstream();




  public InputStream getInputstream();

}
