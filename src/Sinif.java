import java.util.Scanner;

public class Sinif {
    public static void main(String[] args) {

        int vize1Notu, vize2Notu, finalNotu;
        double gecmeNotu;
        Scanner girdi=new Scanner(System.in);

        System.out.println("1. vize notunuzu yazın");
        vize1Notu = girdi.nextInt();

        if (vize1Notu<0 || vize1Notu>100)
        {
            System.out.println("Bu not girisi dogru degil lutfen tekrar giriniz...");
            System.out.println("1. vize notunuzu yazın");
            vize1Notu = girdi.nextInt();
        }
        else
        {
            System.out.println("2. vize notunuzu yazın");
            vize2Notu = girdi.nextInt();
            if (vize2Notu<0 || vize2Notu>100)
            {
                System.out.println("Bu not girisi dogru degil lutfen tekrar giriniz...");
                System.out.println("2. vize notunuzu yazın");
                vize2Notu = girdi.nextInt();
            }
            else
            {
                System.out.println("final notunuzu yazın");
                finalNotu = girdi.nextInt();
                if (finalNotu<0 || finalNotu>100)
                {
                    System.out.println("Bu not girisi dogru degil lutfen tekrar giriniz...");
                    System.out.println("final notunuzu yazın");
                    finalNotu = girdi.nextInt();
                }
                else
                {
                    gecmeNotu = 0.25 * vize1Notu + 0.25 * vize2Notu + 0.5 * finalNotu;
                    System.out.println("Dönem sonu geçme notunuz:" + gecmeNotu);
                    if (gecmeNotu<60)
                    {
                        System.out.println("Final notunuz 60'tan küçük olduğu için kaldınız");
                    }
                    else if  (gecmeNotu < 50)
                    {
                        System.out.println("Dönem sonu genel puanınız: "+gecmeNotu);
                        System.out.println("Dönem sonu genel puanınız 50'den küçük olduğu için kaldınız");
                    }
                    else
                    {
                        System.out.println("Sınıfı geçtiniz");
                        System.out.println("Dönem sonu genel puanınız:" + gecmeNotu);
                        System.out.println("Harf notu cinsinden:" + harfNotuGetir(gecmeNotu));
                    }

                }
                }
            }
        }









    public static String harfNotuGetir(double not)
    {
        String harfNotu;

        if(not<=49)
        {
            harfNotu="FF";
        }
        else if(not<=59)
        {
            harfNotu="FD";
        }
        else if(not<=64)
        {
            harfNotu="DD";
        }
        else if(not<=69)
        {
            harfNotu="DC";
        }
        else if(not<=74)
        {
            harfNotu="CC";
        }
        else if(not<=79)
        {
            harfNotu="CB";
        }
        else if(not<=84)
        {
            harfNotu="BB";
        }
        else if(not<=89)
        {
            harfNotu="BA";
        }
        else
        {
            harfNotu="AA";
        }
        return harfNotu;
    }

}
