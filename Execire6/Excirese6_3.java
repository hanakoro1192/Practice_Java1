package Execire6;


public class Excirese6_3{

    public static void main(String[] args) {
        //練習6-7
        for(int i = 0; i < 9; i++){
            Kuku(i);
        }

        //問題6-7
        for(int n = 1000; n < 10100; n++){
            if(Sosu(n)){ //1000から10100までの繰り返し
                System.out.print( n + " " );
            }
        }

        //問題6-8
        for(int n = 11; n <= 20; n++){
            System.out.print(Finaine(n) + "である");
        }
    }

    
    static void Kuku( int num ){
    for( int i = 1 ; i <= 9 ; i++ )
        System.out.printf( " %2d", num * i );

    System.out.println();
    }

    static boolean Sosu( int num ){
    if( num <= 3 )
        return true;

    for( int i = 2 ; i <= ( num / 2 ) ; i++ )
        if( ( num % i) == 0 )
            return false;

    return true;
    }
    //問題6-8
    static int Finaine(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return Finaine(n -2) + Finaine(n - 1);
        }
    }
}