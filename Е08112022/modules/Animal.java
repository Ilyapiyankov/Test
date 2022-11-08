package Test.Е08112022.modules;

public class Animal {

    public final String name;
    public final String masterName;

    public final String animalType;

    public Animal(String name, String masterName, String animalType){

        this.name = name;
        this.masterName = masterName;
        this.animalType = animalType;

    }
    public Animal(Animal animal){

        this.name = animal.name;
        this.animalType = animal.animalType;
        this.masterName = animal.masterName;

    }

    public void printInfo(){
        System.out.printf(
                "Name: %s, master's name: %s, type of animal: %s",
                name,
                masterName,
                animalType
        );
    }

    @Override
    public String toString() {

        String res = String.format(
                "Name: %s, master's name: %s, type of animal: %s",
                name,
                masterName,
                animalType
        );

        return  res;
    }
}
