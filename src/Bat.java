public class Bat extends Animal{
    public Bat() {
        super();
    }

    public Bat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is making noise");
    }

}
