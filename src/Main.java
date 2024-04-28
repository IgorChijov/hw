//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 5;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно подождать");
        }

        int temperature = 15;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, надо надеть шапку");
        }

        int speed = 220;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то штраф платить не надо");
        }

        int humanAge = 21;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в детский сад");
        }
        if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в школу");
        }
        if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " ,то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить на работу");
        }

        int childAge = 14;
        boolean adult = false;
        if (childAge < 5){
            System.out.println("Если ребенку " + childAge + " лет, то он не может кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14 && adult == false){
            System.out.println("Если ребенку " + childAge + " лет, то он не может кататься на аттракционе без сопровождения взрослых");
        }
        if (childAge > 14){
            System.out.println("Если ребенку" + childAge + " лет, то он может кататься на аттракционе без сопровождения взрослых");
        }


        byte vanCapacity = 102;
        byte sittingPlace = 60;
        int standingPlace = vanCapacity - sittingPlace;
        int currentPassengers = 43;
        if (currentPassengers > 60 && currentPassengers < 102){
            System.out.println("Сейчас в вагоне доступно " +  (vanCapacity - currentPassengers) + " стоячих мест");
        }
        if (currentPassengers <= 60){
            System.out.println("Сейчас в вагоне доступно " + (vanCapacity - currentPassengers) + " мест, из которых " + ( sittingPlace -currentPassengers) + " сидячих мест, и " + standingPlace + " стоячих мест");
        }
        else {
            System.out.println("Вагон полностью заполнен");
        }

        int one = 6;
        int two = 2;
        int three = 5;
        if (one > two && two < three || three < two){
            System.out.println("Большее число - " + one);
        }
        if ( two > one && one < three   ){
            System.out.println("Большее число - " + two);
        }
        else if ( three > one && one < two) {
            System.out.println("Большее число - " + three);
        }
    }
}