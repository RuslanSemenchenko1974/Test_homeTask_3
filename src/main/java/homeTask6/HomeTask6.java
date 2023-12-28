package homeTask6;

import java.util.List;

public class HomeTask6 {

    private void check(List<Integer> number){
        if (number.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
    }
    public double calculateAverage(List <Integer> marks) {
        check(marks);
        Integer sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }

        return sum / marks.size();
    }
    public String avarageNumbers(List<Integer> number1, List<Integer> number2) {

        double num1 = calculateAverage(number1);
        double num2 = calculateAverage(number2);
        if ( num1 > num2) {
            return "Первый список имеет большее среднее значение";
        } else if ( num1 == num2) {
            return  "Средние значения равны";
        } else {
            return "Первый список имеет меньшее среднее значение";
        }


    }
}
