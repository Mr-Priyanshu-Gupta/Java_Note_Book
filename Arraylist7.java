import java.util.Collections;
import java.util.ArrayList;
public class Arraylist7 {
  public static void main(String[] args) {

    ArrayList<String> fruits = new ArrayList<String>();

    fruits.add("Mr.");
    fruits.add("Priyanshu");
    fruits.add("Gupta");

   
    Collections.sort(fruits);
    for(String fruit : fruits){
      System.out.println(fruit);  }
  }}
