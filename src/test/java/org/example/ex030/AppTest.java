package org.example.ex030;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    int[] l1 = {1, 2, 3, 4};
    int[] l2 = {2, 4, 6, 8};
    int[] l3 = {3, 6, 9, 12};
    int[] l4 = {4, 8, 12, 16};
    int[][] table = {l1, l2, l3, l4};

    @Test
    void makeTable() {
        assertArrayEquals(table, App.makeTable(4, 4));
    }
}