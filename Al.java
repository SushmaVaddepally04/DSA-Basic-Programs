
import java.util.*;
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [name=" + name + ",age=" + age +"  ]";
    }

   
    public int compareTo(Student that) {
        if(this.name.charAt(0) > that.name.charAt(0)){
            return 1;
        }
        else{
            return -1;
        }
    }

    
    
}



public class Al {
    public static void main(String[] args) {
        Comparator<Student> c=(Student i,Student j)->{
                return (i.age>j.age)? 1: -1;
            };
        
        List<Student> list=new ArrayList<Student>();
        list.add(new Student(18,"Krish"));
        list.add(new Student(21,"Roopa"));
        list.add(new Student(71,"Nani"));
        list.add(new Student(67,"Sony"));
        list.add(new Student(34,"Vani"));
        Collections.sort(list,c);
        //System.out.println(list);
        for(Student s:list){
            System.out.println(s.name+" "+s.age);
        }



        // Map<String,Integer> nums=new HashMap<String,Integer>();
        // nums.put("s",19);
        // nums.put("v",32);
        // nums.put("s",89);
        // nums.put("k",78);
        // nums.put("f",56);
        // for(String s:nums.keySet()){
        //     System.out.println(s+" : "+nums.get(s));
        // }
    }
}
