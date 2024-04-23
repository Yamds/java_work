package edu.kjxy.demo0419;

public class Phone implements USB{
    private String pid;
    private String brand;

    public Phone() {
    }

    public Phone(String pid, String brand) {
        this.pid = pid;
        this.brand = brand;
    }

    @Override
    public void conn() {
        System.out.println(pid + brand + "连接成功");
    }

    @Override
    public void transfer(String data) {
        System.out.println(pid + brand + "传输数据: " + data);
    }

    @Override
    public void disconn() {
        System.out.println(pid + brand + "断开成功");
    }
}
