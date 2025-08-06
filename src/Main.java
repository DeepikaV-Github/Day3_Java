//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal bat=new Bat("Bruice Bat");
        bat.makeNoise();
//        Animal a=new Animal();
//        Animal horse=new Animal("Kettle");
//        a.setName("monkey");
//        System.out.println("From getter: " + a.getName());
//        a.sleep();
//        a.eat();;
//        a.roam();
//        a.makeNoise();
//        horse.roam();

        Animal an=new Cat("billi");
        an.makeNoise();
        Cat c=(Cat)an;
        c.jump();

        AnimalUtils animalUtils=new AnimalUtils();
//        animalUtils.addAnimal(a);
//        a.sleep();
        Cat cat=new Cat("billi");
        Dog dog=new Dog("Tommy");
        animalUtils.addAnimal(cat);
        animalUtils.addAnimal(dog);

        Bird parrot=new Parrot("Puttu Parrot");
        parrot.fly();
        Bird Os=new Ostrich("oval Ostrich");
        Os.fly();

    }
}