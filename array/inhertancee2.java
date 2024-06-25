public class inhertancee2 {
    public static void main(String[] args) {
        dogs shubham = new dogs();
        shubham.eat();
    }
    
}
class animal {
    String color;
    void eat(){
        System.out.println("its a carbiborus ");
    }
    void right(){
        System.out.println("having no right ");
    }
}
class human extends animal{
    void legs(){
        System.out.println("having the 4 lefs ");
    }
}
class dogs extends human{
    void toung(){
        System.out.println("having the big tounge");
    }
}