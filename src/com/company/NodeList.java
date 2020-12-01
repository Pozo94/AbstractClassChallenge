package com.company;

public interface NodeList {
    ListItem getRoot();
    boolean addListItem(ListItem item);
    boolean removeItem();
    void traverse(ListItem root);

}
