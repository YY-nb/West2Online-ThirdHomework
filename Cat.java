public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, double price) {
        super(name, price);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
