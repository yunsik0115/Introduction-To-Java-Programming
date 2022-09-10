package Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getBrain() {
        return super.getBrain();
    }

    @Override
    public void setBrain(int brain) {
        super.setBrain(brain);
    }

    @Override
    public int getBody() {
        return super.getBody();
    }

    @Override
    public void setBody(int body) {
        super.setBody(body);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
