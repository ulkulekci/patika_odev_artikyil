import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ARTİK YİL HESAPLAMA");
        Scanner input=new Scanner(System.in);
        System.out.println("Yil Giriniz :");
        int yil=input.nextInt();
        if ((yil%4==0&&yil%100!=0)||(yil%400==0))
            System.out.println(yil+"  artik yildir");
        else
            System.out.println(yil+"  artik yil degildir");
    }
}
