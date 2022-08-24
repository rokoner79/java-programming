package methodoverloading;
class overload{
    void add(double a,double b){
        System.out.println(a+b);
    }

    void add(double a ,double b ,double c){
        System.out.println(a+b+c);
    }
}
public class methodoverloading {

    public static void main(String[] args) {
        overload ob= new overload();
        ob.add(6,7);
        ob.add(6,7,8);
        System.out.print("Rokon");
    }
    
}
