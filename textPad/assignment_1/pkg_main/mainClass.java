package pkg_main;
import java.util.Scanner;
import pkg_1.*;
import pkg_2.*;
/**
 *
 * @author Zulkar Nine
 */
public class mainClass {
    public static void main(String[] args) {
     String name;
     int id,batch;
     float cgpa;
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter your name");
            name = scanner.nextLine();

            System.out.println("enter your id");
            id = scanner.nextInt();

            System.out.println("enter your batch");
            batch = scanner.nextInt();

            System.out.println("enter your cgpa");
            cgpa = scanner.nextFloat();


            System.out.println("Given Deatils are");
            System.out.println("\n");


        classA objectA=new classA();
        classB objectB=new classB();

       objectA.displayA(name,id);
       objectB.displayB(batch,cgpa);

    }
}
