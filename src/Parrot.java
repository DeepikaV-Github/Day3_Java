public  class Parrot extends Bird{
    public Parrot(String name){
        super(name);
    }
    public void makeNoise(){
        System.out.println( getName()+" making noise");
    }
    @Override
    public void fly(){
        System.out.println( getName()+" can fly");
    }
}
