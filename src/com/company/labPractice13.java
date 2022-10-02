package com.company;

class TypeAnimals implements AnimalCow, AnimalLion, AnimalEagle{
    public void animalTypeCow(){
        System.out.println("Cow is a Herbivorous ");
    }
    public void numberOfLegsCow(){
        int legs = 4;
        System.out.println("Number of Legs : " + legs);
    }
    public void animalTypeLion(){
        System.out.println("Lion is a Carnivorous ");
    }
    public void numberOfLegsLion(){
        int legs = 4;
        System.out.println("Number of Legs : " + legs);
    }
    public void animalTypeEagle(){
        System.out.println("Eagle is a Carnivorous ");
    }
    public void numberOfLegsEagle(){
        int legs = 2;
        System.out.println("Number of Legs : " + legs);
    }

}
public class labPractice13 {
    public static void main(String[] args) {
        // Program to Demonstrate on Multiple Inheritance
        TypeAnimals ta = new TypeAnimals();
        ta.animalTypeCow();
        ta.numberOfLegsCow();
        ta.animalTypeLion();
        ta.numberOfLegsLion();
        ta.animalTypeEagle();
        ta.numberOfLegsEagle();
    }
}
