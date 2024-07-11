package Elice.Day03.caboooom_240710;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        StringBuilder builder = new StringBuilder();
        char[] inputArr = input.toCharArray();

        for(int i=0; i<inputArr.length; i++) {
            if(Character.isDigit(inputArr[i]) && Character.isDigit(inputArr[i+1])) {
                builder.append("1").append("+");
            } else if(Character.isDigit(inputArr[i]) && inputArr[i+1] == '(') {
                builder.append(inputArr[i]).append("*");
            } else if(Character.isDigit(inputArr[i]) && inputArr[i+1] == ')') {
                builder.append("1");
            } else{
                builder.append(inputArr[i]);
            }
        }

        System.out.println(builder);


    }
}
