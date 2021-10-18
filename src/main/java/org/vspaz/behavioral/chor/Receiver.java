package org.vspaz.behavioral.chor;

public interface Receiver {
  boolean handleMessage(Message msg);

  void nextErrorHandler(Receiver nextReceiver);
}
