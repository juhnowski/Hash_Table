package com.company;

import java.util.Arrays;

public class HashFunction {

//    "яблоко"
//    "лимон"
//    "банан"
//    "мандарин"

    public int getHashCode(String fruit){
        return fruit.length();
    }

    String[] arr;
    int arrSize;

    public HashFunction(int size){
        arrSize = size;
        arr = new String[size];
        Arrays.fill(arr,"-1");
    }

    public void hashFunction(String[] stringsForArray, String[] theArr){
        for (int n = 0; n < stringsForArray.length; n++){
            String item = stringsForArray[n];
            theArr[Integer.parseInt(item)] = item;
        }
    }

    public void print(){
        for (int i=0; i<arrSize; i++){
            System.out.print(i +":"+arr[i]+" | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
	    HashFunction hf = new HashFunction(4);
	    hf.print();
	    String[] elementsToAdd = {"2","3"};
	    hf.hashFunction(elementsToAdd,hf.arr);
	    hf.print();
    }
}
