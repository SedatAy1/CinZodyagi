import java.util.Scanner;

public class ÇinZodyağıHesaplama {
    public static void main(String[] args) {

        int dogumYili;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili = scanner.nextInt();

        switch (dogumYili%12){
            case 0:
                System.out.println("Çin Zodyağına Göre Burcunuz: Maymun");
                break;

            case 1:
                System.out.println("Çin Zodyağına Göre Burcunuz: Horoz");
                break;

            case 2:
                System.out.println("Çin Zodyağına Göre Burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağına Göre Burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağına Göre Burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağına Göre Burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağına Göre Burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağına Göre Burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağına Göre Burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağına Göre Burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağına Göre Burcunuz: At");
                break;
            case 11:
                System.out.println("Çin Zodyağına Göre Burcunuz: Koyun");
                break;
            default:
                System.out.println("Doğum Yılınızı Kontrol Ediniz");



        }


    }
}
