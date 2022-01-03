package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalUserTest {

    @Test
    void testNormalUserGetters() {
        User testUser = new NormalUser("123@gmail.com", "0000");

        assertEquals("123@gmail.com", testUser.getUserEmail());
        assertEquals("****", testUser.getPassword());
    }
}
