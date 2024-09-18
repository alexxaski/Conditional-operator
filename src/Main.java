public class Main {
    public static void main(String[] args) {
        int human = 16;
        if (human >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        int woman = 27;
        if (woman >= 18) {
            System.out.println("она совершеннолетняя");
        } else {
            System.out.println("она не достиг совершеннолетия, нужно немного подождать");
        }
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        int speed = 70;
        boolean exceeding = !(speed > 60);
        if (exceeding) {
            System.out.println("можно ездить спокойно");
        } else {
            System.out.println("придется заплатить штраф");
        }
        int man = 17;
        if (man >= 2 && man <= 6) {
            System.out.println("нужно ходить в детский сад");
        } else if (man >= 7 && man <= 17) {
            System.out.println("нужно ходить в школу");
        } else if (man >= 18 && man <= 24) {
            System.out.println("его место в университете");
        } else if (man > 24) {
            System.out.println("пора ходить на работу");

        } else {
            System.out.println("не может ходить");
        }
        int child = 15;
        if (child < 5) {
            System.out.println("не может кататься на аттракционе");
        }
        else if (child >=5 && child <=14 ) {
            System.out.println("может кататься только в сопровождении взрослого");
        }else {
            System.out.println("может кататься без сопровождения взрослого");
        }
        int places = 102 ;
        boolean capacity = places >= 102 ;
/* исправил */
        if (places >= 60 && places <=102) {
            System.out.println("есть стоячие места");

        } else if (capacity){
            System.out.printf("вагон уже полностью забит");

        }else {
            System.out.println("есть сидячие места");
        }
        int one = 4;
        int two = 6;
        int three = 3;

        if (three > two && three > one) {
            System.out.println(three);
        } else if (two > three && two > one) {
            System.out.println(two);
        }else {
            System.out.println(one);
        }

    }
}