package by.kadyko.lesson3;
//Начав тренировки, спортсмен в первый день пробежал 10 км.
//        Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//        Какой суммарный путь пробежит спортсмен за 7 дней?

public class Sum1 {

    public static void main(String[] args) {

        float  currentDayDistance = 10.0f;
        float generalDistance = 10.0f;

        for (int i = 2; i <= 7; i++) {

            currentDayDistance = (currentDayDistance * 0.1f) + currentDayDistance;
            generalDistance = generalDistance + currentDayDistance;

        }

        System.out.println("За 7 дней спротсмен пробежит " + generalDistance + " км");


    }
}
