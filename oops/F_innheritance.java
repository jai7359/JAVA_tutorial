public class innheritance {
public static void main(String[] args) {
    fish shark = new fish();
    shark.eat();
    shark.swim();


}
}
class animal{
    String color ;
     void eat(){
        System.out.println("eats");
    }
    void breadth(){
        System.out.println("breadth");
    }
}
class fish extends animal{
    int fins ;
    void swim(){
        System.out.println("swims in the water");
    }
}