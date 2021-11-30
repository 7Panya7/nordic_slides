package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Human {
    String name,lastName,middleName;
    Integer age,height,weight;
    Character sex;

}
