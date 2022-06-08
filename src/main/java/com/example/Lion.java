package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) {
        this.feline = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    // объект Predator — поле класса Lion
//    private Predator predator;

    // Объект Feline передаётся в конструтор. Он создан извне. Объект попадает в переменную класса Lion.
//    public Lion(Predator predator) {
//        this.predator = predator;
//    }

    public int getKittens() {
        // объект класса Feline используют, чтобы получить количество котят
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
