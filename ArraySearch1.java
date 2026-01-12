
import java.util.Scanner;
public class ArraySearch1 {
  public static void main(String[] args) {

   int[] number = {1,9,3,8,2,5,4};
   int target = 7;
   boolean isFound = false;

   for(int i=0 ; i < number.length; i++){
    if(target == number[i]){
      System.out.println("Element Found at Index : " + i);
      isFound = true;
      break;
    }
   } 
    if(!isFound){
    System.out.println("Element Not Found");
   }
  }
}
