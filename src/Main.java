public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); //output "bark"
        cat.makeSound(); //output "meow"

        dog.eat("Rabbit");
        cat.eat("Fish");


    }
}