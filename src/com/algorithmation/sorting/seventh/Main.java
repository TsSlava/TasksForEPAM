package com.algorithmation.sorting.seventh;


public class Main {

    public static void main(String[] args) {
    int[] nums1 = new int[] {1, 6, 9, 14, 61};
    int[] nums2 = new int[] {0, 2, 21, 30};

        for (int i = 0; i < nums1.length; i++) {
            boolean index = true;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] < nums2[j]) {
                    System.out.printf("%d елемент первого массива вставим до %d элемента второго\n", i, j);
                    index = false;
                    break;
                }
            }
            if (index)
                System.out.printf("%d елемент первого массива вставим после последенего элемента второго\n", i);
        }
    }

}
