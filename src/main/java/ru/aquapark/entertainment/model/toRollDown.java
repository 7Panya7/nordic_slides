package ru.aquapark.entertainment.model;

public interface toRollDown {
    static void toRoll() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Скатился со всех горок " + i + " раз");
        }
    }
}
