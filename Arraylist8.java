import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Arraylist8 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> fruits = new ArrayList<String>();
    System.out.print("Enter # fruits you want : ");
    int numoffruits = sc.nextInt();
    sc.nextLine();

    for(int i=0 ; i<numoffruits; i++ ){
        System.out.print("Enter Fruit Name  " +i+ " : ");
      String fruit = sc.nextLine();
      fruits.add(fruit);
      System.out.println();
    }
   
      System.out.println(fruits);  

    sc.close();
  }
}
