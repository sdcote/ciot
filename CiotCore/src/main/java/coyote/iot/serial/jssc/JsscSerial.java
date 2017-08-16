/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial.jssc;

import coyote.iot.serial.AbstractSerialModule;
import coyote.iot.serial.SerialConfig;
import coyote.iot.serial.SerialModule;
import coyote.iot.serial.SerialPort;
import jssc.SerialPortList;

/**
 * 
 */
public class JsscSerial extends AbstractSerialModule implements SerialModule {
  
  public JsscSerial() throws ClassNotFoundException{
    Class<?> clazz = Class.forName("jssc.SerialPort");
  }

  @Override
  public SerialPort open(SerialConfig cfg) {
    return null;
  }




  @Override
  public String[] getPortNames() {
    return SerialPortList.getPortNames();
  }

}
