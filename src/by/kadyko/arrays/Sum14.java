package by.kadyko.arrays;
//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class Sum14 {
    public static void main(String[] args) {

        int iMax = -1;
        int iMin = -1;
        int scoreMax = -1;
        int scoreMin = 11;

        int array[] = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            if (scoreMax <= array[i]){
                scoreMax = array[i];
                iMax = i;
            }
            if (scoreMin >= array[i]) {
                scoreMin = array[i];
                iMin = i;
            }
        }
        System.out.println("Максимальная оценка " + scoreMax + " имеет номер " + iMax);
        System.out.println("Минимальная оценка " + scoreMin + " имеет номер " + iMin);

    }
}
