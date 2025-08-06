public class AnimalUtils {
    public void addAnimal(Animal a){
        System.out.println("Animal " + a.getName()+ " is added");

        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.jump();
        }
    }
}


