package com.company;

public class Reptile extends Animal {

	public Reptile(String name, boolean isEating) {
		super(name, "Cordado", "Reptile", isEating);
	}

	@Override
	public void locomover() {
		System.out.println(this.getName() + " is crawling with Cobr Bandid.");
	}

	@Override
	public void speak() {
		System.out.println(this.getName() + ": *ssss* *ssss* *ssss*");
	}

	@Override
	public boolean isEating() {
		return false;
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
