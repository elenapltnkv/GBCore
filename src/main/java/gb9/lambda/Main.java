package gb9.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("fish", false, false));
        animalList.add(new Animal("cat", true, true));
        animalList.add(new Animal("turtle", false, true));
        animalList.add(new Animal("berd", true, false));

        printAnimals(animalList, new CheckIsJump());

//        printAnimals(animalList, new CheckIsJump(){
//            @Override
//            public boolean test(Animal animal) {
//                return animal.isCanRun();
//            }
//        });

        printAnimals(animalList, animal->animal.isCanJump());
    }

    public static void printAnimals(List<Animal> animals, Check check) {
        for (Animal animal : animals) {
            if (check.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}
