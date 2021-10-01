package org.vspaz.creational.builder;

public interface IBuilder {
  void Body(String bodyType);

  void Wheels(int wheelCount);

  void Headlights(String headlightsType);

  String Build();
}
