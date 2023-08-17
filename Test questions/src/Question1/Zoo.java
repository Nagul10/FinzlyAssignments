package Question1;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal giraffe = new Giraffe();

        lion.makeSound();
        giraffe.makeSound();
        elephant.makeSound();
    }
}
