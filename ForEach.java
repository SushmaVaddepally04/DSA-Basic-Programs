import java.util.*;
import java.util.stream.Stream;
public class ForEach {
   public static void main(String[] args) {
      List<Integer> nums=new ArrayList<Integer>();
       nums.add(13);
       nums.add(7);
       nums.add(19);
       nums.add(80);
       nums.add(12);
       nums.add(37);
       nums.add(19);
       nums.add(8);
    //    Stream<Integer> s1=nums.stream();
    //    Stream<Integer> s2=s1.filter(n->n%2==0);
    //    Stream<Integer> s3=s2.map(n->n*2);
    //    int result =s3.reduce(0,(c,e)->c+e);
    //    s2.forEach(n->System.out.println(n));
    //    System.out.println(result);
       
    // int res=nums.stream()
    //     .filter(n->n%2==0)
    //     .map(n->n*2)
    //     .reduce(5,(c,e)->c+e);
    //System.out.println(res);

       
    Stream<Integer> sortedValues=nums.stream()
            // .filter(n->n%2==0)
            .sorted();  
    sortedValues.forEach(n->System.out.println(n));    

       
        
        
       
         //nums.forEach(n ->System.out.println(n));




        // for(int x:nums){
        //     System.out.println(x);
        // }


        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
   } 
}
