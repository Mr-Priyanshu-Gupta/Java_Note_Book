
public class Array2D1 {
  public static void main(String[] args) {

    String[][] grocessary = {{"Apple","orange","strawberry"},
                             {"sabe","santra","strawberry"},
                             {"potato","tomato","onion"}};

    for(String[] foods : grocessary){
      for(String food : foods){
    System.out.print(food+" ");
      }
      System.out.println();
  }
}
}
