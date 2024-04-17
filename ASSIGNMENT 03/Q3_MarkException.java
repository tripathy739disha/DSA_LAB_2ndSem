import java.util.*;
public class Student{
    public static void main(String[] args) {
        String name;
        double marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your marks: ");
        marks = sc.nextDouble();
        try{
            if(marks>100)
                throw new MarksOutOfBoundsException("marks should be less than 100");
            System.out.println(name+" has got "+marks);
        }
        catch(MarksOutOfBoundsException r){
            System.out.println(r);
        }


    }
}
class MarksOutOfBoundsException extends Exception {
     MarksOutOfBoundsException(String msg) {
         super(msg);
     }
    }



