public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int contribution = 15000;
        int total = 0;
        int mounth = 0;
        while (total <= 2_459_000){
           mounth = mounth + 1;
           total = total + contribution;
           total = total + total/100;
           System.out.println("Месяц " + mounth + " Сумма накоплений равна " + total + " Рублей");
       }
        System.out.println("Для того, чтобы накопить " + total + " С ежемесячным вкладом " + contribution + " Необходимо " + mounth + " Месяцев");
        System.out.println("Задача 2");
        int numbersF = 0;
        while (numbersF < 10){
            numbersF = numbersF + 1;
            System.out.print(numbersF + " ");
        }
        System.out.println();
        for (int numbersB = 10; numbersB > 0; numbersB--){
            System.out.print(numbersB + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        int Y = 12_000_000;
        int year = 0;
        int birthRate = 17;
        int mortality = 8;
        int populationGrowth = birthRate - mortality;
        int globalPopulationGrowth = populationGrowth * (Y/1000);
        while (year < 10){
            year++;
            Y = Y + globalPopulationGrowth;
            System.out.println("Год " + year + " Численность населения составляет " + Y);
        }
        System.out.println("Задание 4,5");
        double totalMoney = 15000;
        double profit = 0.07;
        for (mounth = 1; totalMoney <= 12_000_000; mounth++){
            totalMoney = totalMoney + totalMoney*profit;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " Сумма накоплений " + (int)totalMoney);
            }
        }
        System.out.println("Задание 6");
        double bankTotalMoney = 15000;
        double bankProfit = 0.07;
        double mounthForDeposit = 9*12;
        for (mounth = 1; mounth <= mounthForDeposit; mounth++){
            bankTotalMoney = bankTotalMoney + bankTotalMoney * bankProfit;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " Сумма накоплений " + (int) bankTotalMoney);
            }
        }
        System.out.println("Задание 7");
        int firstFraiday = 3;
        for (int fraiday = firstFraiday; fraiday < 31; fraiday = fraiday + 7){
            System.out.println("Сегодня пятница, " + fraiday + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задание 8");
        int startYear = 2024 - 200;
        int endYear = 2024 + 100;
        for (int comet = 0; comet <= endYear; comet +=79){
            if (comet >= startYear){
                System.out.println(comet);
            }
        }
    }
}