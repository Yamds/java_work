package cafe.yamds.work0308;

import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        double bt;
        System.out.print("请输入身高和体重：");
        Scanner in=new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.close();
        if(a>60&&b>0)
        {
            bt=a-110;
            if(b-bt>5)
                System.out.println("过胖");
            else if (b-bt<-5)
                System.out.println("过瘦");
            else
                System.out.println("标准");
        }
        else
            System.out.println("输入错误");
    }
}
