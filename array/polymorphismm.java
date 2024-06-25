// public class polymorphismm {
// public static void main(String[] args) {
//     calculator calx = new calculator();
//     System.out.println(calx.sum(1,5));
//     System.out.println(calx.sum((float) 1.3,(float) 5.6));
//     System.out.println(calx.sum(1,2,3));
// }
    
// }
// class calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a + b;
//     }
//     int sum(int a ,int b,int c){
//         return a+b+c;
//     }
// }



// method ridding 
/**
 * polymorphismm
 */
public class polymorphismm {
public static void main(String[] args) {
    deer d = new deer();
   d.eat();
}
}
class animal {
    void eat(){
        System.out.println("eats anythinf ");
    }
}
class deer extends animal {
    void eat(){
        System.out.println("eats grass");
    }
}