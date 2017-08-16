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
public enum FlowControl {

  NONE(0), HARDWARE(1), SOFTWARE(2);

  private int index = 0;




  private FlowControl(int index) {
    this.index = index;
  }




  public int getIndex() {
    return this.index;
  }




  public static FlowControl getInstance(String flow_control) {
    return FlowControl.valueOf(flow_control.toUpperCase());
  }

}
