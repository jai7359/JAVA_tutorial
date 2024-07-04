public class hiracchy {
    public static void main(String[] args) {
        fish polta = new fish();
        polta.swim();
        polta.eat();
        bird kabuttar = new bird();
        kabuttar.fly();
        mammal insan = new mammal();
        insan.eat();

    }
}
    class animal{
         void eat(){
            System.out.println("eats");
        }
        void breadth(){
            System.out.println("breadth");
        }
    }
    class fish extends animal{
        void swim(){
            System.out.println("swims in the water");
        }
    }
    class bird extends animal{
        void fly(){
            System.out.println("udde asman me udde");
        }
    }
    class mammal extends animal{
        void walk(){
            System.out.println("abhi tak jinda hu lekin ");
        }
    }