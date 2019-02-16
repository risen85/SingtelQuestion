/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("----------Bird---------------");
        Animal bird = new Animal(new Bird());
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("----------Duck---------------");
        Animal duck = new Animal(new Duck());
        duck.walk();
        duck.fly();
        duck.swim();
        duck.sing();

        System.out.println("----------Chicken---------------");
        Animal chicken = new Animal(new Chicken());
        chicken.walk();
        chicken.fly();
        chicken.swim();
        chicken.sing();

        System.out.println("----------Rooster---------------");
        Animal rooster = new Animal(new Rooster());
        rooster.walk();
        rooster.fly();
        rooster.swim();
        rooster.sing();

        System.out.println("----------Parrot living with dog---------------");
        Animal parrot = new Animal(new Parrot("livingwithdog"));
        parrot.walk();
        parrot.fly();
        parrot.swim();
        parrot.sing();

        System.out.println("----------Parrot living with cat---------------");
        parrot.setBird(new Parrot("livingwithcat"));
        parrot.walk();
        parrot.fly();
        parrot.swim();
        parrot.sing();

        System.out.println("----------Parrot living with rooster---------------");
        parrot.setBird(new Parrot("livingwithrooster"));
        parrot.walk();
        parrot.fly();
        parrot.swim();
        parrot.sing();

        System.out.println("----------Fish---------------");
        Animal fish = new Animal(new Fish());
        fish.walk();
        fish.fly();
        fish.swim();
        fish.sing();

        System.out.println("----------Shark---------------");
        Animal shark = new Animal(new Shark());
        shark.walk();
        shark.fly();
        shark.swim();
        shark.sing();

        System.out.println("----------Clownfish---------------");
        Animal clownfish = new Animal(new Clownfish());
        clownfish.walk();
        clownfish.fly();
        clownfish.swim();
        clownfish.sing();

        System.out.println("----------Butterfly---------------");
        Animal butterfly = new Animal(new Butterfly());
        butterfly.walk();
        butterfly.fly();
        butterfly.swim();
        butterfly.sing();

        System.out.println("----------Caterpillar---------------");
        Animal caterpillar = new Animal(new Caterpillar());
        caterpillar.walk();
        caterpillar.fly();
        caterpillar.swim();
        caterpillar.sing();


    }
}
