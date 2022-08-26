package Assignment;

import javax.lang.model.element.Element;
import java.util.Stack;

public class StackAnimal {
  static Stack<String> cars = new Stack<>();
    public static void main(String[] args) {
push();
pop();
peek();
empty();
index();
size();
add();
size();
    }
    public static void push(){

        cars.push("volvo");
        cars.push("Bens");
        cars.push("honda");
        cars.push("G-wagon");
        cars.push("Highlander");
        System.out.println("Items stored in element: " + cars);
    }
    public static void pop(){
         String element = cars.pop();
        System.out.println("Item removed is: " + element);
    }
    public static void peek(){
        String element = cars.peek();
        System.out.println("Item at the top: " + element);
        System.out.println("Total Items: "+ cars);
    }
    public static void search(){
        int position = cars.search("Bens");
    }
    public static void empty(){
        boolean result = cars.empty();
        System.out.println("Is Item empty? "+ result);

    }
    public static void index(){
        String position = cars.get(2);
        System.out.println("Item in index 2: " + position);
    }
    public static void add(){
       cars.add(2,"Rav4");
        System.out.println("Total Element: " + cars) ;
    }
    public static void size(){
        int size = cars.size();
        System.out.println("Item size: " + size);
    }


}
