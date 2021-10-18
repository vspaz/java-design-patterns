package org.vspaz.behavioral.chor;

public class EmailErrorHandler implements Receiver {
  private Receiver nextReceiver;

  @Override
  public boolean handleMessage(Message message) {
    if (message.text.contains("email")) {
      return true;
    } else if (nextReceiver != null) {
      nextReceiver.handleMessage(message);
    }
    return false;
  }

  @Override
  public void nextErrorHandler(Receiver nextReceiver) {
    this.nextReceiver = nextReceiver;
  }
}
