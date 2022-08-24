
package polymorphism2;
public class Polymorphism2 {
    public static void main(String[] args) {
      person p=new person();
      p.display();
      p=new teacher(); // HERE P IS REFERRENCE VARIABLE
      p.display();
      p=new student();
      p.display();
    }
    
}

