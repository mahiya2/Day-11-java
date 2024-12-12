import java.util.*;
public class Twopointertechniqueusingarraylistcollection{
    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(989);
        a.add(89);
        a.add(908);
        a.add(900);
        int l=0;
        int r=a.size()-1;
        while(l<r)
        {
           int temp=a.get(l);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
    }
}