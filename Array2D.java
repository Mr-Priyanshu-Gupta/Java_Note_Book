
public class Array2D {
  public static void main(String[] args) {

    String[] fruits = {"apple","orange","strawberry"};
    String[] fal = {"sabe","santra","strawberry"};
    String[] vege = {"potato","tomato","onion"};

    String[][] grocessary = {fruits,fal,vege};

    for(String[] foods : grocessary){
      for(String food : foods){
    System.out.print(food+" ");
      }
      System.out.println();
  }
}
}
