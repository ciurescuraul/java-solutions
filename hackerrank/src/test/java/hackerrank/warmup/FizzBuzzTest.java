package hackerrank.warmup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void fizzBuzzSample() {

        FizzBuzz fizzed = new FizzBuzz();
        String fizz = fizzed.fizzBuzzSample(3, 3);
        String buzz = fizzed.fizzBuzzSample(5, 5);
        String fizzBuzz = fizzed.fizzBuzzSample(15, 15);
        String empty = fizzed.fizzBuzzSample(13, 13);

        Assertions.assertEquals("Fizz", fizz);
        Assertions.assertEquals("Buzz", buzz);
        Assertions.assertEquals("FizzBuzz", fizzBuzz);
        Assertions.assertEquals(" ", empty);
    }
}