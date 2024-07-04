/**
 * M_interfacce
 */
public class M_interfacce {
public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
}
    
}
interface cheesplayer{
    void moves();
}
class Queen implements cheesplayer{
    public void moves(){
        System.out.println("up,down,l,r,diagonal in all 4 diresction");
    }
}
class rook implements cheesplayer{
    public void moves(){
        System.out.println("up,down");

    }
}
class king implements cheesplayer{
    public void moves(){
        System.out.println("l,r,up");
    }
}