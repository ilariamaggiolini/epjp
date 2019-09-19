package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S55Test {

    @Test
    void sumPositive() {
        long actual = S55.sum(1, 3);

        assertThat(actual, is(6L));
    }

    @Test
    void sumNegPos() {
        long actual = S55.sum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void sumSingle() {
        long actual = S55.sum(1003, 1003);

        assertThat(actual, is(1003L));
    }

    @Test
    void sumEmpty() {
        long actual = S55.sum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumPositive() {
        long actual = S55.evenSum(1, 3);

        assertThat(actual, is(2L));
    }

    @Test
    void evenSumNegPos() {
        long actual = S55.evenSum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumSingle() {
        long actual = S55.evenSum(1002, 1002);

        assertThat(actual, is(1002L));
    }

    @Test
    void evenSumEmpty() {
        long actual = S55.evenSum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void factorialFour() {
        long actual = S55.factorial(4);
        
        assertThat(actual, is(24L));
    }

    @Test
    void factorialNegative() {
        long actual = S55.factorial(-4);
        
        assertThat(actual, is(0L));
    }

    @Test
    void fibonacci() {
        long actual = S55.fibonacci(8);
        
        assertThat(actual,is(21L));
    }

    @Test
    void multiplicationTable() {
    	int [][] actual = S55.multiplicationTable(5);
    	
    	assertThat(actual[4][2],is(15));
    }
}
