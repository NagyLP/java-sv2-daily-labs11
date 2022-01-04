package day02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class HikingTest {

    Hiking hiking = new Hiking();

    @Test
    void getPlusElevationInvalidDataTest() {
        assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation(null));
        assertThrows(IllegalArgumentException.class, () -> hiking.getPlusElevation((Arrays.asList(new Tour(1.0, 2.0, 3.0)))));
    }

    @Test
    void getMinusElevationDataTest() {
        Tour tourOne = new Tour(1, 2, 3.0);
        Tour tourTw = new Tour(2, 4, 6.0);
        Tour tourTh = new Tour(3, 5, 7.0);
        List<Tour> tours = new ArrayList<>(Arrays.asList(tourOne, tourTw, tourTh));

        assertEquals(4.0, hiking.getPlusElevation(tours));
    }
}
