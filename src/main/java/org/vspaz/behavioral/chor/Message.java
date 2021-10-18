package org.vspaz.behavioral.chor;

public class Message {

  public String message;
  public MessagePriority messagePriority;

  public Message(String msg, MessagePriority priority) {
    messagePriority = priority;
    message = msg;
  }
}
