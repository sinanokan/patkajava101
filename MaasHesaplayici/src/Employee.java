public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        if(salary>=0){
            this.salary = salary;
        }
        if(workHours>=0){
            this.workHours = workHours;
        }
        if(hireYear>=0 && hireYear<=2021){
            this.hireYear = hireYear;
        }
    }
    double tax(){
        if (this.salary<=1000){
            return 0;
        }else {
            return (salary*3)/100.0;
        }
    }
    double bonus(){
        if(this.workHours - 40 <= 0){
            return 0;
        } else if (this.workHours - 40 > 0) {
            return (this.workHours - 40)*30;
        }
        return 0;
    }
    double raiseSalary(){
        int workedYear = 2021 -this.hireYear;
        if(workedYear < 10){
            return (this.salary*5)/100;
        } else if (workedYear < 20) {
            return (this.salary*10)/100;
        }else {
            return (this.salary*15)/100;
        }
    }
    @Override
    public String toString(){
        return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours
                + "\nBaşlangıç Yılı: " + this.hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus()
                + "\nMaaş Artışı: " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maaş: "
                + (this.salary + bonus() - tax()) + "\nToplam Maaş: " + (this.salary + bonus() - tax() +raiseSalary());

    }
}
