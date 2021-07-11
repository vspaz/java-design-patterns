package org.vspaz.strategy;


import org.vspaz.strategy.ducks.Decoy;
import org.vspaz.strategy.ducks.Mallard;
import org.vspaz.strategy.ducks.Model;
import org.vspaz.strategy.ducks.RubberToy;
import org.vspaz.strategy.fly.FlyRocketPowered;

public class DuckSimulator {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        RubberToy rubberToy = new RubberToy();
        Decoy decoy = new Decoy();
        Model model = new Model();

        mallard.doQuack();
        rubberToy.doQuack();
        decoy.doQuack();

        model.doFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.doFly();
    }
}
