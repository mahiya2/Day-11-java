abstract interface math{
    void print();
}
class d implements math{
    //@overriding
    public void print(){
        System.out.println("hello");
    }
}
public class Abstractinterface{
    public static void main(String args[]){
        d f=new d();
        f.print();
    }
}