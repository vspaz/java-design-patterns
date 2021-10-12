package org.vspaz.behavioral.memento;

public class Memento {

  private int id;

  public Memento(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
