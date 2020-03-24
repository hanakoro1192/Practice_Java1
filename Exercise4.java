import java.io.*;
import java.util.Scanner;

class Exercise4 {
    
    public static void main(String[] args) throws IOException {
        

    //     //問題4-1
    //     for(int i = 0; i < 10; i++){
    //         System.out.println("SPAM");
    //     }

    //     //問題4-2
    //     for(int j = 0; j <= 9; j++){
    //         System.out.println((3 * j) + "");
    //     }
        
    //     //問題4-3
    //     int x = 1;
    //     for(int k = 0; k <= 9; k++){
    //         x *= 2;
    //         System.out.println("2の" + x + "乗=" + k);
    //     }

    //     //問題4-4
    //     int y = 1;
    //     for(int i = 2; i <= 7; i++){
    //         y *= i;
    //         System.out.println(y);
    //     }

    //     BufferedReader a = new BufferedReader(new InputStreamReader( System.in ) );

    //     //練習4-5
    //     int sum = 0;
    //     for(int i = 0; i < 10; i++){
    //         int value = Integer.parseInt(a.readLine());
    //         sum += value;
    //     }
    //     System.out.println("合計は" + (sum/ 10));

    //     //ここ度20回繰り返す操作を行う
    //     int kumasan = 0;
    //     for(int j = 0; j < 10; j++){
    //         int saikyo = Integer.parseInt(a.readLine());
    //         kumasan += saikyo;
    //     }
    //     System.out.println("最強くまさんは" + (kumasan/ 10));

    //     //練習4-6
    //     int win = 0;
    //     for(int i = 0; i < 10; i++){
    //         int result = Integer.parseInt(a.readLine());

    //         if(result == 1){
    //             win += 1;
    //         }
    //     }
    //     System.out.println("勝ち" + win + "負け" + (10 - win) + "です");

    //     //ここで整数、10 か 100 を 10 回入力する。これを対戦成績と考え、10 を負け、100 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成
    //     int kati = 10;
    //     for(int i = 0; i < 10; i++){
    //         int saikyo = Integer.parseInt(a.readLine());

    //         if(saikyo == 100){ //負けが生じる場合
    //             kati += 0;
    //         }
    //     }
    //     System.out.println("勝ち" + kati + "負け" + (110 - kati) + "です");

    //     int giants = 0; //巨人の初期値 得点につながる
    //     int tigers = 0;  //阪神の初期値 得点につながる
    //     //中日を入れてみよう:三角野球
    //     int kyuniti = 0;

    //     for(int game = 0; game < 9; game++){
    //         System.out.println(game + "回,巨人の得点");
    //         giants = Integer.parseInt(a.readLine()); //得点

    //         System.out.println(game + "回,中日の得点");
    //         kyuniti = Integer.parseInt(a.readLine()); //中日の得点

    //         System.out.println(game + "回,阪神の得点");
    //         tigers = Integer.parseInt(a.readLine()); //得点
    //     }
    //     System.out.println("巨人" + giants + "阪神" + tigers + "中日" + kyuniti);
    //     System.out.println("最強は" + MaxValue(giants, MaxValue(tigers, kyuniti)));

    //     if(giants > tigers){
    //         System.out.println("巨人の勝ち");
    //     }else{
    //         System.out.println("阪神の勝ち");
    //     }

    //     int max_value = 0;

    //     for(int i = 0; i < 10; i++){
    //     int value = Integer.parseInt(a.readLine());

    //     if( value > max_value){
    //         max_value = value;
    //         }
    //     }
    //     System.out.println("最大値は" + max_value); //上のカッコとは別で考える

    //     //最小値を求めるプログラム
    //     int min_value = 0;
    //     for(int i = 0; i < 10; i++){
    //         int value = Integer.parseInt(a.readLine());

    //         if(value < min_value){
    //             value = min_value;
    //         }
    //     }
    //     System.out.println("最小値は" + min_value);


    //     int max = 0; //最大値
    //     int min = 0; //最小値

    //     for(int i = 0; i < 10; i++){
    //         int value = Integer.parseInt(a.readLine());

    //         if(i == 0){
    //             max = value;
    //             min = value;
    //         }else{
    //             if(value > max){
    //                 max = value; //最大値の場合
    //             }
    //             if(value < min){
    //                 min = value; //最小値の場合
    //             }
    //         }
    //     }
    //     System.out.println("最大値=" + max + "最小値" + min);

    //     //問題4-10:個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成。
    //     int count = Integer.parseInt(a.readLine());

    //     String A = "くまさん";
    //     for(int i = 0; i < count; i++){
    //         System.out.println(A + "*");
    //     }

    //     //問題4-11個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るもの
    //     int count1 = Integer.parseInt(a.readLine());

    //     for(int i = 0, out = 0; i < count1; count1++){ //outが0と初期値を設定する
    //         System.out.println(out++);

    //         if(out > 9){
    //             out = 0;
    //         }
    //     }

    //     //問題4-12
    //     int sum_kumasan = 0;

    //     while(sum <= 100){
    //         sum += Integer.parseInt(a.readLine());
    //     }
    //     System.out.println(sum_kumasan);

    //     //次は1000で止めるプログラムにしてみよう
    //     int sum_kumasanz = 0;

    //     while(sum_kumasanz <= 100){
    //         sum_kumasanz += Integer.parseInt(a.readLine());
    //     }
    //     System.out.println(sum_kumasanz);


    //     //問題4-13
    //     int strike = 0;
    //     int ball = 0;

    //     while(strike < 2 && ball < 3){
    //         System.out.println("ストライク=1 or ボール=2 ?");

    //         int judge = Integer.parseInt(a.readLine());

    //         if(judge == 1 ){
    //             strike++;
    //         }else if(judge == 2){
    //             ball++;
    //         }
    //     }
    //     System.out.println( ball + "ボール," + strike + "ストライク" );

    //     //問題4-14
    //     int strikes = 0;
    //     int balls = 0;
    //     int file = 0;

    //     while(strikes < 3 && balls < 4){
    //         System.out.println("ストライク=1 or ボール=2 or ファール=3 ?");

    //         int judge = Integer.parseInt(a.readLine());

    //         if(judge == 1){
    //             strike++;
    //         }else if(judge == 2){
    //             balls++;
    //         }else if(judge == 3 && strike < 2){
    //             strike++;
    //         }
    //     }
    //     System.out.println( ball + "ボール," + strike + "ストライク" );


    //     //問題4-15:素数は2,3,5,7....
    //     Scanner sc = new Scanner(System.in); //キーボードで入力
    //     System.out.println("素数を入力して下さい");
    //     System.out.print("数字を入力して下さい : ");
    //     int n = sc.nextInt();
    //     for(int i = 2; i < n; i++){
    //         if(n % i == 0){
    //             System.out.println(n + "は素数ではありません");
    //         }else{
    //             System.out.println(n + "は素数です");
    //         }
    //     }

        // //問題4-15:その他のやり方
        // BufferedReader r = new BufferedReader(new InputStreamReader( System.in ) );

        // int Value = Integer.parseInt(r.readLine());
        // int m; //まずmを定義する

        // //mがどのような値なのかの確認を行う
        // for(m = 2; m < (Value / 2); m++){
        //     if(Value % m == 0){
        //         break;
        //     }
        // }
        // if(m > (Value / 2)){ //例えばm=2の時、
        //     System.out.println(Value + "は素数です");
        // }else{
        //     System.out.println(Value + "は素数ではないです");
        // }
        
        // //問題4-16:2以上の数値を入力し、素因数分解した結果を表示しなさい。
        // BufferedReader r = new BufferedReader(new InputStreamReader( System.in ) );

        // int m = Integer.parseInt(r.readLine());
        // int x;

        // for( x = 3 ; m > 1 ; x++ ){
        //     while( ( m % x ) == 0 ){
        //         m /= x; //ここのアルゴリズムはいまいち不明
        //         System.out.print( x + " " );
        //     }
        // }

        // //問題4-17:九九表（一の段～九の段）を表示するプログラムを
        // for(int i = 1; i < 9; i++){
        //     for(int j = 1; j < 9; j++){
        //         System.out.printf(" %2d", i * j ); //文字列や数値などを指定した書式で画面に出力する
        //     }
        //     System.out.println();
        // }

        // //配列の99を表示
        // //配列の宣言
        // int Kuku[][] = new int[9][9];

        // //九九を配列に保存
        // for(int i = 0; i < 9; i++){
        //     for(int j = 0; j < 9; j++){
        //         Kuku[i][j] = (i + 1)*(j + 1);
        //         // System.out.println(Kuku[i][j]);
        //     }
        // }

        // //九九を表示する
        // for(int i = 0; i < 9; i++){
        //     for(int j = 0; j < 9; j++){
        //         System.out.print(Kuku[i][j] + " "); //ここで横並びにすることができた
        //     }
        //     System.out.println();
        // }

        // //問題4-18:数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成
        // BufferedReader b = new BufferedReader(new InputStreamReader( System.in ) );

        // int sum = 0;
        // for(; ;){
        //     int value = Integer.parseInt(b.readLine());

        //     if(value == 0){
        //         break;
        //     }
        //     sum += value;

        //     System.out.println(sum);

        // }

        // //問題4-19:数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成
        // BufferedReader c = new BufferedReader(new InputStreamReader( System.in ) );

        // int goukei = 0; //合計値
        // int count = 1; //数える数 ここは１でも良い気がする
        // for(; ;){
        //     int value = Integer.parseInt(c.readLine());
            
        //     if(value == 0){
        //         break;
        //     }
        //     goukei += value;
        //     count++;

        //     System.out.println("平均は" + (goukei / count));
        // }

        // //練習問題4-20:サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成
        BufferedReader d = new BufferedReader(new InputStreamReader( System.in ) );

        // int size = Integer.parseInt(d.readLine());

        // for(int i = 0; i < size; i++){
        //     for(int j = 0; j < i; j++){ //Jの範囲はj < iとなる
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //似たような問題
        // int sizes = Integer.parseInt(d.readLine());
        // // int sizes = 5;

        // for(int i = sizes; i > 0; i--){ //上の段の星の数
        //     for(int j = 0; j <= i; j++){ //下の段の星の数
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //練習問題4-21:サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成
        // int saizu = Integer.parseInt(d.readLine());

        // for(int i = 0; i < saizu; i++){
        //     for(int j = 0; j <= saizu; j++){
        //         if( i == j || ( saizu - i - 1 ) == j ){
        //             System.out.print("X");
        //         }else{
        //             System.out.print( " " );
        //         }
        //     }
        //     System.out.println();
        // }

        //練習問題4-22:フィボナッチ数列を表示するプログラムを作成：例：0, 1, 1,/ 2, 3, 5,/ 8, 13, 21, ...
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;

        while(n1 <= 1000){
            System.out.print( n1 + "," );

            n1 = n2;
            // n2 = n3;
            n3 = n1 + n2;
        }








    //     //備考:1～5の整数の平均値を求めてみる
    //     int value[] = new int[5];
    //     double sum_;

    //     for(int i = 0; i < value.length; i++){
    //         sum += value[i];
    //     }

    //     double ave = sum_ / value.length;
    //     System.out.println(ave);

    }
    

}