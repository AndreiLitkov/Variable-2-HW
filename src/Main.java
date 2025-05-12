//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //Задача 1
        byte house = 2;
        short photos = 174;
        int money = 154900;
        long peopleInWorld = 7300000L;
        float force = 23.4f;
        double g = 9.9876492;
        System.out.println("Значение переменной house с типом byte равно " + house);
        System.out.println("Значение переменной photos с типом short равно "+ photos);
        System.out.println("Значение переменной money с типом int равно " + money);
        System.out.println("Значение переменной peopleInWorld с типом long равно " + peopleInWorld);
        System.out.println("Значение переменной force с типом float равно " + force);
        System.out.println("Значение переменной g с типом double равно " + g);

        //Задача 2
        float q = 27.12f;
        long s = 987678965549L;
        float w = 2.786f;
        short e = 569;
        short i = -159;
        int j = 27897;
        byte r = 67;

        //Задача 3
        short pupils1 = 23;
        short pupils2 = 27;
        short pupils3 = 30;
        short totalPaper = 480;
        short totalPupils = (short) (pupils1 + pupils2 + pupils3);
        float paperPerPerson = (float) totalPaper /totalPupils;
        System.out.println("На каждого ученика рассчитано "+ paperPerPerson + " листов бумаги");

        //Задача 4
        byte performance= 8;
        int minutes20 = performance*20;
        int dayTime = 24*60;
        int dayPerformance = performance*dayTime;
        int performance3Days = dayPerformance*3;
        int performanceMonth = dayPerformance*30;
        System.out.println("За 20 минут машина произвела "+ minutes20 + " штук бутылок");
        System.out.println("За сутки машина произвела "+ dayPerformance + " штук бутылок");
        System.out.println("За 3 дня машина произвела "+ performance3Days + " штук бутылок");
        System.out.println("За месяц машина произвела "+ performanceMonth + " штук бутылок");

        //Задача 5
        byte classes = 20;
        int white = classes*2;
        int brown = classes*4;
        System.out.println("В школе, где "+ classes + " классов, нужно " + white + " банок белой краски и "+ brown + " банок коричневой краски.");

        //Задача 6
        byte bananas = 5;
        byte weightBananas = 80;
        short milk = 2;
        short weightMilk = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte eggs = 4;
        byte weightEggs = 70;
        int totalWeight = bananas*weightBananas + milk*weightMilk + iceCream*weightIceCream + eggs*weightEggs;
        System.out.println("Вес спортзавтрака "+ totalWeight + " грамм");
        float totalWeightKg = totalWeight /1000f;
        System.out.println("Вес спортзавтрака " + totalWeightKg + " килограмм");

        //Задача 7
        short weightToLoose = 7000;
        short weightLooseInDay1 = 250;
        short weightLooseInDay2 = 500;
        int middleWeightLoose = (weightLooseInDay2 + weightLooseInDay1) / 2;
        int daysToLoose1 = weightToLoose/weightLooseInDay1;
        int daysToLoose2 = weightToLoose/weightLooseInDay2;
        int daysToLooseMid = weightToLoose/middleWeightLoose;
        System.out.println("Понадобится " + daysToLoose1  + " дней чтобы сбросить необходимый вес!Если ежедневно будет сбрасывать 250 г");
        System.out.println("Понадобится " +  daysToLoose2 + " дней чтобы сбросить необходимый вес!Если ежедневно будет сбрасывать 500 г");
        System.out.println("Понадобится " + daysToLooseMid  + " дней чтобы сбросить необходимый вес!Если ежедневно будет сбрасывать " + middleWeightLoose + " г");

        //Задача 8
        int salaryMariaMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryKristinaMonth = 76230;

        int salaryMariaYear = salaryMariaMonth*12;
        int salaryDenisYear = salaryDenisMonth*12;
        int salaryKristinaYear = salaryKristinaMonth*12;

        float salaryMariaNew = salaryMariaMonth*0.10f + salaryMariaMonth;
        float salaryDenisNew = salaryDenisMonth*0.10f + salaryDenisMonth;
        float salaryKristinaNew = salaryKristinaMonth*0.10f + salaryKristinaMonth;

        float salaryMariaYearNew = salaryMariaNew*12f;
        float salaryDenisYearNew = salaryDenisNew*12f;
        float salaryKristinaYearNew = salaryKristinaNew*12f;

        float differenceDenis = salaryDenisYearNew - salaryDenisYear;
        float differenceMaria = salaryMariaYearNew - salaryMariaYear;
        float differenceKristina = salaryKristinaYearNew - salaryKristinaYear;

        System.out.println("Мария теперь получает " + salaryMariaNew + " рублей. Годовой доход вырос на " + differenceMaria + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");

    }
}