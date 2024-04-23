package edu.kjxy.demo0419;

public class Computer {
    private String cid;
    private String brand;
    private String data;

    public Computer() {
    }

    public Computer(String cid, String brand, String data) {
        this.cid = cid;
        this.brand = brand;
        this.data = data;
    }

    public void copy(USB device) {
        device.conn();
        device.transfer(data);
        device.disconn();
    }
}
