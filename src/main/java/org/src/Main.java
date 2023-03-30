package org.src;

import org.src.entities.*;
import org.src.enums.HogwartsHouses;
import org.src.enums.Traits;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

        System.out.print("1 to 10: how many traits do you want to add to your character? ");
        int traitsLoop = sc.nextInt();
        for(int i = 0; i < traitsLoop; i++) {
            System.out.print("Choose the numbers of the traits you want to have: ");
            System.out.println(
                    "1 - BRAVE,\n" +
                    "        2 - AMBITIOUS,\n" +
                    "        3 - CLEVER,\n" +
                    "        4 - CUNNING,\n" +
                    "        5 - LOYAL,\n" +
                    "        6 - KIND,\n" +
                    "        7 - RESOURCEFUL,\n" +
                    "        8 - RECKLESS,\n" +
                    "        9 - INTELLIGENT,\n" +
                    "        10 - CHARISMATIC;");
            Integer chosenTrait = sc.nextInt();

            switch (chosenTrait) {
                case 1:
                    user.addTrait(Traits.BRAVE);
                    break;
                case 2:
                    user.addTrait(Traits.AMBITIOUS);
                    break;
                case 3:
                    user.addTrait(Traits.CLEVER);
                    break;
                case 4:
                    user.addTrait(Traits.CUNNING);
                    break;
                case 5:
                    user.addTrait(Traits.LOYAL);
                    break;
                case 6:
                    user.addTrait(Traits.KIND);
                    break;
                case 7:
                    user.addTrait(Traits.RESOURCEFUL);
                    break;
                case 8:
                    user.addTrait(Traits.RECKLESS);
                    break;
                case 9:
                    user.addTrait(Traits.INTELLIGENT);
                    break;
                case 10:
                    user.addTrait(Traits.CHARISMATIC);
                    break;
                default:
                    System.out.print("You've ran out of options!");
                    break;
            }
        }

        System.out.println(user);
    }
}