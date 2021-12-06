package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
@Builder

public class HumanList {
    List<Human> humanList;

    public void add(Human human) {
        humanList.add(human);
    }

    public Human get(Human human) {
        for (Human human1 : humanList) {
            if (human.getName().equals(human1.getName())
                    && human.getAge().equals(human1.getAge())
                    && human.getSex().equals(human1.getSex())) {
                return human1;
            }

        }
        return null;
    }
}