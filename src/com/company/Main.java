package com.company;

public class Main {

    public static void main(String[] args) {
    String stringData="Kraków Warszawa Gdynia Wrocław Sopot Poznań Lublin Kraków Katowice Gdańsk Radom Olsztyn Ełk Reda "   ;
	MyLinkedList list=new MyLinkedList(null);
	createList(list,stringData);
	list.traverse(list.getRoot());
	list.removeItem(new Node("Kraków"));
    list.removeItem(new Node("Sopot"));
    list.removeItem(new Node("Gdynia"));
    list.removeItem(list.getRoot());
    list.traverse(list.getRoot());

    }
    static void createList(MyLinkedList list,String stringData){
        String[]data=stringData.split(" ");
        for (String s : data){
            list.addListItem(new Node(s));

        }
    }
}
