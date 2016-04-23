package com.train.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Task_752a {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/airing/Downloads/uv.txt");
        Set set = new HashSet();
        InputStreamReader read = new InputStreamReader(
                new FileInputStream(file),"utf-8");
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                    String [] arr=lineTxt.split(" ");
                    set.add(arr[1]);
                }
                System.out.println(set.size());
    }
}
