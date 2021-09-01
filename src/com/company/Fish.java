package com.company;

public class Fish extends Animal {

	public Fish(String name, boolean isEating) {
		super(name, "Cordado", "Fish", isEating);
	}

	@Override
	public void locomover() {
		System.out.println(this.getName() + " is swimming with Aquaman.");
	}

	@Override
	public void speak() {
		System.out.println(this.getName() + ": *glub* *glub* *glub*");
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
