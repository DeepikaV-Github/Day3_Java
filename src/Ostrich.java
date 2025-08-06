public class Ostrich extends Bird{
    public Ostrich(String name){
        super(name);
    }
    public void makeNoise(){
        System.out.println( getName()+" making noise");
    }
    @Override
    public void fly(){
        System.out.println( getName()+" cannot fly");
    }
}
