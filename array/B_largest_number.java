import java.util.*;

public class B_largest_number {
public static int get_largest(int num[]) {
int largest = Integer.MIN_VALUE;
for (int i = 0; i < num.length; i++) {
    if(largest < num[i]){
        largest = num[i];
    }
    
}
    return largest;
}
    public static void main(String[] args) {
        int num[] = {4,5,556,9,54654,4564654,4514561,514,5641,145454154,5465314};
        System.out.println("the largest number is "+ get_largest(num));
    }
}