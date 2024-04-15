package cafe.yamds;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test01 {
    public static void main(String[] args) {
        String[] team = {"张三丰", "王五强", "李四光", "张4丰", "王5强", "李6光", "张7丰", "王8强", "李9光", "张0丰"};

        ArrayList<String> list = new ArrayList<>(List.of(team));

        Random rand = new Random();

        for(int i = 0; i < 3; i++) {
            int pos = rand.nextInt(list.size());    // 位置
            System.out.println("remove : " + list.get(pos) + "\tpos : " + pos);

            list.remove(list.get(pos));
            //System.out.println("team : " + Arrays.toString(team));
            System.out.println("list : " + list.toString());
            System.out.println();
        }

    }
}
