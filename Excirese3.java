import java.io.*; //InputStreamReaderに反映
import java.io.BufferedReader;
import java.io.IOException;


class Excirese3{
    public static void main(String[] args) throws IOException{
        // //フィールドの設定:この書き方でも良いが前の問題を用いるため
        // int x = 10;
        // int y = 5;

        //Scannerを使う必要はない
        BufferedReader A = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(A.readLine());
        int y = Integer.parseInt(A.readLine());

        //文字型で書いてみる
        String S = A.readLine();
        System.out.println(S);

        //この書き方は無理
        // InputStreamReader B = new InputStreamReader();


        //問題3-1
        if(x > y){
            System.out.println("xはyより大きい");
        }

        //問題3-2
        if(x > y){
            System.out.println("xはyより大きい");
        }else{
            System.out.println("xはyより小さい");
        }

        //問題3-3
        if(x > y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }

        //問題3-4
        int X = Integer.parseInt(A.readLine());
        int Y = Integer.parseInt(A.readLine());
        if(X > Y){
            System.out.println("XはYより大きい");
        }else if(X == Y){
            System.out.println("xはyと等しい");
        }else{
            System.out.println("xはyより小さい");
        }

        //問題3-5
        int B = Integer.parseInt(A.readLine());
        if(B % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

        //問題3-6
        int C = Integer.parseInt(A.readLine());
        if(C > 0 && C % 2 == 0){
            System.out.println("正の偶数");
        }else if(C > 0 && !(C % 2 == 0)){
            System.out.println("正の奇数");
        }else if(C < 0 && C % 2 == 0){
            System.out.println("負の偶数");
        }else{
            System.out.println("負の奇数");
        }

        //問題3-7
        int score = Integer.parseInt(A.readLine());
        if(score > 60){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }

        if(score > 80){
            System.out.println("たいへんよくできました。");
        }else if(score > 60 && score < 80){
            System.out.println("よくできました");
        }else{
            System.out.println("残念でした");
        }

        if(score > 80){
            System.out.println("優");
        }else if(score > 70 && score < 80){
            System.out.println("良");
        }else if(score > 60 && score < 70){
            System.out.println("可");
        }else{
            System.out.println("不可");
        }

        //問題3-8
        int Middle_Exam = Integer.parseInt(A.readLine());
        int End_Exam = Integer.parseInt(A.readLine());
        int Sum = Middle_Exam + End_Exam;
        if(Middle_Exam > 60 && End_Exam > 60){
            System.out.println("合格");
        }else if(Sum > 130){
            System.out.println("合格");
        }else if(Sum > 100 && (End_Exam > 90 || End_Exam > 90)){
            System.out.println("合格");
        }else{
            System.out.println("不都合");
        }

        //問題3-9
        //ここはよくわからなかったためしっかり復習
        System.out.println("曜日を設定して下さい");
        System.out.println(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
        int day = Integer.parseInt(A.readLine());

        System.out.println( "時間帯を選択してください" );
        System.out.print( "0=午前、1=午後、2=夜間");
        int zoze = Integer.parseInt(A.readLine());

        boolean boopen = true; //ここはどういう意味
        if(day == 0){
            boopen = false; //休診の場合
        }else if(zoze == 0 && (day == 2 || day == 5)){
            boopen = false; //休診の場合
        }
    }
}