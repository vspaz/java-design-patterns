package org.vspaz.strategy;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.vspaz.strategy.ducks.Decoy;
import org.vspaz.strategy.ducks.Mallard;
import org.vspaz.strategy.ducks.Model;
import org.vspaz.strategy.ducks.RubberToy;
import org.vspaz.strategy.fly.FlyRocketPowered;

public class StrategyTest {
    @Test
    void testMallard() {
        Mallard mallard = new Mallard();
        Assert.assertEquals(mallard.display(), "I am a mallard duck");
        Assert.assertEquals(mallard.swim(), "All ducks float, even decoys");
        Assert.assertEquals(mallard.doQuack(), "Quack");
        Assert.assertEquals(mallard.doFly(), "I'm flying");
    }

    @Test
    void testRubberDuck() {
        RubberToy rubberToy = new RubberToy();
        Assert.assertEquals(rubberToy.swim(), "All ducks float, even decoys");
        Assert.assertEquals(rubberToy.doFly(), "can't fly");
        Assert.assertEquals(rubberToy.doQuack(), "Squeak");
    }

    @Test
    void testModelDuck() {
        Model model = new Model();
        Assert.assertEquals(model.swim(), "All ducks float, even decoys");
        Assert.assertEquals(model.doQuack(), "Quack");
        Assert.assertEquals(model.doFly(), "can't fly");
    }

    @Test
    void testModelDuckRedefined() {
        Model model = new Model();
        Assert.assertEquals(model.doFly(), "can't fly");

        model.setFlyBehavior(new FlyRocketPowered());
        Assert.assertEquals(model.doFly(), "I'm flying with a rocket.");
    }
}
