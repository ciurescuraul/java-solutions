package hackerrank.warmup;

public class FizzBuzz {
   public String fizzBuzzSample(int l, int r){

       for (int i = l; i <= r; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
               return "FizzBuzz";
           } else if (i % 3 == 0) {
               return "Fizz";
           } else if (i % 5 == 0) {
               return"Buzz";
           }
       }
       return " ";
   }
}
