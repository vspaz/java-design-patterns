package org.vspaz.creational.strategy;

import org.junit.Test;
import org.testng.Assert;
import org.vspaz.creational.strategy.ducks.Decoy;
import org.vspaz.creational.strategy.ducks.Mallard;
import org.vspaz.creational.strategy.ducks.Model;
import org.vspaz.creational.strategy.ducks.RedHead;
import org.vspaz.creational.strategy.ducks.RubberToy;
import org.vspaz.creational.strategy.fly.FlyRocketPowered;

public class StrategyTest {
    @Test
    public void testMallard() {
        Mallard mallard = new Mallard();
        Assert.assertEquals(mallard.describe(), "I am a mallard duck");
        Assert.assertEquals(mallard.swim(), "All ducks float, even decoys");
        Assert.assertEquals(mallard.doQuack(), "Quack");
        Assert.assertEquals(mallard.doFly(), "I'm flying");
    }

    @Test
    public void testRubberDuck() {
        RubberToy rubberToy = new RubberToy();
        Assert.assertEquals(rubberToy.describe(), "I am a rubber toy duck");
        Assert.assertEquals(rubberToy.swim(), "All ducks float, even decoys");
        Assert.assertEquals(rubberToy.doQuack(), "Squeak");
        Assert.assertEquals(rubberToy.doFly(), "can't fly");
    }

    @Test
    public void testDecoyDuck() {
        Decoy decoy = new Decoy();
        Assert.assertEquals(decoy.describe(), "I'm a decoy duck");
        Assert.assertEquals(decoy.swim(), "All ducks float, even decoys");
        Assert.assertEquals(decoy.doQuack(), "Silence");
        Assert.assertEquals(decoy.doFly(), "can't fly");
    }

    @Test
    public void testRedHead() {
        RedHead readHead = new RedHead();
        Assert.assertEquals(readHead.describe(), "I am a real read head duck");
        Assert.assertEquals(readHead.swim(), "All ducks float, even decoys");
        Assert.assertEquals(readHead.doQuack(), "Quack");
        Assert.assertEquals(readHead.doFly(), "I'm flying");
    }

    @Test
    public void testModelDuck() {
        Model model = new Model();
        Assert.assertEquals(model.describe(), "I am a model duck");
        Assert.assertEquals(model.swim(), "All ducks float, even decoys");
        Assert.assertEquals(model.doQuack(), "Quack");
        Assert.assertEquals(model.doFly(), "can't fly");
    }

    @Test
    public void testModelDuckRedefined() {
        Model model = new Model();
        Assert.assertEquals(model.doFly(), "can't fly");

        model.setFlyBehavior(new FlyRocketPowered());
        Assert.assertEquals(model.doFly(), "I'm flying with a rocket");
    }
}
