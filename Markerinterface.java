interface printable{
    }
    class h implements printable{
        public void print(){
            System.out.println("hello studenta");
        }
    }
    public class Markerinterface{
        public static void main(String args[]){
            h f=new h();
            f.print();
        }
    }