import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class Main2Test {

    @Test
    public void isLeapYearTrue() {
        String a="2020";
        InputStream in=new ByteArrayInputStream(a.getBytes());
        System.setIn(in);
        String c=Main.isLeapYear();
        assertEquals("365 дней",c);
    }


    }
