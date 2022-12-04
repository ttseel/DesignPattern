package structural.composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MenuItemTest {

    @Test
    void check() {
        boolean b = false;
        Boolean b2 = Boolean.FALSE;

        fx(b);
        fx2(b2);

        System.out.println(b);
        System.out.println(b2);
    }

    void fx(boolean b) {
        b = true;
    }

    void fx2(Boolean b) {
        Boolean b2 = Boolean.TRUE;
    }
}