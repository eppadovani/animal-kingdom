package com.company;

public class Mammal extends Animal {

	public Mammal(String name, boolean isEating) {
		super(name, "Cordado", "Mammal", isEating);
	}

	@Override
	public void locomover() {
		System.out.println(this.getName() + " is walking with Padovan.");
	}

	@Override
	public void speak() {
		System.out.println(this.getName() + ": *777* *777* *777*");
	}

	@Override
	public void info() {
		System.out.println("Name: " + this.getName());
		System.out.println("Filo: " + this.getFilo());
		System.out.println("Category: " + this.getCategory());
		this.locomover();
		this.speak();

		if(isEating()) {
			System.out.println("*Nham* *Nham*");
		} else {
			System.out.println("Not hungry bro!");
		}
	}


}
