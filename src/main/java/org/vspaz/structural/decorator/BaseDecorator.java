package org.vspaz.structural.decorator;

abstract class BaseDecorator extends BuildingBlock {
  protected BuildingBlock buildingBlock;

  public void setBuildingBlock(BuildingBlock block) {
    buildingBlock = block;
  }

  @Override
  public String buildHouse() {
    if (buildingBlock != null) {
      return buildingBlock.buildHouse();
    }
    return "not built yet";
  }
}
