package coyote.iot.serial;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MockCommPort implements SerialPort {

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub
    
  }

  @Override
  public OutputStream getOutputstream() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getInputstream() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void configure( SerialConfig config ) {
    // TODO Auto-generated method stub
    
  }

}
