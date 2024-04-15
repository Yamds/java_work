package cafe.yamds.work0322;

// 9.冒泡排序从大到小
//{3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55}

public class work09 {
    public static void main(String[] args) {
        int[] n = {3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55};

        for(int i = 0; i < n.length-1; i++)
            for(int j = 0; j < n.length-i-1; j++) {
                if(n[j] < n[j+1]) {
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }

        for(int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
    }
}
