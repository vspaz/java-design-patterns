package org.vspaz.structural.compisite;

import java.util.List;

interface IEmployee {
  List<IEmployee> getHierarchy();

  int getCount();
}
