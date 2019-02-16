/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question;

/**
 *
 * @author Ri Sen
 */
public class Animal implements AnimalInterface {

    private BirdInterface bird;
    private FishInterface fish;
    private InsectInterface insect;

    public Animal(BirdInterface bird) {
        this.bird = bird;
    }

    public Animal(FishInterface fish) {
        this.fish = fish;
    }

    public Animal(InsectInterface insect) {
        this.insect = insect;
    }

    @Override
    public void walk() {
        if (bird != null) {
            getBird().walk();
        } else if (fish != null) {
            getFish().walk();
        } else if (getInsect() != null) {
            getInsect().walk();
        }
    }

    @Override
    public void fly() {
        if (bird != null) {
            getBird().fly();
        } else if (fish != null) {
            getFish().fly();
        } else if (getInsect() != null) {
            getInsect().fly();
        }
    }

    @Override
    public void sing() {
        if (bird != null) {
            getBird().sing();
        } else if (fish != null) {
            getFish().sing();
        } else if (getInsect() != null) {
            getInsect().sing();
        }
    }

    @Override
    public void swim() {
        if (bird != null) {
            getBird().swim();
        } else if (fish != null) {
            getFish().swim();
        } else if (getInsect() != null) {
            getInsect().swim();
        }
    }

    /**
     * @return the bird
     */
    public BirdInterface getBird() {
        return bird;
    }

    /**
     * @param bird the bird to set
     */
    public void setBird(BirdInterface bird) {
        this.bird = bird;
    }

    /**
     * @return the fish
     */
    public FishInterface getFish() {
        return fish;
    }

    /**
     * @param fish the fish to set
     */
    public void setFish(FishInterface fish) {
        this.fish = fish;
    }

    /**
     * @return the insect
     */
    public InsectInterface getInsect() {
        return insect;
    }

    /**
     * @param insect the insect to set
     */
    public void setInsect(InsectInterface insect) {
        this.insect = insect;
    }
}
