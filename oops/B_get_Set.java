/**
 * ppop
 */
public class get_Set {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        pen p2 = new pen();
        p2.setnumber(23);
        System.out.println(p2.getnumber());
    }
    }
    class pen{
        private String color ;
        private int number; 
        String getcolor(){
            return this.color;
        }
        int getnumber(){
            return this.number;
        }
        void setcolor(String newcolor){
            color = newcolor ;
        }
        void setnumber(int newno){
            number = newno;
        }
    }