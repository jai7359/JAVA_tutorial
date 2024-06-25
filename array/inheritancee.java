public class inheritancee {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breadth");
    }
}
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("can swim ");
    }
}