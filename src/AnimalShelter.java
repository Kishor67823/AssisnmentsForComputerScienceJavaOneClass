interface AdoptableAnimal{
    String getName();
    String getDescription();
    double getPrice();

}

class Cat implements AdoptableAnimal{
    String name;
    String description;
    double price;

    public Cat(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price=price;
    }
    @Override
    public String getDescription(){
        return this.description;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public double getPrice(){
        return this.price;
    }


}

abstract class Dog implements AdoptableAnimal{
    String name;
    String description;
    double price;
    public Dog(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price=price;
    }
    @Override
    public String getDescription(){
        return this.description;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public double getPrice(){
        return this.price;
    }

    public abstract String getBreed();

}
class pitbull extends Dog{
    public pitbull(String name, String description, double price){
        super (name, description, price);
    }

    public String getBreed(){
        String nameOfDog= "pitbull";
        return nameOfDog;
    }


}
class goldenRetriever extends Dog{
    public goldenRetriever(String name, String description, double price){
        super (name, description, price);
    }
    public String getBreed(){
        String nameOfDog= "golden Retriever";
        return nameOfDog;
    }
}

class Main {
    public static void main(String args[]) {
        AdoptableAnimal[] animals = new AdoptableAnimal[] {
                new Cat("Billy", "He sucks", 200000),
                new Cat("Not Billy", "Way better than billy", 2),
                new goldenRetriever("Jimbo", "Wow!", 200),
                new pitbull("Rough", "The best", 20)
        };

        for (AdoptableAnimal animal : animals) {
            String animalType;
            if (animal instanceof Cat) {
                animalType = "cat";
            } else {
                animalType = "dog";
            }
            System.out.println("Adopting out a " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nThey cost " + animal.getPrice()
                    + "\nOur staff describes them thusly: " + animal.getDescription());

            if (animal instanceof Dog) {
                System.out.println("The dog's breed is " + ((Dog) animal).getBreed());
            }
        }
    }
}


