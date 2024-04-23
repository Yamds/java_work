package edu.kjxy.demo0419;

public class Camera implements USB{

    private String cid;

    public Camera() {
        super();
    }

    public Camera(String cid) {
        super();
        this.cid = cid;
    }

    @Override
    public void conn() {
        System.out.println(cid + "链接成功");
    }

    @Override
    public void transfer(String data) {
        System.out.println(cid + "传输图片" + data);
    }

    @Override
    public void disconn() {
        System.out.println(cid + "断开成功");
    }
}
