
import java.util.*;

public class constructor {

     public int value1;
     public String value2;

     public constructor(int value1, String value2) {
          this.value1 = value1;
          this.value2 = value2;
     }

     public int getage() {
          return value1;
     }

     public String getname() {
          return value2;
     }

     public static void main(String[] args)

     {
          Scanner sc = new Scanner(System.in);

          int value1 = sc.nextInt();
          System.out.println("enter age:");

          String vlaue2 = sc.nextLine();
          System.out.println("enter name :");

          constructor c = new constructor(value1, vlaue2);

          System.out.println(c.getage());
          System.out.println(c.getname());

     }
}
