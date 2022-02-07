package interview;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BombBaby {

    public static String solution(String x, String y) {
        // Your code here
        BigDecimal m = new BigDecimal(x);
        BigDecimal f = new BigDecimal(y);
        BigDecimal counter = BigDecimal.ZERO;
        while (!m.min(f).equals(BigDecimal.ONE)) {
            BigDecimal mod = m.max(f).remainder(m.min(f));
            if (mod.equals(BigDecimal.ZERO)) return "impossible";
            counter = counter.add(m.max(f).divide(m.min(f), RoundingMode.FLOOR));
            f = m.min(f);
            m = mod;
        }

        return counter.add(m.max(f).subtract(BigDecimal.ONE)).toString();
    }



}
