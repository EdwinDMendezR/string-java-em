package string.buiders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringBuilderTest {


    @Test
    public void methodTest() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("aaaaa");
        stringBuilder.append("bbbbb");
        Assertions.assertEquals("", stringBuilder.toString());
    }

    @Test
    public void methodTestDos() {
        StringBuilder stringBuilder = new StringBuilder(",");
        stringBuilder.append("aaaaa");
        stringBuilder.append("bbbbb");
        Assertions.assertEquals("", stringBuilder.toString());
    }

}
