//static key word

// public class N_static_super {
//     public static void main(String[] args) {
//         student s1 = new student();
//         s1.schollname = "jmv";
//         student s2 = new student ();
//         System.out.println(s2.schollname);
//     }
// }

// class student{
//     String name ;
//     int roll;
//     static String schollname;
//     void setName(String name){
//         this.name = name ;
//     }
//     String getname(){
//         return this.name ;
//     }
// }


// super keyword

public class N_static_super {

    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color);
    }
}
class animal{
    String color;
    animal(){
        System.out.println("animal constructor is call.....");
    }
}
class horse extends animal{
    horse(){
        super.color = "brown";
        System.out.println("horse constructor is call...");
    }

}

