package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        Player jonathan = new Player(134, "Jonathan", 135);
        Player joseph = new Player(536, "Joseph", 640);
        Player jotaro = new Player(32, "Jotaro", 34);
        Player josuke = new Player(4931, "Josuke", 684);
        Player giorno = new Player(6919, "Giorno", 593);

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put(jonathan.getUserName(), jonathan);
        hashTable.put(joseph.getUserName(), joseph);
        hashTable.put(jotaro.getUserName(), jotaro);
        hashTable.put(josuke.getUserName(), josuke);
        hashTable.put(giorno.getUserName(), giorno);

        hashTable.printHashtable();

        hashTable.remove("Josuke");

        hashTable.printHashtable();
    }
}
