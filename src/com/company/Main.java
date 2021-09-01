package com.company;

public class Main {

    public static void main(String[] args) {
        Mammal donkey = new Mammal("Louis Marcel", true);
        donkey.info();

        System.out.println();

        Reptile cobr = new Reptile("InkSnak", false);
        cobr.info();

        System.out.println();

        Birds passar = new Birds("Piriquit", true);
        passar.info();

        System.out.println();

        Fish nem = new Fish("Nem", true);
        nem.info();

        System.out.println();

        Amphibian polwag = new Amphibian("Polwag", false);
        polwag.info();
    }
}
