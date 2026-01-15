
import java.util.ArrayList;
public class Arraylist4 {
  public static void main(String[] args) {

    ArrayList<String> fruits = new ArrayList<String>();

    fruits.add("Mr.");
    fruits.add("Priyanshu");
    fruits.add("Gupta");

    fruits.remove(1);
    fruits.set(1,"Priyanshu Gupta");
    System.out.println(fruits);
  }}
