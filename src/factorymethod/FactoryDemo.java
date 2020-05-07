package factorymethod;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        Animals animals1 = factoryMethod.getAnimal("Feline");
        System.out.println("animals1 sound like : " +animals1.makeSound());
        Animals animals2 = factoryMethod.getAnimal("Canine");
        System.out.println("animals2 sound like : " + animals2.makeSound());
    }


}
