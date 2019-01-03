package com.company;

import java.util.Arrays;

public class HashTable {

    int[][] fruits = new int[10][2];

    public HashTable(){
        for (int i=0; i<10; i++){
            for(int j = 0; j <2; j++){
                fruits[i][j] = 0;
            }
        }
    }

    public int getHashCode(String fruit){
        return fruit.length();
    }

    public void put(String fruit){
        int secondIndex = 0;
        if(fruit.equals("банан")) {
            secondIndex = 1;
        }
        fruits[getHashCode(fruit)][secondIndex]+= 1;
    }

    public void print(){
        for (int i=0; i<fruits.length; i++){
            System.out.print(i+":"+fruits[i][0]+" | ");
        }
        System.out.println();
        for (int i=0; i<fruits.length; i++){
            System.out.print(i+":"+fruits[i][1]+" | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.print();
        System.out.println("-----------------------------------------------------");
        table.put("яблоко");
        table.put("лимон"); //0
        table.put("банан"); //1
        table.put("мандарин");
        table.print();
    }
}
