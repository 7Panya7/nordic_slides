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

//    public static Slides choose(Slides slides, Human human) {
//        if (human.getAge() < 16) {
//            for (Slides ignored : slidesList) {
//                if (slides.getSpeed() < 16) {
//                    return slides;
//                }
//            }
//        }
//        if (human.getWeight() > 105) {
//            for (Slides ignored : slidesList) {
//                if (slides.getWidth() > 1) {
//                    return slides;
//                }
//            }
//        }
//        return slides;
//    }

    public Slides get (Slides slides) {
        for (Slides slides1: slidesList) {
            if (slides.getColour().equals(slides1.getColour())
            && slides.getHeight().equals(slides1.getHeight())
            && slides.getWidth().equals(slides1.getWidth())) {
                return slides1;
            }

        }
        return null;
    }
}
