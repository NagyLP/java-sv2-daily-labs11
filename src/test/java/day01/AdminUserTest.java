package day01;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    void testAdminGetters() {
        User testAdmin = new AdminUser("123@gmail.com", "0000");

        assertEquals("123@gmail.com", testAdmin.getEmail());
        assertEquals("****", testAdmin.getPassword());
    }
}
