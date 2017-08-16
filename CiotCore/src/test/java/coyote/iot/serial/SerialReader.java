/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

import java.io.IOException;

import coyote.iot.Serial;

/**
 * 
 */
public class SerialReader {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {

    // Create a seriap port configuration (port name, baud rate, flow control, etc.)
    SerialConfig config = new SerialConfig()
        .setPortName("COM1")
        .setBaud(Baud.b38400)
        .setDataBits(DataBits.EIGHT)
        .setParity(Parity.NONE)
        .setStopBits(StopBits.ONE)
        .setFlowControl(FlowControl.NONE);
    
    // Get a referenced to the configured serial port
    SerialPort commPort = Serial.open(config);
    
    

  }

}
