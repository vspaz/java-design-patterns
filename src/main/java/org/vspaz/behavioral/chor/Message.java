package org.vspaz.behavioral.chor;

public class Message {

  public String text;
  public MessagePriority messagePriority;

  public Message(String text, MessagePriority messagePriority) {
    this.text = text;
    this.messagePriority = messagePriority;
  }
}
