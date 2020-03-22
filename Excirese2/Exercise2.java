package Excirese2;

import java.io.*;
import java.util.Scanner;

public class Exercise2
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String  s = br.readLine();    // 1行分の文字列を入力する
        // String s = "練習";
        //問題2-2
        System.out.println(s);
        // int n = Integer.parseInt(s);      

        //問題2-2
        int n = Integer.parseInt( br.readLine() );
        System.out.println(n); 

        //問題2-3
        int x = Integer.parseInt( br.readLine() );
        System.out.println(x * x * x);  

        //問題2-4
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        System.out.println("和" + (X + Y));
        System.out.println("差" + (X - Y));
        System.out.println("積" +  (X * Y));
        System.out.println("商" +  (X / Y));
        System.out.println("余り" + (X % Y));

        //問題2-5
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println("平均値" + (A + B) / 2);

        //問題2-6
        System.out.println("何歳ですか");
        int age = Integer.parseInt(br.readLine());
        int yaer = 365;
        System.out.println(age * yaer);
    }
}