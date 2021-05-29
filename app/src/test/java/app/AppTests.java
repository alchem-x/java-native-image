package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTests {

    @Test
    public void test() {
        assertEquals("Java native-image",new App().name());
    }
}
