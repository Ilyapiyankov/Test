package Test.Е08112022.services;

import Test.Е08112022.modules.Animal;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class AnimalHospital {
    private ArrayList<Animal> animals;
    private ArrayList<Time> visits;

    public AnimalHospital(ArrayList<Animal> animals, ArrayList<Time> visits){

        this.animals = animals;
        this.visits = visits;

    }

    public AnimalHospital(ArrayList<Animal> animals){

        this.animals = animals;
        visits = new ArrayList<>();

    }

    public AnimalHospital(AnimalHospital hospital){
        this.animals = hospital.animals;
        this.visits = hospital.visits;
    }

    public void addVisit(Time visit){
        visits.add(visit);
    }

    public void PrintVisitHistory(){

        System.out.println("Журнал:\n----------------------------------");

        for (int i = 0; i <= visits.size()-1; i++) {
            System.out.println(visits.get(i));
        }

        System.out.println("----------------------------------");

    }

}
