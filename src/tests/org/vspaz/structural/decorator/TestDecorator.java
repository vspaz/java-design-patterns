package org.vspaz.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDecorator {
  @Test
  void testDecoratorOk() {
    Block block = new Block();
    assertEquals(block.buildHouse(), "house is built");

    FloorDecorator floorDecorator = new FloorDecorator();
    floorDecorator.setBuildingBlock(block);
    assertEquals(floorDecorator.buildHouse(), "house is built; oak floor added");

    HouseFacadeDecorator facadeDecorator = new HouseFacadeDecorator();
    facadeDecorator.setBuildingBlock(floorDecorator);
    assertEquals(
        facadeDecorator.buildHouse(), "house is built; oak floor added; brick facade added");
  }
}
