package com.company;

public class RemoveDuplicates {

  public static void main(String[] args) {

    int[] a = {0,0,0,1,1,2,3,4,4,5,5,5,5,6};
    int[] b = {};

    RemoveDuplicates r = new RemoveDuplicates();
    r.printArray(a);
    System.out.println(r.getDistinctElements(a));
    r.printArray(a);

    r.printArray(b);
    System.out.println(r.getDistinctElements(b));
    r.printArray(b);

  }

  int getDistinctElements(int[] a){

    int i = 0; // pivot element
    int j = 1; // index

    while (j < a.length){
      if(a[j] == a[i]){
        j++;
      }
      else {
        a[++i] = a[j++];
      }
    }
    return i+1;
  }

  void printArray(int[] a) {
    for(int element: a) {
      System.out.print(element + ", ");
    }
    System.out.println();
  }

}
