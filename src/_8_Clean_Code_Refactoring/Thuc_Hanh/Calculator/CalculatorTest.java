package _8_Clean_Code_Refactoring.Thuc_Hanh.Calculator;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    int testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculator(a, b, o);
//       int  assertEquals(expected, result);
        return result;
    }

    @Test
    @DisplayName("Testing subtraction")
    int testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculator(a, b, o);
        return result;
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculator(a, b, o);
//        int assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculator(a, b, o);
//       int assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int a = 2;
        int b = 0;
        char o = '/';

//       int  assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculator(a, b, o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = '=';

//       int assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculator(a, b, o);});
    }
}