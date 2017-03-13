package me.ronggenliu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by liuronggen on 13/03/2017.
 */
public class FizzBuzzTest {
    @Test
    public void solutionWithFizzForThree() throws Exception {
        assertTrue(FizzBuzz.solution(3).get(2).equals("Fizz"));
    }

    @Test
    public void solutionWithBuzzForFive() throws Exception {
        assertTrue(FizzBuzz.solution(5).get(4).equals("Buzz"));
    }

    @Test
    public void solutionWithFizzBuzzForThreeFive() throws Exception {
        assertTrue(FizzBuzz.solution(15).get(14).equals("FizzBuzz"));
    }

    @Test
    public void solutionWith2ForTwo() throws Exception {
        assertTrue(FizzBuzz.solution(3).get(1).equals("2"));
    }
}