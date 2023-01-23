package string.buffers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringBufferTest {

    @Test
    public void methodTest() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("aaaaa");
        stringBuffer.append("bbbbb");
        Assertions.assertEquals("aaaaabbbbb", stringBuffer.toString());
    }

    @Test
    public void methodTestDos() {
        StringBuffer stringBuffer = new StringBuffer(",");
        stringBuffer.append("aaaaa");
        stringBuffer.append("bbbbb");
        Assertions.assertEquals(",aaaaabbbbb", stringBuffer.toString());
    }


}
