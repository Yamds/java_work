package cafe.yamds.work0312;

public class demo04 {
    public static void main(String[] args) {
        for(int i = 0; i <= 60; i++) {
            int j = 60 - i;
            if(i * 2 + j * 4 == 180) {
                System.out.println("鸡有%d只，兔有%d只。".formatted(i, j));
                break;
            }
        }
    }
}
