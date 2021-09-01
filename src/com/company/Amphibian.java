package com.company;

public class Amphibian extends Animal {

	public Amphibian(String name, boolean isEating) {
		super(name, "Cordado", "Amphibian", isEating);
	}

	@Override
	public void locomover() {
		System.out.println(this.getName() + " is jumping with Saci Perere.");
	}

	@Override
	public void speak() {
		System.out.println(this.getName() + ": *rabt* *rabt* *rabt*");
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
