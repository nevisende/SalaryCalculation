import java.util.Scanner;

public class Printer {
    public void printer() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ad ve Soyad yazınız: ");
        String name = input.nextLine();

        System.out.print("Maaşı yazınız : ");
        double salary = input.nextDouble();

        System.out.print("Haftalık çalışma saatini yazınız : ");
        short workHours = input.nextShort();

        System.out.print("İşe başlangıç yılını yazınız : ");
        int hireYear = input.nextInt();

        Employee firstPerson = new Employee(name, salary,hireYear, workHours);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.print("Çalışanın verileri kaydedildi, bilgilerini görmek için : 1\nYeni bir çalışan girdisi oluşturmak için : 2\n"
            +"Çıkış yapmak için : 0 \n'a basınız : ");

        byte optionNumber = input.nextByte();

        if(optionNumber == 2) {
            printer();
        } else if(optionNumber == 1) {
            System.out.println("----------------------------------------------------------------------------------------");
            firstPerson.toString();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Çıkış yapmak ister misiniz? (y / n) : ");

            String secondAnswer = String.valueOf(input.hasNext("n"));
            if(secondAnswer == "true") {
                printer();
            }
        }

    }
}
