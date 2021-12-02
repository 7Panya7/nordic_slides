package ru.aquapark.entertainment.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Scanner;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Human implements toRollDown {
    String name, lastName, middleName;
    Integer age, height, weight;
    Character sex;

    public static String nameInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        return input.nextLine();
    }
    public static String lastNameInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your lastname: ");
        return input.nextLine();
    }
    public static String middleNameInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your middlename: ");
        return input.nextLine();
    }
    public static Integer ageInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your age: ");
        return input.nextInt();
    }
    public static Integer heightInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your height: ");
        return input.nextInt();
    }
    public static Integer weightInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your weight: ");
        return input.nextInt();
    }
    public static Character sexInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your sex: ");
        return input.next().charAt(0);
    }

    public void rolling() {
        toRollDown.toRoll();
    }
}