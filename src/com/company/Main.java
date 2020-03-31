package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public String decodeTheString(String input){
        input = "3[ac5[b]]ac";
        Stack<Integer> integerStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String result  ="";

        int index = 0;
        while(index < input.length()){

            int count = 0;
            if(Character.isDigit(input.charAt(index))) {

                while(Character.isDigit(input.charAt(index))) {
                    count = count *10 + input.charAt(index) - '0';
                    index ++;
                }

                index --;
                integerStack.push(count);
                count =0;
            }

            if(input.charAt(index) == '[' || Character.isAlphabetic(input.charAt(index))) {
                stringStack.push(String.valueOf(input.charAt(index)));

            }
            else {
                StringBuilder stringBuilder = new StringBuilder();

                // create the string
                while(!(stringStack.peek().equals("["))){
                    stringBuilder.append(stringStack.pop());
                }
                stringStack.pop(); // remove the ] string

                Integer numberOfRepatation = integerStack.pop();
                for (int i = 0; i<numberOfRepatation ;i++){
                     result = result + stringBuilder.toString();
                }

                stringStack.push(result);



            }



        }


    }
}
