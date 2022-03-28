package lesson_09;

import java.util.ArrayList;

public class lab_9 {
    public static void main(String[] args) {
        Animal horse = new Animal.AnimalBuilder().withName("Horse").withFlyable(false).withMaxSpeed(75).build();
        Animal dog = new Animal.AnimalBuilder().withName("Dog").withFlyable(false).withMaxSpeed(60).build();
        Animal tiger = new Animal.AnimalBuilder().withName("Tiger").withFlyable(false).withMaxSpeed(100).build();

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(horse);
        animals.add(dog);
        animals.add(tiger);
//        Animal falcon = new Animal.AnimalBuilder().withName("Falcon").withFlyable(true).withMaxSpeed(100).build();
//        animals.add(falcon);

        int maxSpeed = animals.get(0).getSpeed();
        String maxSpeedName = animals.get(0).getName();
        for(int i = 1; i <= animals.size()-1; i++){
            if (animals.get(i).getSpeed() > maxSpeed){
                maxSpeed = animals.get(i).getSpeed();
                maxSpeedName = animals.get(i).getName();
            }
        }
        System.out.printf("Winner is %s, with speed: %d", maxSpeedName, maxSpeed );

    }

}
