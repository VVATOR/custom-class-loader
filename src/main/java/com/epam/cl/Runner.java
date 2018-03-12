package com.epam.cl;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Animal animal = new Cat();
		animal.play();

		MyClassloader loader = new MyClassloader();
		Class clazz = loader.findClass("Dog");

		Animal a = (Animal) clazz.newInstance();

		// List<Animal> animals = new ArrayList();

		// animals.add(a);

		a.voice();

	}

}
