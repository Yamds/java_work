package cafe.yamds.work0312;

public class demo05 {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 1000; i++) {
            if(i % 7 == 0) {
                System.out.print(i + "\t");
                if(count++ % 5 == 0)
                    System.out.println();
            }
        }
    }
}
