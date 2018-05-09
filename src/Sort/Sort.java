package Sort;


public class Sort {

    public static void sort(String[] a) {
        for (int i = 0; i < a.length; i++) {
            String min = a[i];
            int indexMin = i;


            for (int j = i + 1; j < a.length; j++) {
                if (a[j].length() < a[i].length()) {
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                String t = a[i];
                a[i] = a[indexMin];
                a[indexMin] = t;
            }
        }

    }


}

