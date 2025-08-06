public abstract class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    public  void eat(){
        System.out.println("Animal is eating");
    };
    public abstract void makeNoise();
    public void roam(){
        System.out.println("Animal is roaming");
    };

}
