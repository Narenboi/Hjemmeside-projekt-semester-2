package com.example.demo11;



public class MyClass {
    private String name;
    private int stdnr;

    public MyClass(String string, int i) {
        name=string;
        stdnr=i;
    }

    public MyClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdnr() {
        return stdnr;
    }

    public void setStdnr(int stdnr) {
        this.stdnr = stdnr;
    }

}

