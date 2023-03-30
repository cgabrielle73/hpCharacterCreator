package org.src.entities;

import org.src.enums.HogwartsHouses;
import org.src.enums.Traits;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String gender;

    private String birthDate;
    private HogwartsHouses house;
    private Broom broom;
    private Wand wand;
    private Pet pet;
    private List<Traits> traits = new ArrayList<>();

    public User(){}

    public User(String name, String gender, String birthDate, HogwartsHouses house, Broom broom, Wand wand, Pet pet) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.house = house;
        this.broom = broom;
        this.wand = wand;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public HogwartsHouses getHouse() {
        return house;
    }

    public void setHouse(HogwartsHouses house) {
        this.house = house;
    }

    public Broom getBroom() {
        return broom;
    }

    public void setBroom(Broom broom) {
        this.broom = broom;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Traits> getTraits() {
        return traits;
    }

    public void addTrait(Traits trait) {
        traits.add(trait);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Character's name: " + name + "\n");
        sb.append("Character's gender: " + gender + "\n");
        sb.append("Character's birthDate: " + birthDate + "\n");
        sb.append("Character's house: " + house + "\n");
        sb.append("About the broom: " + "\n");
        sb.append("Broom's model: " + broom.getModel() + ",");
        sb.append("Broom's speed: " + broom.getSpeed() + "\n");
        sb.append("About the wand: " + "\n");
        sb.append("Wand's length: " + wand.getLength() + ",");
        sb.append("Wand's wood type: " + wand.getWoodType() + "\n");
        sb.append("About the pet: " + "\n");
        sb.append("Name: " + pet.getName() + ",");
        sb.append("Species: " + pet.getSpecies() + "\n");
        sb.append("Traits: " + "\n");
        for(Traits trait : traits) {
            sb.append(trait + "\n");
        }
        return sb.toString();
    }
}
