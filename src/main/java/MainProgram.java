public class MainProgram {
    public static void main(String args[]){
        Home home = new Home();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        cat.setName("Stormy");
        dog.setName("Rax");

        cat.eat();
        cat.sound();
        dog.eat();
        dog.sound();

        System.out.println("...............................................");


        home.makeAllSounds();
        home.adoptPet(dog);
        home.makeAllSounds();

        home.adoptPet(cat);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();


  }
    }

