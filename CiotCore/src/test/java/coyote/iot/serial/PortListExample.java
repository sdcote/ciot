/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

import coyote.iot.Serial;


/**
 * 
 */
public class PortListExample {

  public static void main(String[] args) {
    String[] portNames = Serial.getPortNames();
    System.out.println("Available comm ports:");
    for (int i = 0; i < portNames.length; i++) {
      System.out.println(portNames[i]);
    }
  }

}
