record A (int id,String name) { }
class Main{
    public static void main(String[] args) {
        A obj1=new A(1,"Sony");
        A obj2=new A(2,"Nani");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj2.equals(obj1)); 
    }
}