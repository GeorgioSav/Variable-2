public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a=666;
        System.out.println("Значение переменной A с типом int равно " + a);
        byte b=111;
        System.out.println("Значение переменной B с типом byte равно " + b);
        short c=22222;
        System.out.println("Значение переменной C с типом short равно " + c);
        long d=9999999L;
        System.out.println("Значение переменной D с типом long равно " + d);
        float n=2.5f;
        System.out.println("Значение переменной N с типом float равно " + n);
        double k=0.872;
        System.out.println("Значение переменной K с типом double равно " + k);

        byte z=26;
        double x=z+1.12;
        System.out.println(x);
        long s=987678965549L;
        System.out.println(s);
        float r=2.786f;
        System.out.println(r);
        short y=569;
        System.out.println(y);
        short u=-159;
        System.out.println(u);
        short i=27897;
        System.out.println(i);
        byte p=67;
        System.out.println(p);


        byte lydmila=23;
        byte anna=27;
        byte katia=30;
        int totalStudents=lydmila+anna+katia;
        System.out.println(totalStudents);
        short sheetsOfPaper=480;
        int papersOneStudents=sheetsOfPaper/totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersOneStudents + " листов бумаги");

        byte machinePerformance=16;
        byte workingHoursMinutes=2;
        int twentyMinutes=machinePerformance*10;
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        int oneHour=machinePerformance/workingHoursMinutes*60;
        int day=oneHour*24;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDay=day*3;
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        int month=threeDay*10;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        int totalNumberOfPaints=120;
        int whitePaint=2;
        int brownPaint=4;
        int paintPerClass=whitePaint+brownPaint;
        int totalClasses=totalNumberOfPaints/paintPerClass;
        int totalWhite=totalClasses*whitePaint;
        int totalBrown=totalClasses*brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски ");

        byte bananas=5;
        short milk=200;
        byte iceCream=2;
        byte eggs=4;
        byte oneBananas=80;
        short oneMilk=105;
        byte oneIceCream=100;
        byte oneEggs=70;
        int weightBananas=bananas*oneBananas;
        int weightMilk=oneMilk*2;
        int weightIceCream=iceCream*oneIceCream;
        int weightEggs=eggs*oneEggs;
        int totalisPondus=weightEggs+weightMilk+weightBananas+weightIceCream;
        System.out.println("Общий вес спортзавтрака " + totalisPondus + " грамм!");
        int grPerKg=1000;
        float weightKg=totalisPondus/(float)grPerKg;
        System.out.println("Общий вес спортзавтрака " + weightKg + " кг!");

        int grPerKg2=1000;
        int pondusKg=7;
        int totalisPondusGr=grPerKg2*pondusKg;
        int oneDietDay=totalisPondusGr/250;
        int twoDietDay=totalisPondusGr/500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то потратит " + oneDietDay + " дней ");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то потратит " + twoDietDay + " дней ");
        int averageNumber=(oneDietDay+twoDietDay)/2;
        System.out.println("Чтобы добиться результата похудения, потребуется в среднем " + averageNumber + " дней ");

        int masha=67760;
        int denis=83690;
        int kristina=76230;
        int year=12;
        int mashaYear=masha*year;
        int denisYear=denis*year;
        int kristinaYear=kristina*year;
        int mashaSalary=masha/10;
        int denisSalary=denis/10;
        int kristinaSalary=kristina/10;
        int mRaisingMonth=masha+mashaSalary;
        int dRaisingMonth=denis+denisSalary;
        int kRaisingMonth=kristina+kristinaSalary;
        int mRaisingYears=mRaisingMonth*year;
        int dRaisingYears=dRaisingMonth*year;
        int kRaisingYears=kRaisingMonth*year;
        int annualIncomeM=mRaisingYears-mashaYear;
        int annualIncomeD=dRaisingYears-denisYear;
        int annualIncomeK=kRaisingYears-kristinaYear;
        System.out.println("Маша теперь получает " + mRaisingMonth + " рублей. Годовой доход вырос на " + annualIncomeM + " рублей ");
        System.out.println("Денис теперь получает " + dRaisingMonth + " рублей. Годовой доход вырос на " + annualIncomeD + " рублей ");
        System.out.println("Кристина теперь получает " + kRaisingMonth + " рублей. Годовой доход вырос на " + annualIncomeK + " рублей ");




    }

}