package factorymethod;

public class FactoryMethod {
    public Animals getAnimal(String type){
        if("Canine".equals(type)){
            return new Dog();
        }else return new Cat();
    }
}
