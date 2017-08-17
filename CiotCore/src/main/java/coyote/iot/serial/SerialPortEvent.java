/*
 * Copyright (c) 2017 Stephan D. Cote' - All rights reserved.
 * 
 * This program and the accompanying materials are made available under the 
 * terms of the MIT License which accompanies this distribution, and is 
 * available at http://creativecommons.org/licenses/MIT/
 */
package coyote.iot.serial;

/**
 * Represent a serial port event.
 * 
 * <p>Serial Port Event Listeners use events to perform processing 
 * asynchronously.
 * 
 * <p>Event value meanings differ depending on the type of event it is:<ul>
 * <li><strong>RXCHAR</strong> - bytes count in input buffer
 * <li><strong>RXFLAG</strong> - bytes count in input buffer
 * <li><strong>TXEMPTY</strong> - bytes count in output buffer
 * <li><strong>CTS</strong> - state of CTS line (0 - OFF, 1 - ON)
 * <li><strong>DSR</strong> - state of DSR line (0 - OFF, 1 - ON)
 * <li><strong>RLSD</strong> - state of RLSD line (0 - OFF, 1 - ON)
 * <li><strong>BREAK</strong> - 0
 * <li><strong>RING</strong> - state of RING line (0 - OFF, 1 - ON)
 * <li><strong>ERR</strong> - mask of errors</ul>
 */
public class SerialPortEvent {

  private SerialPort eventPort;
  private int eventType;
  private int eventValue;

  public static final int RXCHAR = 1;
  public static final int RXFLAG = 2;
  public static final int TXEMPTY = 4;
  public static final int CTS = 8;
  public static final int DSR = 16;
  public static final int RLSD = 32;
  public static final int BREAK = 64;
  public static final int ERR = 128;
  public static final int RING = 256;




  /**
   * Default constructor.
   * 
   * @param port The serial port raising the event.
   * @param type the type of event is is.
   * @param value value for the event.
   */
  public SerialPortEvent(SerialPort port, int type, int value) {
    this.eventPort = port;
    this.eventType = type;
    this.eventValue = value;
  }




  /**
   * The port on which the event was raised.
   */
  public SerialPort getPortName() {
    return eventPort;
  }




  /**
   * Event type accessor.
   */
  public int getEventType() {
    return eventType;
  }




  /**
   * Event value accessor.
   */
  public int getEventValue() {
    return eventValue;
  }




  /**
   * @return true if event of type {@code RXCHAR} is received and otherwise false.
   */
  public boolean isRXCHAR() {
    if (eventType == RXCHAR) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code RXFLAG} is received and otherwise false
   */
  public boolean isRXFLAG() {
    if (eventType == RXFLAG) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code TXEMPTY} is received and otherwise false
   */
  public boolean isTXEMPTY() {
    if (eventType == TXEMPTY) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code CTS} is received and otherwise false
   */
  public boolean isCTS() {
    if (eventType == CTS) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code DSR} is received and otherwise false
   */
  public boolean isDSR() {
    if (eventType == DSR) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code RLSD} is received and otherwise false
   */
  public boolean isRLSD() {
    if (eventType == RLSD) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code BREAK} is received and otherwise false
   */
  public boolean isBREAK() {
    if (eventType == BREAK) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code ERR} is received and otherwise false
   */
  public boolean isERR() {
    if (eventType == ERR) {
      return true;
    } else {
      return false;
    }
  }




  /**
   * @return true if event of type {@code RING} is received and otherwise false
   */
  public boolean isRING() {
    if (eventType == RING) {
      return true;
    } else {
      return false;
    }
  }
}
