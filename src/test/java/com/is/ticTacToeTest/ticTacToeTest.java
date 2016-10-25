package com.is.ticTacToeTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ticTacToeTest {

    @Test
    public void greetResultsInHello() {
        World world = new World();
        assertEquals("Hello world!", world.greet()); }

}
