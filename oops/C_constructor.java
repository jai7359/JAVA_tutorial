/**
 * constructor
 */
public class constructor {

    public static void main(String[] args) {
        student s1 = new student();

    }
}
class student{
    String name ;
    int roll;
    student(){
        System.out.println("constuctor is call....");
    }
}