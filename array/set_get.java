/**
 * oops
 */
public class set_get {
    public static void main(String[] args) {
        pen p1 = new pen(); // created a pen object called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(6);
        System.out.println(p1.tip);
    
        Bankacct myacc = new Bankacct();
        myacc.username = "jai";
        myacc.setpassword(9090);
    
    }
    }
    class Bankacct{
        public String username;
        private int password;
        public void setpassword(int pwd){
            password = pwd;
        }
    }
    class pen{
        String color;
        int tip;

        String getcolor(){
            return this.color;
        }
        int set
    }
