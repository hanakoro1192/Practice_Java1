import java.io.*;

public class Exercise5{
    public static void main( String[] args ) throws IOException{

        BufferedReader a = new BufferedReader(new InputStreamReader( System.in ) );
        //配列のインスタンス問題5-1
        int value[] = new int[10];

        for(int i = 0; i < 10; i++){
            value[i] = Integer.parseInt(a.readLine());

            System.out.println();
        }

        for(int i = 0; i < 10; i++){
            System.out.println(value[i] * 2);
        }

        int Value[] = new int[10];
        for(int i = 0; i < 10; i++){
            Value[i] = Integer.parseInt( a.readLine() );
        }
        //数値を逆にする処理5-2
        for(int i = 9; i >= 0; i--){
            System.out.println(value[i]);
        }

        //問題5-3
        int kumasan[] = new int[10];
        for(int i = 0; i < 10; i++){
            kumasan[i] = Integer.parseInt(a.readLine());
        }

        System.out.println("\n偶数"); //ここでnが使えるようになる
        for(int n: kumasan){ //このような書き方も可能
            if((n % 2) == 0){
                System.out.println("偶数");
            }else{
                System.out.println("奇数");
            }
        }

        //問題5-4
        int yasuyuki[] = new int[10];
        int ctn; //入力が 10 回行われた場合
        int sum; //合計が100回を超えた場合

        for(ctn = 0, sum = 0; ctn < 10 && sum > 100; ctn++){
            yasuyuki[ctn] = Integer.parseInt(a.readLine()); //ここが代入した値となる
            sum += yasuyuki[ctn]; //100でストップする基準
        }

        for(int i = 0; i < ctn; i++){
            System.out.print( "\n" + yasuyuki[i] );
        }

        //ホワイルを用いた場合
        while(ctn < 10 && sum > 100){
            yasuyuki[ctn] = Integer.parseInt(a.readLine());
            sum += yasuyuki[++ctn];
        }

        for( int i = 0 ; i < ctn ; i ++ )
        System.out.print( "\n" + yasuyuki );

        //問題5-5
        int binary[] = new int[16]; //16進数だから
        for(int i = 0; i < 16; i++){
            System.out.print( "\n" + binary[16] );
        }

        //問題5-6 //ここはちょっと異なる
        // int Kuku[][] = new int[9][9];

        // for(int i = 0; i < 9; i++){
        //     for(int j = 0; j < 9; j++){
        //         System.out.printf( " %2d", Kuku[i][j] );
        //     }
        // }

        //もう一度やり直す
        

        //問題5-7
        int kuku[][] = new int[9][9];

        for( int i = 0 ; i < 9 ; i++ )
            for( int j = 0 ; j < 9 ; j++ )
                kuku[i][j] = ( i + 1 ) * ( j + 1 );

        int p = Integer.parseInt( a.readLine() );
        int q = Integer.parseInt( a.readLine() );

        System.out.println( kuku[p-1][q-1] );



    }
}