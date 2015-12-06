package com.factoryPattern.example1;

public class SampleFactoryTestMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetFactory petFactory = new PetFactory();
		Pet pet = petFactory.getPet("Meaw");
		System.out.println(pet.petSound());
	}

}
