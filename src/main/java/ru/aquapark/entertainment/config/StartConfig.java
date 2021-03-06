package ru.aquapark.entertainment.config;

import ru.aquapark.entertainment.model.Slides;
import ru.aquapark.entertainment.model.SlidesList;

import java.util.ArrayList;
import java.util.Scanner;

public class StartConfig {
    public static void start() {
        SlidesList slidesList = createSlides();
        Slides slides = createSlide();
        Slides result = slidesList.get(slides);
        output(result);
    }

    private static SlidesList createSlides() {
        SlidesList slidesList = new SlidesList(new ArrayList<>());
        Slides slides = new Slides("yellow", 320, 2, false, 13.6);
        Slides slides1 = new Slides("red and blue", 430, 2, true, 19.4);
        Slides slides2 = new Slides("white", 270, 1, false, 12.3);
        Slides slides3 = new Slides("green", 380, 2, true, 17.1);
        Slides slides4 = new Slides("black", 560, 1, true, 27.5);
        Slides slides5 = new Slides("pink", 220, 2, false, 9.7);
        Slides slides6 = new Slides("blue and white", 400, 1, true, 18.8);
        Slides slides7 = new Slides("blue", 500, 1, true, 20.6);
        Slides slides8 = new Slides("yellow and green", 350, 2, false, 15.2);
        Slides slides9 = new Slides("red and black", 540, 1, true, 25.2);

        slidesList.add(slides);
        slidesList.add(slides1);
        slidesList.add(slides2);
        slidesList.add(slides3);
        slidesList.add(slides4);
        slidesList.add(slides5);
        slidesList.add(slides6);
        slidesList.add(slides7);
        slidesList.add(slides8);
        slidesList.add(slides9);
        return slidesList;
    }

    private static Slides createSlide() {
        return Slides.builder()
                .colour(new Scanner(System.in).nextLine())
                .height(new Scanner(System.in).nextInt())
                .width(new Scanner(System.in).nextInt())
                .build();
    }

    private static void output(Slides slides) {
        System.out.println(slides);
    }
}

