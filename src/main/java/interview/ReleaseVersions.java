package interview;

public class ReleaseVersions {
    public static String[] solution(String[] l) {
        // Inplace version array sorting
        mergeSort(l, l.length);
        return l;
    }

    private static void mergeSort(String[] elements, int n) {
        if (n < 2) return;
        int mid = n / 2;
        String[] l = new String[mid];
        String[] r = new String[n - mid];
        System.arraycopy(elements, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(elements, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(elements, l, r, mid, n - mid);
    }

    private static void merge(String[] elements, String[] l, String[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
            if (compareVersions(l[i], r[j])) elements[k++] = l[i++];
            else elements[k++] = r[j++];
        while (i < left) elements[k++] = l[i++];
        while (j < right) elements[k++] = r[j++];
    }

    private static boolean compareVersions(String version1, String version2) {
        String[] version1Numbers = version1.split("\\.");
        String[] version2Numbers = version2.split("\\.");
        int i = 0;
        while (i < version1Numbers.length && i < version2Numbers.length) {
            if (Integer.parseInt(version1Numbers[i]) < Integer.parseInt(version2Numbers[i])) return true;
            else if (Integer.parseInt(version1Numbers[i]) > Integer.parseInt(version2Numbers[i])) return false;
            i++;
        }
        return version1Numbers.length < version2Numbers.length;
    }
}
