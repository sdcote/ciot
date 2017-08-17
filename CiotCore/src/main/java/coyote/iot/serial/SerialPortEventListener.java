/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

/**
 * Serial Port Listeners implement this interface to be notified when events 
 * occur on a serial port.
 */
public interface SerialPortEventListener {

  /**
   * Event call-back.
   * 
   * @param event the event raised by the serial port.
   */
  public abstract void serialEvent(SerialPortEvent event);

}
