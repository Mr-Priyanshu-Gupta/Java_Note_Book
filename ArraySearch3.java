
import java.util.Scanner;
public class ArraySearch3 {
  public static void main(String[] args) {

   String[] fruits = {"Apple","Orange","Coconut","Banana"};
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter Fruit Name : ");
   String target = sc.nextLine();

   boolean isFound = false;
   
   int index = 0;
    for(String fruit : fruits){
      if(fruit.equals(target)){
        System.out.println("fruit is found :" + fruit);
        System.out.println("Fruit found at index: " + index);
         isFound = true;
         break;
      }
          index++;

    }   

    if(!isFound){
    System.out.println("Element Not Found");
   }
  }
}
