/**
 * encapsulation
 */

public class encapsulation {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "jai";
    System.out.println(s1.name);
  }
}
class Student{
  int roll;
  String name;
  private void getname(){
   this.name = name;
    this.roll = roll;
  }
  Student(){
    System.out.println("countructor is called...");
  }
  Student(String name){
    this.name = name ;
  }
  Student(int roll){
    this.roll = roll;
  }

}