public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); //output "bark"
        cat.makeSound(); //output "meow"

        dog.eat("Rabbit");
        cat.eat("Fish");


        dog.showMood(true);
        dog.showMood(false);

        cat.showMood(true);
        cat.showMood(false);

        System.out.println("Hello World!");
    }
}