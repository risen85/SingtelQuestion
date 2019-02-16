/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Parrot implements BirdInterface {

    private String type;

    public Parrot(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void sing() {
        if (type.equals("livingwithdog")) {
            System.out.println("Woof, woof");
        } else if (type.equals("livingwithcat")) {
            System.out.println("Meow");
        } else if (type.equals("livingwithrooster")) {
            System.out.println("Cock-a-doodle-doo");
        } else if (type.equals("livingwithduck")) {
            System.out.println("Quack, quack");
        } else{
            System.out.println("I am singing");
        }
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
