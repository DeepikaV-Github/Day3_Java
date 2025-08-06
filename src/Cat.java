public class Cat extends Animal{

    public Cat(){
        super();
    }
    public Cat(String name){
        super(name);
    }
//        public void sleep() {
//        System.out.println("Animal is sleeping");
//    }
//    public abstract void eat();
//    public abstract void makeNoise();
//    public abstract void roam();
    public void jump(){
        System.out.println( getName()+ " is jumping");
    }
    @Override
    public void makeNoise(){
        System.out.println(getName() + " is making noise");
    }
}
