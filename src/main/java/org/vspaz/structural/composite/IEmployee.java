package org.vspaz.structural.composite;

import java.util.List;

public interface IEmployee {
  List<IEmployee> getHierarchy();

  int getCount();
}
