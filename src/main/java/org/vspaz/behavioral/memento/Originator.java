package org.vspaz.behavioral.memento;

public class Originator {
  private int id;

  public Originator() {
    this.id = 0;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Memento save(int id) {
    return new Memento(id);
  }

  public void revert(Memento prevMemento) {
    this.id = prevMemento.getId();
  }
}
