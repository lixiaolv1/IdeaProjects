package study6.PrintDemo.impl;

import study6.PrintDemo.iface.Ipaper;

public class A4PaperImpl implements Ipaper {


    @Override
    public String getSize() {
        return "A4";
    }
}
