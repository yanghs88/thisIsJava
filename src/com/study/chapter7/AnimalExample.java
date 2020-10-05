package com.study.chapter7;

public class AnimalExample {
    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.sound();
//
//        Cat cat = new Cat();
//        cat.sound();

        //변수의 자동 타입 변환 (promotion)
        Animal animal = null;
        animal = new Dog();
        animalSound(animal);

        animal = new Cat();
        animalSound(animal);

    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
