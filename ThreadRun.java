public class ThreadRun {
    public static void main(String[] args) {
        Runnable obj1=()->{
                for(int i=0;i<5;i++){
                    try {
                        System.out.println("hii");
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }
            
        };
        Runnable obj2=()->{
                for(int i=0;i<5;i++){
                    try {
                        System.out.println("sony");
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                    }
                }
            
        };
        Thread t1=new Thread(obj1);
        t1.start();
        Thread t2=new Thread(obj2);
        t2.start();
    }
}
