package _8_Clean_Code_Refactoring.Thuc_Hanh.FizzBuzz;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class FizzBuzzTest {

    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
//       assertEquals(expected, result);
        System.out.println(result);

    }

    @Test
    void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
//        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
//        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
//        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
//        assertEquals(expected, result);
        System.out.println(result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
//        assertEquals(expected, result);
    }
}
