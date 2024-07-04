public class L_absstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.eat();
        h.walk();
        chicken c = new chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);

    }
}
abstract class animal{
    String color;
    animal(){
        color = "green";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends animal{
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class chicken extends animal{
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}