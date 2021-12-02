package ru.aquapark.entertainment;

import ru.aquapark.entertainment.config.StartConfig;
import ru.aquapark.entertainment.model.Human;
import ru.aquapark.entertainment.model.HumanList;
import ru.aquapark.entertainment.model.Slides;
import ru.aquapark.entertainment.model.SlidesList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Entertainment {
    public static void main(String[] args) {
        StartConfig.start();

        HumanList humanList = new HumanList(new ArrayList<>());

        Human human = new Human(Human.nameInput(), Human.lastNameInput(), Human.middleNameInput(), Human.ageInput(), Human.heightInput(), Human.weightInput(), Human.sexInput());

        humanList.add(human);


//        Slides choose = SlidesList.choose(Slides., human);
//
//        System.out.println(choose);

        human.rolling();
    }

}
