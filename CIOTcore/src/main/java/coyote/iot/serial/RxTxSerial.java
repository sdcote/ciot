/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

/**
 * 
 */
public class RxTxSerial extends AbstractSerialModule implements SerialModule {

  @Override
  public SerialPort open(SerialConfig cfg) {
    return null;
  }




  @Override
  public String[] getPortNames() {
    return new String[0];
  }

}
