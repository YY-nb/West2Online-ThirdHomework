public abstract class Animal {
    protected String name;
    protected double price;
    public Animal(){}

    public Animal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public abstract void eat();
    public boolean equals(Animal animal){
        if((this.getName().equals(animal.getName()))&&(this.getPrice()==animal.getPrice())){
            return true;
        }
        return false;

    }
}
