package module02;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConditionExercisesTest {

    // ---------------------------------------------------------
    // Helper method to capture output printed to System.out
    // ---------------------------------------------------------
    private String captureOutput(Runnable runnable) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        System.setOut(new PrintStream(outputStream));

        try {
            runnable.run();
        } finally {
            System.setOut(originalOut);
        }

        return outputStream.toString().trim();
    }

    // ---------------------------------------------------------
    // Exercise 1: Temperature Alert
    // ---------------------------------------------------------
    @Test
    void testExercise1_temperatureAlert() {
        String output = captureOutput(() ->
                Exercise1_TemperatureAlert.main(null)
        );

        assertEquals("It's hot!", output);
    }

    // ---------------------------------------------------------
    // Exercise 2: Age Verification
    // ---------------------------------------------------------
    @Test
    void testExercise2_ageVerification() {
        String output = captureOutput(() ->
                Exercise2_AgeVerification.main(null)
        );

        assertEquals("Access granted", output);
    }

    // ---------------------------------------------------------
    // Exercise 3: Even or Odd
    // ---------------------------------------------------------
    @Test
    void testExercise3_evenOrOdd() {
        String output = captureOutput(() ->
                Exercise3_EvenOrOdd.main(null)
        );

        assertEquals("7 is odd", output);
    }

    // ---------------------------------------------------------
    // Exercise 4: Discount Calculator
    // ---------------------------------------------------------
    @Test
    void testExercise4_discountCalculator() {
        String output = captureOutput(() ->
                Exercise4_DiscountCalculator.main(null)
        );

        assertEquals("Discount: 20%, Final price: R960.00", output);
    }

    // ---------------------------------------------------------
    // Exercise 5: Weather Advisor
    // ---------------------------------------------------------
    @Test
    void testExercise5_weatherAdvisor() {
        String output = captureOutput(() ->
                Exercise5_WeatherAdvisor.main(null)
        );

        assertEquals("Temperature: 35°C, Advice: It's hot!", output);
    }

    // ---------------------------------------------------------
    // Exercise 6: Age Group
    // ---------------------------------------------------------
    @Test
    void testExercise6_ageGroup() {
        String output = captureOutput(() ->
                Exercise6_AgeGroup.main(null)
        );

        assertEquals("Age: 15, Group: Teen", output);
    }
}
