public class multi_level_inher {
    public static void main(String[] args) {
    dog doggy = new dog();
    doggy.eat();
    doggy.legs();

    
    
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
    class dog extends animal{
        void legs(){
            System.out.println("having 4 legs");
        }
    }