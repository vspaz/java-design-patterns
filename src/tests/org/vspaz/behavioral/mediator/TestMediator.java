package org.vspaz.behavioral.mediator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMediator {
  @Test
  void testMediatorOk() {
    Mediator mediator = new Mediator();
    DevOps devOps_1 = new DevOps(mediator, "devOps_1");
    List<Employee> staff = mediator.register(devOps_1);

    assertEquals(staff.size(), 1);

    DevOps devOps_2 = new DevOps(mediator, "devOps_2");
    staff = mediator.register(devOps_2);
    assertEquals(staff.size(), 2);

    Ops ops_1 = new Ops(mediator, "ops_1");
    mediator.register(ops_1);
    assertEquals(staff.size(), 3);

    Sre sre_1 = new Sre(mediator, "sre_1");
    mediator.register(sre_1);
    assertEquals(staff.size(), 4);
  }
}
