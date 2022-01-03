package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testAdminGetters() {
        User testAdmin = new AdminUser("123@gmail.com", "0000");

        assertEquals("123@gmail.com", testAdmin.getUserEmail());
        assertEquals("****", testAdmin.getPassword());
    }
}
