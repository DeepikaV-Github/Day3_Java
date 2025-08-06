public class Bat extends Animal{
    public Bat() {
        super();
    }

    public Bat(String name) {
        super(name);
    }

//    @Override
//    public void eat() {
//        System.out.println(getName()+ " is eating");
//    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+ " is making noise");
    }

//    @Override
//    public void roam() {
//        System.out.println(getName()+ " is roaming");
//    }
}
