public class I_methodoverloading {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float) 1.9,(float)2.5));
        System.out.println(cal.sum(3,6,9));
    }
    
}
class calculator {
    int sum(int a ,int b){
        return a+b;
    }
    float sum(float a ,float b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}