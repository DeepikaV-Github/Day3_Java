public class Dog extends Animal {
    public Dog() {
        super();
    }
    public Dog(String name) {
        super(name);
    }
    public void swim(){
        System.out.println( getName()+ " is Swimming");
    }
}
