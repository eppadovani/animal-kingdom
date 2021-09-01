package com.company;

public class Birds extends Animal {

	public Birds(String name, boolean isEating) {
		super(name, "Cordado", "Birds", isEating);
	}

	@Override
	public void locomover() {
		System.out.println(this.getName() + " is flying with Superman.");
	}

	@Override
	public void speak() {
		System.out.println(this.getName() + ": *piu* *piu* *piu*");
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
