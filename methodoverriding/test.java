
package methodoverriding;
public class test {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.name="Rokon";
        t.age=23;
        t.qualification="BSc in CSE";
        t.displayinfo();
        person p=new person();
        p.name="R";
        p.age=23;
        
        p.displayinfo();
    }
}

