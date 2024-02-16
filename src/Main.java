public class Main {
    public static void main(String[] args) {
        double salary = 75000; //entry level software engineer salary
        double rent = 1500;
        double rentInsurance = 65;
        double wifi = 50;
        double groceries = 241.4;
        double LTE = 50;
        double commuteCosts = 143;
        double yearlyBonus = 0;
        double tv = 0; //I will not be using a tv
        double fun = 80;
        double monthlyStudentLoan = 845;
        double savingsAccount = 0; //this was the money left after monthly expenses
        int months = 0;
        while (savingsAccount < 150000) {
            months++;
            if (months % 12 == 0) { //meaning yearly inflation
                if ((int) (Math.random() * 6) + 1 == 1) { //random chance of successful year
                    yearlyBonus = (salary * (((Math.random() * 6) + 7) /100) * 0.78);
                    savingsAccount += yearlyBonus; //you get a bonus!!
                }
                salary = salary + salary * (((Math.random() * 3) + 5) /100);
                rent *= 1 + (((Math.random() * 3) + 3) / 100);
                rentInsurance *= 1 + (((Math.random() * 3) + 3) / 100);
                wifi *= 1 + (((Math.random() * 3) + 3) / 100);
                groceries *= 1 + (( (Math.random() * 3) + 3) / 100);
                LTE *= 1 + (( (Math.random() * 3) + 3) / 100);
                commuteCosts *= 1 + (( (Math.random() * 3) + 3) / 100);
                tv = 0; //no tv
                fun *= 1 + (( (Math.random() * 3) + 3) / 100);
            }
            if (months >= 168){
                monthlyStudentLoan = 0;
            }
            savingsAccount += (salary * 0.48)/12; //0.48 because 0.5 aka 50% went to taxes, and 0.02 aka 2% went to retirement
            savingsAccount -= rent;
            savingsAccount -= rentInsurance;
            savingsAccount -= wifi;
            savingsAccount -= groceries;
            savingsAccount -= LTE;
            savingsAccount -= commuteCosts;
            savingsAccount -= tv;
            savingsAccount -= fun;
            if ((int) (Math.random() * 5) + 1 == 1) {
                savingsAccount -= 150;
            }
            if (monthlyStudentLoan != 0){
                savingsAccount = savingsAccount - monthlyStudentLoan;
            }
        }
        System.out.println("You will save up $150,000 dollars in: " + months + " months, or " + (double) (months) /(12) + " years.");
    }
}