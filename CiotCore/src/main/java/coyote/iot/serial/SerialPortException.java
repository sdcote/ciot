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
public class SerialPortException extends Exception {

  private static final long serialVersionUID = 7580187993965588656L;
  final public static String TYPE_PORT_ALREADY_OPENED = "Port already opened";
  final public static String TYPE_PORT_NOT_OPENED = "Port not opened";
  final public static String TYPE_CANT_SET_MASK = "Can't set mask";
  final public static String TYPE_LISTENER_ALREADY_ADDED = "Event listener already added";
  final public static String TYPE_LISTENER_THREAD_INTERRUPTED = "Event listener thread interrupted";
  final public static String TYPE_CANT_REMOVE_LISTENER = "Can't remove event listener, because listener not added";
  final public static String TYPE_PARAMETER_IS_NOT_CORRECT = "Parameter is not correct";
  final public static String TYPE_NULL_NOT_PERMITTED = "Null not permitted";
  final public static String TYPE_PORT_BUSY = "Port busy";
  final public static String TYPE_PORT_NOT_FOUND = "Port not found";
  final public static String TYPE_PERMISSION_DENIED = "Permission denied";
  final public static String TYPE_INCORRECT_SERIAL_PORT = "Incorrect serial port";

  private String portName;
  private String methodName;
  private String exceptionType;




  public SerialPortException(String portName, String methodName, String exceptionType) {
    super("Port name - " + portName + "; Method name - " + methodName + "; Exception type - " + exceptionType + ".");
    this.portName = portName;
    this.methodName = methodName;
    this.exceptionType = exceptionType;
  }




  /**
   * Access port name raising the exception.
   */
  public String getPortName() {
    return portName;
  }




  /**
   * Access method name raising the exception.
   */
  public String getMethodName() {
    return methodName;
  }




  /**
   * Access the type of exception
   */
  public String getExceptionType() {
    return exceptionType;
  }
}
