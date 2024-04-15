package cafe.yamds.work0308;

import java.util.Scanner;

public class work01 {
    public static void main(String[] args) {
        System.out.print("请输入重量：");
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        input.close();
        if(w >= 0 && w <= 20)
            System.out.println("10元");
        else if(w > 20 && w <= 50)
            System.out.println(10+(w-20)*1.5 + "元");
        else if(w > 50 && w <= 100)
            System.out.println(10+30*1.5+(w-50)*2 + "元");
        else if(w > 100)
            System.out.println(10+30*1.5+50*2+(w-100)*2.5 + "元");
        else
            System.out.println("输入错误");
    }
}
