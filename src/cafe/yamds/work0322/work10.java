package cafe.yamds.work0322;

//10.选择排序从大到小
//{3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55}

public class work10 {
    public static void main(String[] args) {
        int[] n = {3, 6, 54, 8, 4, 2, 101, 4, 11, 22, 33, 55};

        for(int i = 0; i < n.length-1; i++)
            for(int j = i + 1; j < n.length; j++) {
                if(n[i] < n[j]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }

        for(int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
    }
}
