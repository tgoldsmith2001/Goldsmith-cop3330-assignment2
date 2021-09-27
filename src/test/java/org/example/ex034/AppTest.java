package org.example.ex034;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void alterString() {
        String [] names= {"A","B","C","D","E"};
        String [] newStrings= {"B","C","D","E"};
        assertArrayEquals(newStrings,App.alterString(names,"A"));
    }
}