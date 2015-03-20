import java.util.ArrayList;
public class dragonDriver{
   public static void main (String [] args){
       
      ArrayList<Dragon> list = new ArrayList<Dragon>();
      
      Dragon dr1= new Dragon();
      dr1.setColor("Black");
      Dragon dr2= new Dragon ("White",false,200,40.0);
      dr2.addHealth(20);
      Dragon dr3= new Dragon ();
      dr3.addLength(5);
      
      list.add(dr1);
      list.add(dr2);
      list.add(dr3);
      
      for(Dragon d: list){
         System.out.println(d);
      }
      
      
   }

}