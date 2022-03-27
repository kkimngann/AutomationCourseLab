package lesson_09;

public class Animal {
    private String name;
    private boolean flyable;
    private int speed;

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getSpeed() {
        return speed;
    }

    public Animal(String name, boolean flyable, int speed) {
        this.name = name;
        this.flyable = flyable;
        this.speed = speed;
    }

    public static class AnimalBuilder{
        private String name;
        private boolean flyable;
        private int speed;

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

        public AnimalBuilder withSpeed(int speed){
            this.speed = speed;
            return this;
        }

        public Animal build(){
            validateAnimal();
            return new Animal(this.name, this.flyable, this.speed);
        }
    }
}
