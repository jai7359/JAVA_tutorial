// (2,4),(2,6),(2,8)
// (4,6)(4,8)
// (6,8)
public class E_pair_an_array {
    public static void pairs(int num[]) {
        for (int i = 0; i < num.length; i++) {
            // int curr = num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        pairs(num);
    }
}
