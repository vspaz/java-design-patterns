package org.vspaz.behavioral.chor;

public class IssueHandler {
  public Receiver receiver_1;

  public void handleNextError(Receiver errorHandler_1) {
    receiver_1 = errorHandler_1;
  }

  public void raiseError(Message msg) {
    if (receiver_1 != null) {
      receiver_1.handleMessage(msg);
    }
  }
}
