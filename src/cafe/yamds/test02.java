package cafe.yamds;

import java.util.Arrays;


public class test02 {
    public static void main(String[] args) {
        char[] a= {'1','2','3','4','5','6','7','8'};
        perm(a,0,a.length-1);
    }

    public static void perm(char[] a,int p,int q)  //全排列
    {
        if(p==q) //只剩最后一个数
        {
            System.out.println(Arrays.toString(a));  //打印数组
        }
        else
        {
            for(int i=p;i<=q;i++)
            {
                swap(a,p,i);  //让数组中每个数都当一次开头
                perm(a,p+1,q);  //递归，让之后的数组继续全排列
                swap(a,p,i);    //复原，避免重复
            }
        }
    }

    public static void swap(char[] arr,int i,int j)  //两个数交换
    {
        char temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

