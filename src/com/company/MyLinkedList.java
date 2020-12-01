package com.company;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;

    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addListItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            System.out.println(this.root.getValue());
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNextItem(newItem).setPreviousItem(currentItem);
                    return true;
                }

            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNextItem(newItem).setPreviousItem(currentItem.previous());
                    newItem.setNextItem(currentItem).setPreviousItem(newItem);
                } else {
                    newItem.setNextItem(this.root).setPreviousItem(newItem);
                    this.root = newItem;

                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present!");
                return false;
            }


        }
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("List is empty...");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();

            }
        }
    }

    @Override
    public boolean removeItem() {

        return false;
    }
}