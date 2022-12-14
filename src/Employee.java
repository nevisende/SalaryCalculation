public class Employee {
    private String name;
    private double salary;
    private int hireYear;
    private short workHours;

    public  Employee(String name, double salary, int hireYear, short workHours) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public short getWorkHours() {
        return workHours;
    }

    public int getWorkingYear() {
        return 2021-this.hireYear;
    }

    public double tax() {
        if(this.salary < 1000 ) {
            return 0;
        }
        return this.salary * 3 / 100;
    }

    public double bonus() {
        byte hourlyPrice = 30;
        return (this.workHours-40) * hourlyPrice;
    }

    public double raiseSalary() {
        byte raiseSalaryRatio;
        int workingYear = getWorkingYear();

        if(workingYear > 19) {
            raiseSalaryRatio = 15;
        } else if(workingYear > 9) {
            raiseSalaryRatio = 10;
        } else raiseSalaryRatio = 5;

        return this.salary * raiseSalaryRatio/100;
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();
        double salaryWithTaxAndBonus = salary + bonus - tax;
        double totalSalary = salaryWithTaxAndBonus + raiseSalary;
        System.out.printf("Adı: %s\nMaaşı : %s\nÇalışma Saati : %s\nBaçlangıç Yılı : %s\nVergi: %s\nBonus : : %s\n",
                name, salary, workHours,hireYear,tax,bonus);
        System.out.printf("Maaş Artışı  : %s\nVergi ve Bonuslar ile birlikte maaş : %s\nToplam maaş : %s\n",
                raiseSalary,salaryWithTaxAndBonus,totalSalary);
        return "";
    }

}
