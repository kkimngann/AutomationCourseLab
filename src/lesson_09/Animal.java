package lesson_09;

import java.security.SecureRandom;

public class Animal {
    private String name;
    private boolean flyable;
    private int speed;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Animal(String name, boolean flyable, int maxSpeed) {
        this.name = name;
        this.flyable = flyable;
        this.maxSpeed = maxSpeed;
        this.speed = new SecureRandom().nextInt(this.maxSpeed);
    }

    public static class AnimalBuilder{
        private String name;
        private boolean flyable;
        private int maxSpeed;

        private void validateAnimal() {
            if (this.name == null || this.flyable) {
                throw new IllegalArgumentException("Animal can't be join in the racing");
            }

        }

        public AnimalBuilder withName(String name){
            this.name = name;
            return this;
        }

        public AnimalBuilder withFlyable(boolean flyable){
            this.flyable = flyable;
            return this;
        }

        public AnimalBuilder withMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Animal build(){
            validateAnimal();
            return new Animal(this.name, this.flyable, this.maxSpeed);
        }
    }
}
