public class Dog extends Animal {
    public Dog() {
        super();
    }
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeNoise(){
        System.out.println(getName()+ " is making noise");
    }
    public void swim(){
        System.out.println( getName()+ " is Swimming");
    }
}
