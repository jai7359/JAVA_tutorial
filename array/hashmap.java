import java.util.HashMap;

public class hashmap {
public static void main(String[] args) {
    //create
    HashMap<String,Integer> hm = new HashMap<>();
    // insert
    hm.put("india",100);
    hm.put("pakistan",90);
    hm.put("klalam",899);

    // System.out.println(hm);
    // // get key
    // int population = hm.get("india");
    // System.out.println(population);
    // //containskey
    // System.out.println(hm.containsKey("india"));
    //remove key
    hm.remove("india");
    System.out.println(hm);
    //size
    System.out.println(hm.size());
    //is empty
    System.out.println(hm.isEmpty());
    //clear
    hm.clear();
    System.out.println(hm);
}
    
}
