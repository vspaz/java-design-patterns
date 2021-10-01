package org.vspaz.behavioral.strategy;

import org.vspaz.behavioral.strategy.ducks.Decoy;
import org.vspaz.behavioral.strategy.ducks.Mallard;
import org.vspaz.behavioral.strategy.ducks.Model;
import org.vspaz.behavioral.strategy.ducks.RedHead;
import org.vspaz.behavioral.strategy.ducks.RubberToy;
import org.vspaz.behavioral.strategy.fly.FlyRocketPowered;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    public void testMallard() {
        Mallard mallard = new Mallard();
        assertEquals(mallard.describe(), "I am a mallard duck");
        assertEquals(mallard.swim(), "All ducks float, even decoys");
        assertEquals(mallard.doQuack(), "Quack");
        assertEquals(mallard.doFly(), "I'm flying");
    }

    @Test
    public void testRubberDuck() {
        RubberToy rubberToy = new RubberToy();
        assertEquals(rubberToy.describe(), "I am a rubber toy duck");
        assertEquals(rubberToy.swim(), "All ducks float, even decoys");
        assertEquals(rubberToy.doQuack(), "Squeak");
        assertEquals(rubberToy.doFly(), "can't fly");
    }

    @Test
    public void testDecoyDuck() {
        Decoy decoy = new Decoy();
        assertEquals(decoy.describe(), "I'm a decoy duck");
        assertEquals(decoy.swim(), "All ducks float, even decoys");
        assertEquals(decoy.doQuack(), "Silence");
        assertEquals(decoy.doFly(), "can't fly");
    }

    @Test
    public void testRedHead() {
        RedHead readHead = new RedHead();
        assertEquals(readHead.describe(), "I am a real read head duck");
        assertEquals(readHead.swim(), "All ducks float, even decoys");
        assertEquals(readHead.doQuack(), "Quack");
        assertEquals(readHead.doFly(), "I'm flying");
    }

    @Test
    public void testModelDuck() {
        Model model = new Model();
        assertEquals(model.describe(), "I am a model duck");
        assertEquals(model.swim(), "All ducks float, even decoys");
        assertEquals(model.doQuack(), "Quack");
        assertEquals(model.doFly(), "can't fly");
    }

    @Test
    public void testModelDuckRedefined() {
        Model model = new Model();
        assertEquals(model.doFly(), "can't fly");

        model.setFlyBehavior(new FlyRocketPowered());
        assertEquals(model.doFly(), "I'm flying with a rocket");
    }
}
