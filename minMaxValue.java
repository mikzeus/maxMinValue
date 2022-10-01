import java.util.Scanner;

public class minMaxValue {
    public static void main(String[] args) {

        int j, enBüyük=1, enKücük=1;

        Scanner inp= new Scanner(System.in);
        System.out.printf("kaç tane sayı gireceksiniz:");
        int n= inp.nextInt();

        for (int i=1; i<=n; i++){
            System.out.printf(i + "nci sayıyı giriniz: ");
             j= inp.nextInt();

             if (i==1){

                enBüyük=j;
                enKücük=j;
             }

             if (j > enBüyük){
                enBüyük=j;
             }


            if (j < enKücük){
               enKücük=j;
            }


        }
        System.out.println("en büyük sayı: " + enBüyük);
        System.out.println("en küçük sayı: " + enKücük );
    }

}

