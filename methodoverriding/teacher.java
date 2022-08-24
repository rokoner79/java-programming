
package methodoverriding;
public class teacher extends person {
    String qualification;
   void displayinfo() 
   {
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       System.out.println("qualification:"+qualification);
   }
}