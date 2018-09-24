package com.company;

import java.util.Set;

public abstract class AbstractApp {
    public String name;
    public Integer version;

    AbstractApp() {
    }

    AbstractApp(String name, Integer version) {
        System.out.println(name + "+  NAME");
    }

   /* AbstractApp(Integer version) {
        System.out.println(version + "VERSION");
    }*/

    public void setName(String name) {
        this.name = name;
        System.out.println(name + "New Name Added");
    }

    public void setVersion(Integer version) {
        this.version = version;
        System.out.println(version + "New Version Added");
    }

    public Integer getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    abstract void print();

}
