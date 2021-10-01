package org.vspaz.structural.decorator;

import org.junit.Test;
import org.testng.Assert;

public class TestDecorator {
  @Test
  public void testDecoratorOk() {
    Block block = new Block();
    Assert.assertEquals(block.buildHouse(), "house is built");

    FloorDecorator floorDecorator = new FloorDecorator();
    floorDecorator.setBuildingBlock(block);
    Assert.assertEquals(floorDecorator.buildHouse(), "house is built; oak floor added");

    HouseFacadeDecorator facadeDecorator = new HouseFacadeDecorator();
    facadeDecorator.setBuildingBlock(floorDecorator);
    Assert.assertEquals(
        facadeDecorator.buildHouse(), "house is built; oak floor added; brick facade added");
  }
}
