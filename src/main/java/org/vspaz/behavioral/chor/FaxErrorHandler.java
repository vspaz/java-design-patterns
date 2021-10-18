package org.vspaz.behavioral.chor;

public class FaxErrorHandler implements Receiver {
  private Receiver nextReceiver;

  @Override
  public boolean handleMessage(Message msg) {
    if (msg.message.contains("fax")) {
      return true;
    } else if (nextReceiver != null) {
      nextReceiver.handleMessage(msg);
    }
    return false;
  }

  @Override
  public void nextErrorHandler(Receiver nextReceiver) {
    this.nextReceiver = nextReceiver;
  }
}
