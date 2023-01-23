package string.joiner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

public class StringJoinerTest {

    @Test
    public void methodTest() {
        StringJoiner stringJoiner = new StringJoiner(", ");
        stringJoiner.add("1");
        stringJoiner.add("2");
        stringJoiner.add("3");
        Assertions.assertEquals("1, 2, 3", stringJoiner.toString());
    }

    @Test
    public void methodTestDos() {
        StringJoiner stringJoiner = new StringJoiner("-","[","]");
        stringJoiner.add("1");
        stringJoiner.add("2");
        stringJoiner.add("3");
        Assertions.assertEquals("[1-2-3]", stringJoiner.toString());
    }

}
