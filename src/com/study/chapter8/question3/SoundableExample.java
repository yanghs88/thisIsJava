package com.study.chapter8.question3;

public class SoundableExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        printSound(dog);
        printSound(cat);
    }

    private static void printSound(Soundable soundable)
    {
        if(soundable instanceof Cat) {
            System.out.println(((Cat) soundable).favoriteFood());
        }
        else if(soundable instanceof Dog) {
            System.out.println(((Dog) soundable).favoriteFood());
        }

        System.out.println(soundable.sound());
    }
}
