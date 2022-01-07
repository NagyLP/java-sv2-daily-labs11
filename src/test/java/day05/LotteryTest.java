package day05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    Lottery lottery = new Lottery(99, 5);

    @Test
    void testCreate() {
        assertEquals(99, lottery.getTotalPiecesNumbers());
        assertEquals(5, lottery.getPullVolumen());
    }

    @Test
    void testPull() {
        List<Integer> numbers = lottery.draw();
        assertEquals(5, numbers.size());
        assertTrue(areNumbersValid(numbers));
    }

    boolean areNumbersValid(List<Integer> numbers) {
        List<Integer> previousNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (previousNumbers.contains(number)) { return false; }
            if (number < 1) { return false; }
            if (number > 99) { return false; }
            previousNumbers.add(number);
        }
        return true;
    }
}