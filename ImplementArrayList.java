import ArrayList.*;
 
public class ImplementArrayList
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
 
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
         
        list.remove(2);
        System.out.println(list);
         
        
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );

 
        //List Size
        System.out.println(list.size());
    }
}