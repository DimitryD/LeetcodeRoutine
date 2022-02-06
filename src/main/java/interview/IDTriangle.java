package interview;

public class IDTriangle {
    public static String solution(long x, long y) {
        long prevDiagonal = x + y - 2;
        long lastElementOnDiagonal = prevDiagonal * (1 + prevDiagonal) / 2;
        return String.valueOf(lastElementOnDiagonal + x);
    }
}
