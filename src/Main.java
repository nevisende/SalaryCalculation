public class Main {
    public static void main(String[] args) {
        Employee firstPerson = new Employee("Furkan", 2000.0,1985, (short) 45);
        String name = firstPerson.getName();
        double salary = firstPerson.getSalary();
        short workHours = firstPerson.getWorkHours();
        int hireYear = firstPerson.getHireYear();
        double tax = firstPerson.tax();
        double bonus = firstPerson.bonus();
        double raiseSalary = firstPerson.raiseSalary();
        double salaryWithTaxAndBonus = salary + bonus - tax;
        double totalSalary = salaryWithTaxAndBonus + raiseSalary;
        System.out.printf("Adı: %s\nMaaşı : %s\nÇalışma Saati : %s\nBaçlangıç Yılı : %s\nVergi: %s\nBonus : : %s\n",
                name, salary, workHours,hireYear,tax,bonus);
        System.out.printf("Maaş Artışı  : %s\nVergi ve Bonuslar ile birlikte maaş : %s\nToplam maaş : %s\n",
                raiseSalary,salaryWithTaxAndBonus,totalSalary);

    }
}
