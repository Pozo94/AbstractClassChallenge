package com.company;

import java.util.List;

public interface NodeList {
    ListItem getRoot();
    boolean addListItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
