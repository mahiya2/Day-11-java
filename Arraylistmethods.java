import java.util.*;
public class Arraylistmethods{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(989);
        a.add(89);
        a.add(1);
        a.add(78);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}