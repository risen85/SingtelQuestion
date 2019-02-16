/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Clownfish implements FishInterface{
    public Clownfish() {
        System.out.println("I am small and colourful (orange)");
        System.out.println("I make jokes");
    }

    @Override
    public void sing() {
        System.out.println("I can't sing");
    }

    @Override
    public void walk() {
        System.out.println("I can't walk");
    }

    @Override
    public void swim() {
        System.out.println("I can swim");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
