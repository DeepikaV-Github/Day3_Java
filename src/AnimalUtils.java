public class AnimalUtils {
    public void addAnimal(Animal a){
        System.out.println("Animal " + a.getName()+ " is added");

        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.jump();
        }
        else if(a instanceof Dog){
            Dog d=(Dog)a;
            d.swim();
        }
    }
}


