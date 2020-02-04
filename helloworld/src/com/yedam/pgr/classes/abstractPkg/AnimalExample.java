package com.yedam.pgr.classes.abstractPkg;

public class AnimalExample {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();
		
		Dog dog = new Dog();
		dog.sound();
		dog.breathe();
		
		Animal animal = null;
		animal = cat;
		animal.sound();
		
		animal = dog;
		animal.sound();
		System.out.println("===============");
		animalsound(cat);
		animalsound(dog);
	}
static void animalsound(Animal animal) {
	animal.sound();
}
}
