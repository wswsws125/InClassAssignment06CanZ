package com.example.wswsw.inclassassignment06_canz;

import java.io.Serializable;

public class Animal implements Serializable {
    String name;
    int age;
    String color;
    boolean isAmphibian;

    public Animal() {
    }

    public Animal(String name, int age, String color, boolean isAmphibian) {
        this.name=name;
        this.age=age;
        this.color=color;
        this.isAmphibian=isAmphibian;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public boolean getIsAmphibian(){
        return isAmphibian;
    }

    public void setIsAmphibian(boolean newIsAmphibian) {
        this.isAmphibian = newIsAmphibian;
    }

    public String toString() {
        return "Animal Name: "+ name+
                "\nAge: "+age+
                "\nColor: "+color+
                "\nIs Amphibian? "+ isAmphibian;
    }

}
