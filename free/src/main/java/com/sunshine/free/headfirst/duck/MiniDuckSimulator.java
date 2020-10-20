package com.sunshine.free.headfirst.duck;

/**
 * @author : sir.Q
 * @Date : Create in
 * @Description:
 * @Modified By:
 * @Version:
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();


    }
}
