package cafe.yamds.work0329;

import java.util.Arrays;

public class work04 {
    public static void main(String[] args) {
        int[] arr1 = {6, 8, 3, 4, 6, 8, 2, 1};
        int[] arr2 = {12, 54, 23, 73, 45, 12};
        int[] arr3 = {765, 347, 567, 234, 98, 569};

        System.out.println("arr1 : " + Arrays.toString(sortB(arr1)));
        System.out.println("arr2 : " + Arrays.toString(sortB(arr2)));
        System.out.println("arr3 : " + Arrays.toString(sortB(arr3)));
    }
    // 冒泡
    public static int[] sortB(int... n) {
        for(int i = 0; i < n.length - 1; i++) {
            for(int j = 0; j < n.length-i-1; j++) {
                if(n[j] > n[j+1]) {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        return n;
    }
}
