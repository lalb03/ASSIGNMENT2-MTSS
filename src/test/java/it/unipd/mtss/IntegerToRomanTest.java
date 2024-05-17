////////////////////////////////////////////////////////////////////
// LORENZO ALBERTIN 2076438
// FILIPPO DIVIESTI 2079240
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class IntegerToRomanTest {
    static IntegerToRoman converter= null;
    @BeforeClass
    public static void initializeConverter(){
        converter= new IntegerToRoman();
    }
    @Test
    public void TestNumeroZero() throws EccezioniNegativi, EccezioniNumeriGrandi{
        int number=0;
        String zero=converter.convert(number);
        assertEquals("",zero);

    }

    @Test (expected=EccezioniNegativi.class)
    public void TestNumeroNegativo() throws EccezioniNegativi, EccezioniNumeriGrandi{
        int number=-39;
        converter.convert(number);

    }

    @Test (expected=EccezioniNumeriGrandi.class)
    public void TestNumeroMaggiore() throws EccezioniNegativi, EccezioniNumeriGrandi{
        int number=17000;
        converter.convert(number);

    }
}