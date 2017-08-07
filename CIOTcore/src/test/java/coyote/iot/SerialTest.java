/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import coyote.iot.serial.MockSerialModule;
import coyote.iot.serial.SerialPort;


/**
 * 
 */
public class SerialTest {

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    // Set a mock implementation of a serial port module in our fixture
    Serial.setModule(new MockSerialModule());
  }




  @Test
  public void openTest() throws IOException {
    SerialPort commPort = Serial.open("COM1");
    assertNotNull(commPort);
    commPort.getInputstream();
    commPort.getOutputstream();
  }

}
