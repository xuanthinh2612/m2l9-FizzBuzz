import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void testTranslate1() {
        int a = 1;
        String expected = "1";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testTranslate2() {
        int a = 9;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testTranslate3() {
        int a = 10;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testTranslate4() {
        int a = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testTranslate5() {
        int a = 173;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void testTranslate6() {
        int a = 151;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(a);
        assertEquals(expected, result);
    }

}