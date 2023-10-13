import java.util.Scanner;
public class clas {
    public static void main(String[] args) {
        int mate, turkce, fizik, kimya, muzik, sinir=55;

        Scanner input = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz:");
        mate= input.nextInt();

        System.out.print("türkçe notunuzu giriniz:");
        turkce=input.nextInt();

        System.out.print("kimya notunu giriniz:");
        kimya= input.nextInt();

        System.out.print("fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.print("müzik notunuzu giriniz:");
        muzik= input.nextInt();

        double ortalama= ( mate + fizik + turkce + kimya + muzik )/ 5;


        if (mate>100 || mate<0||turkce<00||turkce>100||fizik<00||fizik>100||kimya<00||kimya>100||muzik<00||muzik>100){

            System.out.print("notunuz 0-100 arası giriniz:");
        }

        if( ortalama >=sinir){
            System.out.print("tebrikler geçtiniz\n not ortalaması "+ ortalama);
        } else {
            System.out.print("kaldınız\nnot ortalamanız:"+ ortalama);

        }


    }
}
