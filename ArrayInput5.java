
import java.util.Scanner;
public class ArrayInput5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String [] foods;
    int Size;

    System.out.print("What # food Item You Want? : ");

    Size = sc.nextInt();
    sc.nextLine();//this is use to empty the buffer

    foods = new String[Size];

    for(int i=0 ; i < foods.length; i++){
      System.out.print("Enter Food Name : ");
      foods[i] = sc.nextLine();
    }

    System.out.println(" ");
    System.out.println("Food Names");
    for(String food : foods){
    System.out.println(food);
    }

    sc.close();

  }
}
