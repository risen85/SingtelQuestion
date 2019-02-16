/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Duck implements BirdInterface{
    
    
    @Override
    public void sing(){
        System.out.println("“Quack, quack”");
    }
    
    @Override
    public void swim(){
        System.out.println("I am swimming");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
    
    @Override
    public void walk() {
        System.out.println("I can walk");
    }
}
