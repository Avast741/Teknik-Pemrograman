/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import Fly.FlyNoWay;
import Fly.FlyWithWings;
import Fly.IFlyBehaviour;
import Quack.IQuackBehaviour;
import Quack.Quack;
import Quack.Squeek;
import Quack.MuteQuack;
import Swim.ISwimBehaviour;
import Swim.Stay;
import Swim.Swim;

public class Main {
    public static void main(String[] args) {

        // Red Head Duck
        IFlyBehaviour flyBehaviour = new FlyWithWings();
        IQuackBehaviour quackBehaviour = new Quack();
        ISwimBehaviour swimBehaviour = new Swim();

        Duck redHeadDuck = new RedHeadDuck();
        System.out.println("\nApa kebiasaan dari Red Head Duck?");
        redHeadDuck.setFlyBehaviour(flyBehaviour);
        redHeadDuck.setQuackBehaviour(quackBehaviour);
        redHeadDuck.setSwimBehaviour(swimBehaviour);

        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        redHeadDuck.performSwim();

        // Rubber Duck
        IFlyBehaviour noFlyBehaviour = new FlyNoWay();
        IQuackBehaviour squeekBehaviour = new Squeek();
        ISwimBehaviour stayBehaviour = new Stay();

        System.out.println("\nApa kebiasaan dari Rubber Duck?");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehaviour(squeekBehaviour);
        rubberDuck.setFlyBehaviour(noFlyBehaviour);
        rubberDuck.setSwimBehaviour(stayBehaviour);

        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        // Wodden Duck
        IQuackBehaviour noQuackBehaviour = new MuteQuack();
        Duck woddenDuck = new WoddenDuck();
        
        System.out.println("\nApa kebiasaan dari Wodden Duck?");
        woddenDuck.setFlyBehaviour(noFlyBehaviour);
        woddenDuck.setQuackBehaviour(noQuackBehaviour);
        woddenDuck.setSwimBehaviour(stayBehaviour);
        
        woddenDuck.performQuack();
        woddenDuck.performFly();
        woddenDuck.performSwim();
        
    }
}
