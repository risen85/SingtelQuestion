/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Rooster implements BirdInterface {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void sing() {

        System.out.println("Cock-a-doodle-doo");

    }

    @Override
    public void swim() {
        System.out.println("I can't swim");
    }

    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}
