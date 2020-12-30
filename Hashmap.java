import java.util.HashMap;
import java.util.Map;
public class Hashmap{
   public static void main(String args[]){
   int head=0;
   int tail=0;
   HashMap<Integer,String>map=new HashMap<Integer,String>();
   for(int i=0;i<6;i++)
   {
      double a=Math.floor(Math.random()*10)%2;
      if(a==1)
      {
         head+=1;
      }
      else
      {
         tail+=1;
      }
   }
   System.out.println("head:" + head + "Tail:" + tail);
   map.put(+head,"head");
   map.put(+tail,"tail");
   for(Map.Entry m:map.entrySet())
   {
      System.out.println(m.getKey()+""+m.getValue());
   }
}
}
