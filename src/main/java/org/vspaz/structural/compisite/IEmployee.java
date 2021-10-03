package org.vspaz.structural.compisite;

import java.util.List;

public interface IEmployee {
  List<IEmployee> getHierarchy();

  int getCount();
}
