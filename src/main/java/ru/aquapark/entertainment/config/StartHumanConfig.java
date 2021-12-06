package ru.aquapark.entertainment.config;

import ru.aquapark.entertainment.model.Human;
import ru.aquapark.entertainment.model.HumanList;

import java.util.ArrayList;
import java.util.Scanner;

public class StartHumanConfig {
    public static void start() {
        HumanList humanList = createHumans();
        Human human = createHuman();
        Human result = humanList.get(human);
        output(result);
    }

    private static HumanList createHumans() {
        HumanList humanList = new HumanList(new ArrayList<>());
        Human human = new Human(Human.nameInput(), Human.lastNameInput(), Human.middleNameInput(), Human.ageInput(), Human.heightInput(), Human.weightInput(), Human.sexInput());
        Human human1 = new Human(Human.nameInput(), Human.lastNameInput(), Human.middleNameInput(), Human.ageInput(), Human.heightInput(), Human.weightInput(), Human.sexInput());
        Human human2 = new Human(Human.nameInput(), Human.lastNameInput(), Human.middleNameInput(), Human.ageInput(), Human.heightInput(), Human.weightInput(), Human.sexInput());

        humanList.add(human);
        humanList.add(human1);
        humanList.add(human2);

        return humanList;
    }

    private static Human createHuman() {
        return Human.builder()
                .name(new Scanner(System.in).nextLine())
                .age(new Scanner(System.in).nextInt())
                .sex(new Scanner(System.in).next().charAt(0))
                .build();
    }

    private static void output(Human human) {
        System.out.println(human);
    }
}
