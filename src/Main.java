public class Main {
    public static void main(String[] args) {
        // Задание 1
        int age = 18;
        if (age>=18){
            System.out.println("Наши поздравления");}
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");}


        // Задание 2

        int AgeHuman = 118;

       if (AgeHuman>7&&AgeHuman<18){
            System.out.println("Ребенок ходит в школу");
        } else if (AgeHuman>=18&&AgeHuman<24){
            System.out.println("Человек уже закончил школу и может отправляться в университет");}
        else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");}

        //Задание 3
            int place = 102;
            if (place<=60){
                System.out.println("Вы можете выбрать сидячее место");}
            else if (place>60&&place<=102){
                System.out.println("Остались только стоячие места");}
            else if (place>102){
                System.out.println("Свободных мест нет");}

        //Задание 3.1
            int AgeMan = 83;
            if (AgeMan>=2&&AgeMan<=6){
                System.out.println("Нужно ходить в детский сад");}
                else if (AgeMan>=7&&AgeMan<18){
                    System.out.println("Нужно ходить в школу");}
                else if (AgeMan>=18&&AgeMan<24){
                System.out.println("Нужно ходить в университет");}
                else {
                System.out.println("Нужно ходить на работу");}

                //Задание 3.2
        int AgeKids = 7;
                boolean AdultY, AdultN;
                AdultY = true;
                AdultN = false;
                        if (AgeKids<5){
                            System.out.println("Нельзя кататься");}
                        else if (AgeKids>5&&AgeKids<14||AdultY){
            System.out.println("Можно кататься, но в сопровождении взрослого");}
                        else if (AgeKids>5&&AgeKids<14||AdultN){
                            System.out.println("Нельзя кататься так как нет взрослого");
                        }
                        else  {
                            System.out.println("Можно кататься самостоятельно");}
           // Задание 3.3
        int one = 10;
        int two = 72;
        int free = 11;
        if (one>two&&one>free) {
            System.out.println("Большее число " +one);}
            else if (two>one&&two>free) {
                System.out.println("Большее число " +two);}
                else if (free>one&&free>two){
                System.out.println("Большее число " +free);}

                int clientOS = 1; //1 ios, 0 android
                int clientDeviceYear = 2012;

        if (clientOS==1&&clientDeviceYear>=2015) {
            System.out.println( "Установите версию приложения для iOS по ссылке");}
            else if (clientOS==1&&clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
    else if (clientOS!=1&&clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");}
    else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

//Задание 3
        int year = 2024;
    if (year%4 == 0&&year%400 ==0||year % 100 != 0) {
        System.out.println(year +" год является високосным");}
    else {System.out.println(year + " год не является високосным");}

 // Задание 4
        int deliveryDistance = 60;
    int deliveryDays = 1;
    if (deliveryDistance>20){deliveryDays++;}
    if (deliveryDistance>60){deliveryDays++;}
        System.out.println("Доставка займёт " + deliveryDays + " дня");

  //Задание 5
int monthNumber = 12;
switch (monthNumber){
    case 1:
    case 2:
    case 12:
        System.out.println("Сейчас Зима");
    break;
    case 3:
    case 4:
    case 5:
         System.out.println("Сейчас Весна");
    break;
    case 6:
    case 7:
    case 8:
        System.out.println("Сейчас Зима");
    break;
    case 9:
    case 10:
    case 11:
        System.out.println("Сейчас Зима");
    break;
    default:
        System.out.println("На венере всегда лето");
}


    }}











