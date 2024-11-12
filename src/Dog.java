public class Dog extends Animal implements Runnable
{
    @Override
    public void makeSound() {
        System.out.println("Bark bark");
    }
    @Override
    public void eat() {
        System.out.println("Eat bone");
    }
    @Override
    public void run() {
        System.out.println("Runs at 20 kmph");
    }
}