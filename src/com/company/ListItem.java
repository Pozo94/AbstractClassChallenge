package com.company;

import java.util.List;

public abstract class ListItem {

    protected ListItem previousItem = null;
    protected ListItem nextItem = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNextItem(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPreviousItem(ListItem item);
    abstract int compareTo(ListItem item);
}
