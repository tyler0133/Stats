import java.util.*;
import java.lang.Math;

class StatsLibrary {
    private int minimum ;
    private int maximum ;
    private int sum; 
    private int[] numbers = new int [7];
    Scanner keyboard = new Scanner(System.in);
        
    public StatsLibrary() {
    }
    public void mean(){
        System.out.println("List the numbers");
        for(int i = 0; i < numbers.length; i++){
             numbers[i] = keyboard.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        sum = Arrays.stream(numbers).sum();
        System.out.println((sum / numbers.length));
    }    
    public void median(){
        

    }
   public  void mode(){

}
    public static void standardDeviation(){

    }
}
 class Main {
    public static void main(String[] args) {
        StatsLibrary stats = new StatsLibrary();
    }
 }