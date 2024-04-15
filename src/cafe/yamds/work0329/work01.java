package cafe.yamds.work0329;

public class work01 {
    int price=0;  //购物券

    public static void main(String[] args) {
        work01 md=new work01();
        md.add(50000.0);
        System.out.println();
        md.add(50000);
    }

    void add(double sumMoney)   //小数型
    {
        if(sumMoney>=1000)
        {
            sumMoney=sumMoney*0.8; //八折优惠
            price=200;   //送200元优惠券
        }
        else if(sumMoney>=500)
        {
            sumMoney=sumMoney*0.85; //八五折优惠
            price=100;   //送100元优惠券
        }
        else if(sumMoney>=300)
        {
            sumMoney=sumMoney*0.9; //九折优惠
            price=70;   //送70元优惠券
        }
        else
        {
            sumMoney=sumMoney*0.95;  //九五折优惠,没有优惠券
        }
        System.out.printf("实际付款金额:%8.2f  ",sumMoney);
        System.out.printf("获取购物券金额:%d",price);
    }

    void add(int sumMoney1)   //整数型
    {
        if(sumMoney1>=1000)
        {
            sumMoney1*=0.8;
            price=200;
        }
        else if(sumMoney1>=500)
        {
            sumMoney1*=0.85;
            price=100;
        }
        else if(sumMoney1>=300)
        {
            sumMoney1*=0.9;
            price=70;
        }
        else
        {
            sumMoney1*=0.95;
        }
        System.out.printf("实际付款金额:%d  ",sumMoney1);
        System.out.printf("获取购物券金额:%d",price);
    }

}
