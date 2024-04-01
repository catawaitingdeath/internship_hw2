package ru.liga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecretTest {

    @Test
    public void branchIsMergedCorrectly() {
        assertEquals("AB", new Secret("A", "B").generate());
    }

}