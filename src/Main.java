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
        }
        if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + " , то ему нужно ходить на работу");
        }

        int childAge = 14;
        boolean adult = true;
        if (childAge < 5) {
            System.out.println("Если ребенку " + childAge + " лет, то он не может кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14 && adult == false) {
            System.out.println("Если ребенку " + childAge + " лет, то он не может кататься на аттракционе без сопровождения взрослых");
        }
        if (childAge >= 5 && childAge <= 14 && adult == true) {
            System.out.println("Если ребенку " + childAge + " лет, то он может кататься на аттракционе с сопровождением взрослых");
        }
        if (childAge > 14) {
            System.out.println("Если ребенку" + childAge + " лет, то он может кататься на аттракционе без сопровождения взрослых");
        }


        byte vanCapacity = 102;
        byte sittingPlace = 60;
        int place = 61;
        if (place > vanCapacity) {
            System.out.println("Вагон заполнен");
        } else {
            if (place > sittingPlace) {
                System.out.println("Есть стоячее место");
            } else {
                System.out.println("Есть сидячее место");
            }
        }

        int one = 6;
        int two = 55;
        int three = 55;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);

            }
        }
    }
}
