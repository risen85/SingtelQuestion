/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Butterfly implements InsectInterface {

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void sing() {
        System.out.println("I can't sing");
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
