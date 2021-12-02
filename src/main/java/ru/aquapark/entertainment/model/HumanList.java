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
    List<Human>humanList;

    public void add (Human human) {
        humanList.add(human);
    }
}
