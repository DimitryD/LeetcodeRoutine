package interview.zalando;

public class LocalMaximum {

    public int findLocalMaximum(int[] array) {
        if (array.length == 1)
            return array[0];
        if (array.length == 2)
            return Math.max(array[0], array[1]);

        for (int i = 1; i < array.length - 1; i++)
            if (array[i - 1] < array[i] && array[i] > array[i + 1])
                return array[i];

        return array[0] > array[1] ? array[0] : array[array.length - 1];
    }
}
