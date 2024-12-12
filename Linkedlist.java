import java.util.*;
public class Linkedlist{
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<>();
        a.add(567);
        a.add(789);
        a.add(900);
        System.out.println(a);
        a.addFirst(7);
        System.out.println(a);
        a.addLast(865567);
        System.out.println(a);
    }
}