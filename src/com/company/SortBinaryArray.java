package com.company;

public class SortBinaryArray {

    public static void main(String[] args) {

        int[] array = new int[]{0,0,1,0,1,1,0,1,0,1,0,1,0};
        sortTheArray(array);
        printArray(array);

    }
    public static int[] sortTheArray(int[] array){

        int i= 0;
        int j = 0;
        int tmp = 0;
        while(j< array.length){
            if(array[j] == 1){
                j++;
            }
            else {
                tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                i++;
                j++;
            }
        }
        return array;

    }
    public static void printArray(int[] a){
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
