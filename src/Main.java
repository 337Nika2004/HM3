public class Main {
    public static void main(String[] args) {
        // Задача 1
        // Объявите переменные типа int, byte, short, long, float, double.
        // Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        // Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        int a = 1;
        byte b = 0;
        short c = 11;
        long d = 1000;
        float e = 1.0f;
        double f = 4.123;
        System.out.println("Задача 1");
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        // Задача 2
        //Инициализируйте переменные, используйте изученные ранее типы переменных.
        double a1 = 27.12;
        long l = 987678965549L;
        double c1 = 2.786;
        short d1 = 569;
        short e1 = -159;
        int f1 =27897;
        byte g1 = 67;
        System.out.println("Задача 1");
        System.out.println(a1);
        System.out.println(l);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
        // Задача 3
        int sheets = 480;
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int sheetsByPerson = sheets / (lp + as + ea);
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано по " + sheetsByPerson + " листов бумаги");
        // Задача 4
        float bottle = 16;
        float bottleMinutes = bottle / 2; // производительность бутылок в минуту
        float twentyMinutes = bottleMinutes * 20;
        float oneDay = bottleMinutes * 24 * 60;
        float threeDays = bottleMinutes * 24 * 60 * 3;
        float thirtyDays = bottleMinutes * 24 * 60 * 30;
        System.out.println("Задача 4");
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + thirtyDays + " штук бутылок");
        // Задача 5
        byte allCans = 120;
        byte whiteCan = 2;
        byte brownCan = 4;
        int number = allCans / (whiteCan + brownCan);
        int allWhiteCans = number * whiteCan;
        int allBrownCans = number * brownCan;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + number + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");
        // Задача 6
        // Рецепт
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        short bananas = 5 * 80;
        short milk = 200 / 100 * 105;
        short icecraem = 2 * 100;
        short eggs = 4 / 1 * 70;
        int all = bananas + milk + icecraem + eggs;
        System.out.println("Задача 6");
        System.out.println(all + " грамм");
        System.out.println(all / 1000 + " кг");
        // Задача 7
        short allKilos = 7 * 1000; // в граммах
        short one = 250; // 1 случай
        short two = 500; // 2 случай
        System.out.println("Задача 7");
        System.out.println(allKilos / one + " дней в среднем потребовалось, чтобы добиться результата похудения");
        System.out.println(allKilos / two + " дней в среднем потребовалось, чтобы добиться результата похудения");
        // Задача 8
        // Маша получает 67 760 рублей в месяц
        // Денис получает 83 690 рублей в месяц
        // Кристина получает 76 230 рублей в месяц
        int maria = 67760;
        int denis = 83690;
        int kristina = 76230;
        double m1 = maria * 1.1;
        double de1 = denis + (denis / 100 * 10);
        double am1 = denis * 1.1; // таким способом программа почему то выводит 92059.00000000001 ?
        double kr1 = kristina * 1.1;
        System.out.println("Маша теперь получает " + m1 + " рублей. Годовой доход вырос на " + (m1 - maria) + " рублей");
        System.out.println("Денис теперь получает " + de1 + " рублей. Годовой доход вырос на " + (de1 - denis) + " рублей");
        System.out.println("Крисина теперь получает " + kr1 + " рублей. Годовой доход вырос на " + (kr1 - kristina) + " рублей");
    }
}