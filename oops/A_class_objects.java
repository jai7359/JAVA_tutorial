/**
 * ppop
 */
public class ppop {
public static void main(String[] args) {
    pen p1 = new pen();
    p1.setcolor("blue");
    System.out.println(p1.color);
    pen p2 = new pen();
    p2.setnumber(23);
    System.out.println(p2.number);
}
}
class pen{
    String color ;
    int number; 
    void setcolor(String newcolor){
        color = newcolor ;
    }
    void setnumber(int newno){
        number = newno;
    }
}