package com.company;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextItem;
    }

    @Override
    ListItem setNextItem(ListItem item) {
        this.nextItem=item;
        return this.nextItem;
    }

    @Override
    ListItem previous() {
        return this.previousItem;
    }

    @Override
    ListItem setPreviousItem(ListItem item) {
        this.previousItem =item;
        return this.previousItem;
    }

    @Override
    int compareTo(ListItem item) {
        if(item!=null){
            return ((String)super.getValue()).compareTo((String)item.getValue());
        }else
        {
            return -1;
        }

    }
}
