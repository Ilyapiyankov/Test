package Test.Е08112022;

import Test.Е08112022.modules.Animal;
import Test.Е08112022.services.AnimalHospital;

import java.sql.Time;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var dog = new Animal("Jack", "Bob", "dog");

        Animal bobsDog2 = new Animal("JJ ak", "Bob", "dog");

        bobsDog2.printInfo();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(bobsDog2);

        AnimalHospital hospital = new AnimalHospital(animals);

        Time time = new Time(12,30,5);

        hospital.addVisit(time);

        time = new Time(14,56,45);

        hospital.addVisit(time);

        hospital.PrintVisitHistory();

    }
}