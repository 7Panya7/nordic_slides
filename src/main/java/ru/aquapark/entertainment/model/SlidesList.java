package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class SlidesList {
    List<Slides> slidesList;

    public void add(Slides slides) {
        slidesList.add(slides);
    }

    public void choose(Slides slides, Human human) {
        if (human.getAge() < 16) {
            for (Slides ignored : slidesList) {
                if (slides.getSpeed() < 16) {
                    return;
                }
            }
        }
        if (human.getWeight() > 105) {
            for (Slides ignored : slidesList) {
                if (slides.getWidth() > 1) {
                    return;
                }
            }
        }
    }
}
