public class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    boolean eat(String foodType) {
        return true;
    }

    void showMood(boolean glad) {
        if(glad) {
            System.out.println("Logrer");
        }
        else {
            System.out.println("Knurrer");
        }
    }
}

