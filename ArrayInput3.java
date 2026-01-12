
import java.util.Scanner;
public class ArrayInput3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String [] foods = new String[3];

    for(int i=0 ; i < foods.length; i++){
      System.out.println("Enter Food Name");
      foods[i] = sc.nextLine();
    }
    
    System.out.println("Food Names");
    for(String food : foods){
    System.out.println(food);
    }

    sc.close();

  }
}
