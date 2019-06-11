package study6.PrintDemo.impl;

import study6.PrintDemo.iface.Ipaper;

public class B5PaperImpl implements Ipaper {


    @Override
    public String getSize() {
        return "B5";
    }
}
