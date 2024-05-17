////////////////////////////////////////////////////////////////////
// LORENZO ALBERTIN 2076438
// FILIPPO DIVIESTI 2079240
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String convert(int number) throws EccezioniNegativi, EccezioniNumeriGrandi{
        if(number<0){
            throw new EccezioniNegativi();
        }
        if(number>1000){
            throw new EccezioniNumeriGrandi();
        }

        StringBuilder s = new StringBuilder();

        int remaining = number;

        for (int i = 0; i < values.length; i++) {
            while (remaining >= values[i]) {
                remaining -= values[i];
                s.append(romanLiterals[i]);
            }
        }
        return s.toString();
    }
}