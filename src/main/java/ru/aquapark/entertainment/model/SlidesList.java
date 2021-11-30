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

//    public Slides choose(Slides slides) {
//        if (Human.getAge() < 16) {
//            for (Slides slides1 : slidesList) {
//                if (slides.getSpeed() < 16) {
//                    return slides;
//                }
//            }
//            if (Human.getWeight() > 105) {
//                for (Slides slides1 : slidesList) {
//                    if (slides.getWidth() > 1) {
//                        return slides;
//                    }
//                }
//            }
//        }
//        return null;
//    }
}
