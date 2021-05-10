package com.classassignment10;

import java.util.Scanner;

public class Animal {
    private String SpeciesName;
    private int Population,Growth_Rate;
    Animal(String SpeciesName)
    {
        this.SpeciesName = SpeciesName;
    }
    Animal(String SpeciesName, int Population)
    {
        this.SpeciesName = SpeciesName;
        this.Population = Population;
    }
    Animal(String SpeciesName, int Population, int Growth_Rate)
    {
        this.SpeciesName = SpeciesName;
        this.Population = Population;
        this.Growth_Rate = Growth_Rate;
    }
    void Tostring() {
        if (check(Growth_Rate)) {
            System.out.println("The "+ SpeciesName+ " specie is endangered"+" with "+Growth_Rate+" and population of "+ Population);
        } else {
            System.out.println("The "+ SpeciesName+ " specie is safe"+" with "+Growth_Rate+" and population of "+ Population);
        }
    }
    int equal(int grow){
        this.Growth_Rate = grow;
        return (0);
    }
    static Boolean check(int Growth_Rate){
        if (Growth_Rate<0) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        // write your code here
        String name,situation;
        int population,growth;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the species name");
        name = scan.next();
        System.out.println("Enter the species population: ");
        population = scan.nextInt();
        System.out.println("Enter the species growth rate:");
        growth = scan.nextInt();
        Animal a1 = new Animal(name);
        Animal a2 = new Animal(name,population);
        Animal a3 = new Animal(name,population,growth);
        a1.check(growth);
        a2.check(growth);
        a3.check(growth);
        a1.Tostring();
        a2.Tostring();
        a3.Tostring();
    }
}
