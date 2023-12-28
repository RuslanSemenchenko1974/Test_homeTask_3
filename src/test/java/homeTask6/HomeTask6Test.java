package homeTask6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeTask6Test {
    private HomeTask6 item = new HomeTask6();

    @Test
    void avarageNumbersTest(){
        List <Integer> list1 = new ArrayList<>(Arrays.asList(3,3,3));
        List <Integer> list2 = new ArrayList<>(Arrays.asList(4,4,4));
        List <Integer> list3 = new ArrayList<>();
        assertEquals(item.avarageNumbers(list1, list2), "Первый список имеет меньшее среднее значение");
        assertEquals(item.avarageNumbers(list2, list1), "Первый список имеет большее среднее значение");
        assertEquals(item.avarageNumbers(list1, list1), "Средние значения равны");
        assertThrows(IllegalArgumentException.class, () -> item.avarageNumbers(list1, list3), "List is empty");
    }
    @Test
    void calculateAverageTest(){
        List <Integer> list1 = new ArrayList<>(Arrays.asList(3,3,3));
        assertEquals(item.calculateAverage(list1), 3);
    }
}