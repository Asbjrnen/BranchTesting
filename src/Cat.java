public class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
    boolean eat(String foodType){
        return true;
    }
    void showMood(boolean glad){
        if (glad){
            System.out.println("Spinder");
        }
        else{
            System.out.println("hvæser");
        }
    }

    void jump(double distance) {
        System.out.println("Cat jumps " + distance + " meters");
    }
}
