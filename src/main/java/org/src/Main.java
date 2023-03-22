package org.src;

import org.src.entities.Broom;
import org.src.entities.Pet;
import org.src.entities.User;
import org.src.entities.Wand;
import org.src.enums.HogwartsHouses;
import org.src.enums.Traits;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Enter your character's name: ");
        String name = sc.next();
        System.out.print("Enter your character's gender: (M/F) ");
        String gender = sc.next();
        String birthDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int hogwartsHouseNumber = random.nextInt(4) + 1;

        HogwartsHouses house;
        switch(hogwartsHouseNumber) {
            case 1:
                house = HogwartsHouses.GRYFFINDOR;
                break;
            case 2:
                house = HogwartsHouses.HUFFLEPUFF;
                break;
            case 3:
                house = HogwartsHouses.RAVENCLAW;
                break;
            case 4:
                house = HogwartsHouses.SLYTHERIN;
                break;
            default:
                house = null;
                break;
        }

        System.out.print("Enter your broom's speed: ");
        Integer speed = sc.nextInt();
        System.out.print("Enter your broom's model: ");
        String model = sc.next();
        Broom broom = new Broom(speed, model);

        System.out.print("Enter your wand's length: ");
        Double length = sc.nextDouble();
        System.out.print("Enter your wand's wood type: ");
        String woodType = sc.next();
        Wand wand = new Wand(length, woodType);

        System.out.print("Enter your pet's name: ");
        String petName = sc.next();
        System.out.print("Enter your pet's species: ");
        String species = sc.next();
        Pet pet = new Pet(petName, species);

        User user = new User(name, gender, birthDate, house, broom, wand, pet);
    }
}