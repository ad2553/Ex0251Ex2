public class Bird extends Animal implements Flyable
{
    @Override
    public void makeSound() {
        System.out.println("chirp");
    }
    @Override
    public void eat() {
        System.out.println("Eating seeds");
    }
    @Override
    public void fly() {
        System.out.println("Flying at 30 kmph");
    }
}