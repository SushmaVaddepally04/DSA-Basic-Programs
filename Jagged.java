class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try {
                System.out.println("hii");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("sony");
            try {
                System.out.println("hii");
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}


public class Jagged {
   public static void main(String[] args) {
    Runnable obj1=new A();
    Runnable obj2=new B();
    Thread t1=new Thread(obj1);
    Thread t2=new Thread(obj2);
    t1.start();
    t2.start();
   }
}
