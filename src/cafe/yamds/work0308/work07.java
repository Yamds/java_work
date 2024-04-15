package cafe.yamds.work0308;

import java.util.Objects;
import java.util.Scanner;

public class work07 {
    public static void main(String[] args) {
        System.out.println("请输入一个成年人的身高(cm)、体重(kg)和性别(男/女):");
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int weight = in.nextInt();
        String sex = in.next();
        in.close();

        double standard;
        if(Objects.equals(sex, "男"))
            standard = (height-80)*0.7;
        else
            standard = (height-70)*0.6;

        double SD = weight-standard;

        if (SD>-0.1 && SD<0.1)
            System.out.println("正常体重");
        else if (SD>=0.1&& SD<=0.2)
            System.out.println("体重过重");
        else if (SD>=-0.2&& SD<=-0.1)
            System.out.println("体重过轻");
        else if (SD>0.2)
            System.out.println("肥胖");
        else
            System.out.println("体重不足");
    }
}
