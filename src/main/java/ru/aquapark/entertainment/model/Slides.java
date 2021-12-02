package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults (level = AccessLevel.PRIVATE)
@Builder

public class Slides {
    String colour;
    Integer height;
    Integer width;
    Boolean openOrClosedSlide;
    Double speed;
}

