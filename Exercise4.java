import java.io.*;

class Exercise4 {
    
    public static void main(String[] args) throws IOException {
        

        //問題4-1
        for(int i = 0; i < 10; i++){
            System.out.println("SPAM");
        }

        //問題4-2
        for(int j = 0; j <= 9; j++){
            System.out.println((3 * j) + "");
        }
        
        //問題4-3
        int x = 1;
        for(int k = 0; k <= 9; k++){
            x *= 2;
            System.out.println("2の" + x + "乗=" + k);
        }

        //問題4-4
        int y = 1;
        for(int i = 2; i <= 7; i++){
            y *= i;
            System.out.println(y);
        }

        BufferedReader a = new BufferedReader(new InputStreamReader( System.in ) );

        //練習4-5
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int value = Integer.parseInt(a.readLine());
            sum += value;
        }
        System.out.println("合計は" + (sum/ 10));

        //ここ度20回繰り返す操作を行う
        int kumasan = 0;
        for(int j = 0; j < 10; j++){
            int saikyo = Integer.parseInt(a.readLine());
            kumasan += saikyo;
        }
        System.out.println("最強くまさんは" + (kumasan/ 10));

        //練習4-6
        int win = 0;
        for(int i = 0; i < 10; i++){
            int result = Integer.parseInt(a.readLine());

            if(result == 1){
                win += 1;
            }
        }
        System.out.println("勝ち" + win + "負け" + (10 - win) + "です");

        //ここで整数、10 か 100 を 10 回入力する。これを対戦成績と考え、10 を負け、100 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成
        int kati = 10;
        for(int i = 0; i < 10; i++){
            int saikyo = Integer.parseInt(a.readLine());

            if(saikyo == 100){ //負けが生じる場合
                kati += 0;
            }
        }
        System.out.println("勝ち" + kati + "負け" + (110 - kati) + "です");

        int giants = 0; //巨人の初期値 得点につながる
        int tigers = 0;  //阪神の初期値 得点につながる
        //中日を入れてみよう:三角野球
        int kyuniti = 0;

        for(int game = 0; game < 9; game++){
            System.out.println(game + "回,巨人の得点");
            giants = Integer.parseInt(a.readLine()); //得点

            System.out.println(game + "回,中日の得点");
            kyuniti = Integer.parseInt(a.readLine()); //中日の得点

            System.out.println(game + "回,阪神の得点");
            tigers = Integer.parseInt(a.readLine()); //得点
        }
        System.out.println("巨人" + giants + "阪神" + tigers + "中日" + kyuniti);
        System.out.println("最強は" + MaxValue(giants, MaxValue(tigers, kyuniti)));

        if(giants > tigers){
            System.out.println("巨人の勝ち");
        }else{
            System.out.println("阪神の勝ち");
        }

        int max_value = 0;

        for(int i = 0; i < 10; i++){
        int value = Integer.parseInt(a.readLine());

        if( value > max_value){
            max_value = value;
            }
        }
        System.out.println("最大値は" + max_value); //上のカッコとは別で考える

        //最小値を求めるプログラム
        int min_value = 0;
        for(int i = 0; i < 10; i++){
            int value = Integer.parseInt(a.readLine());

            if(value < min_value){
                value = min_value;
            }
        }
        System.out.println("最小値は" + min_value);


        int max = 0; //最大値
        int min = 0; //最小値

        for(int i = 0; i < 10; i++){
            int value = Integer.parseInt(a.readLine());

            if(i == 0){
                max = value;
                min = value;
            }else{
                if(value > max){
                    max = value; //最大値の場合
                }
                if(value < min){
                    min = value; //最小値の場合
                }
            }
        }
        System.out.println("最大値=" + max + "最小値" + min);

        //問題4-10:個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成。
        int count = Integer.parseInt(a.readLine());

        String A = "くまさん";
        for(int i = 0; i < count; i++){
            System.out.println(A + "*");
        }

        //問題4-11個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るもの
        int count1 = Integer.parseInt(a.readLine());

        for(int i = 0, out = 0; i < count1; count1++){ //outが0と初期値を設定する
            System.out.println(out++);

            if(out > 9){
                out = 0;
            }
        }

        //問題4-12
        int sum_kumasan = 0;

        while(sum <= 100){
            sum += Integer.parseInt(a.readLine());
        }
        System.out.println(sum_kumasan);

        //次は1000で止めるプログラムにしてみよう
        int sum_kumasanz = 0;

        while(sum_kumasanz <= 100){
            sum_kumasanz += Integer.parseInt(a.readLine());
        }
        System.out.println(sum_kumasanz);


        //問題4-13
        int strike = 0;
        int ball = 0;

        while(strike < 2 && ball < 3){
            System.out.println("ストライク=1 or ボール=2 ?");

            int judge = Integer.parseInt(a.readLine());

            if(judge == 1 ){
                strike++;
            }else if(judge == 2){
                ball++;
            }
        }
        System.out.println( ball + "ボール," + strike + "ストライク" );

        //問題4-14
        int strikes = 0;
        int balls = 0;
        int file = 0;

        while(strikes < 3 && balls < 4){
            System.out.println("ストライク=1 or ボール=2 or ファール=3 ?");

            int judge = Integer.parseInt(a.readLine());

            if(judge == 1){
                strike++;
            }else if(judge == 2){
                balls++;
            }else if(judge == 3 && strike < 2){
                strike++;
            }
        }
        System.out.println( ball + "ボール," + strike + "ストライク" );


    }

    static void MaxValue(int A, int B){
        if(A > B){
            System.out.ptintln(A);
        }else{
            System.out.ptintln(B);
        }
        return;
    }

}