
import java.util.Scanner;
public class ArraySearch2 {
  public static void main(String[] args) {

   String[] fruits = {"Apple","Orange","Coconut","Banana"};
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter Fruit Name : ");
   String target = sc.nextLine();

   boolean isFound = false;
   
    for(String fruit : fruits){
      if(fruit.equals(target)){
        System.out.println("fruit is found :" + fruit);
         isFound = true;
         break;
      }
    }   

    if(!isFound){
    System.out.println("Element Not Found");
   }
  }
}
