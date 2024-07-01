/**
 * F_sub_array
 */
public class F_sub_array {

    public static void pair(int num[]) {
        int first = 0 , end = num.length-1;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k<= j; k++) {
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] ={2,4,6,8,10};
        pair(num);
    }
}