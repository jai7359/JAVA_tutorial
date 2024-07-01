//linear search 
public class array_praactise {
public static void main(String[] args) {
    int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int key = 9;
    int index = linser(key, num);
    if (index == -1){
        System.out.println("the key is not in the array");
    }else{System.out.println("the key is at index "+index);}
}
public static int linser(int key, int num[]) {
    for (int i = 0; i < num.length; i++) {
        if(num[i] == key){
            return i;
        }
    }
    return -1;
}
    
}