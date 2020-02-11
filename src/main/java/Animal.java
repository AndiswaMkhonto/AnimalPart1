public class Animal {
    private String name;
    public Animal() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void sound(){

    }
    public  void eat(){
        System.out.println(name+ " eats");
    }
}
