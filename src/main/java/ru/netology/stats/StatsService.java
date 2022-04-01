package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public long calculateSum(long[] numbers) {
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        return sum;
    }

    //Средняя сумма продаж в месяц
    public long calculateAverSum(long[] numbers) {
        return calculateSum(numbers) / numbers.length;
    }

    // номер месяца с мах суммой (последний месяц)
    public long maxNumberMonth(long[] numbers) {
        int maxMonth = 0;
        int month = 0;
        for (long number : numbers) {
            if (number >= numbers[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // номер месяца с мin суммой (последний месяц)
    public long minNumberMonth(long[] numbers) {
        int minMonth = 0;
        int month = 0;
        for (long number : numbers) {
            if (number <= numbers[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, продажи ниже среднего
    public long lengthMonth(long[] numbers) {
        int index = 0;
        for (long number : numbers) {
            if (number < calculateAverSum(numbers)) {
                index += 1;
            }
        }
        return index;
    }

    //Кол-во месяцев, продажи выше среднего
    public long lengthMonthLong(long[] numbers) {
        int index = 0;
        for (long number : numbers) {
            if (number > calculateAverSum(numbers)) {
                index += 1;
            }
        }
        return index;
    }
}
