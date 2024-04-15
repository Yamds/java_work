package cafe.yamds.work0329;

// 加密解密
// 5.定义凯撒加密器和解密器函数，接收明文字符串参数，返回密文字符串结果。
//加密"I LOVE YOU FOREVER",解密"L ORYH BRX IRUHYHU"
//恺撒密码的替换方法是通过排列明文和密文字母表，密文字母表示通过将明文字母表向左或向右移动一个固定数目的位置。例如，当偏移量是左移3的时候（解密时的密钥就是3）：
//
//明文字母表：ABCDEFGHIJKLMNOPQRSTUVWXYZ
//密文字母表：DEFGHIJKLMNOPQRSTUVWXYZABC
//
//使用时，加密者查找明文字母表中需要加密的消息中的每一个字母所在位置，并且写下密文字母表中对应的字母。需要解密的人则根据事先已知的密钥反过来操作，得到原来的明文。例如：
//
//明文：THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
//密文：WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ


import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入秘钥(int): ");
        int n = input.nextInt();
        System.out.print("请输入加密或解密(true/false): ");
        boolean flag = input.nextBoolean();
        System.out.print("请输入内容(String): ");
        input.nextLine();
        String text = input.nextLine();
        input.close();

        // true为加密，false为解密
        System.out.println(pwd(text, n, flag));
        //System.out.println(pwd(text, n, false));
    }

    public static String pwd(String text, int n, boolean flag) {
        String ans = "";
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {    // 判断字符串是否规范
                if(flag) {  // 判断加密还是解密
                    char temp = (char) (text.charAt(i) + n);
                    if(temp > 'Z')
                        temp -= 26;
                    ans += temp;
                }else {
                    char temp = (char) (text.charAt(i) - n);
                    if(temp < 'A')
                        temp += 26;
                    ans += temp;
                }
            }
            else if(text.charAt(i) == ' ')  // 判断空格
                ans += ' ';
            else {
                return "输入不规范！";
            }
        }
        return ans;
    }
}
