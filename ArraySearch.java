
import java.util.Scanner;
public class ArraySearch {
  public static void main(String[] args) {

   int[] number = {1,9,3,8,2,5,4};
   int target = 4;

   for(int i=0 ; i < number.length; i++){
    if(target == number[i]){
      System.out.println("Element Found at Index : " + i);
      break;
    }
   } 

  }
}
