package org.hannmx;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // ваш список чисел

        double averageOfEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // фильтруем только четные числа
                .mapToInt(Integer::intValue) // преобразуем Integer в int для вычисления среднего значения
                .average() // вычисляем среднее значение
                .orElse(0); // если нет четных чисел, возвращаем 0

        System.out.println("Среднее значение четных чисел: " + averageOfEvenNumbers);
    }
}