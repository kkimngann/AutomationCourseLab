package lesson_08;

import java.security.SecureRandom;

public class Animal {
    private int maxSpeed;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Animal(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.speed = new SecureRandom().nextInt(this.maxSpeed);
    }
}
