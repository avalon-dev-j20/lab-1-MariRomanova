package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {
    }

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static Number sum(Number[] values) {
        Number sum = 0;
        if (values instanceof Double[]) {
            for (Number value : values) sum = sum.doubleValue() + value.doubleValue();
            return sum;
        } else if (values instanceof Integer[]) {
            for (Number value : values) sum = sum.intValue() + value.intValue();
            return sum;
        } else return null;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static double avg(Number[] values) {
        return (double) sum(values).doubleValue() / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static int maxInt(int a, int b) {
        return a > b ? a : b;
    }

    public static double maxDouble(double a, double b) {
        return a > b ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static Number max(Number[] values) {
        Number result = values[0].intValue();
        if (values instanceof Double[]) {
            for (int i = 1; i < values.length; i++) {
                result = maxDouble(result.doubleValue(), values[i].doubleValue());
            }
            return result;
        } else if (values instanceof Integer[]) {
            for (int i = 1; i < values.length; i++) {
                result = maxInt(result.intValue(), values[i].intValue());
            }
            return result;
        } else return null;
    }


        /**
         * Возвращает меньшее из двух переданных значений.
         *
         * @param a первое значение
         * @param b второе значение
         * @return меньшее из дух значений
         */
        public static int minInt(int a, int b) {
            return a < b ? a : b;
        }
        public static double minDouble(double a, double b) {
            return a < b ? a : b;
        }

        /**
         * Выполняет поиск минимального значения массива.
         *
         * @param values массив значений
         * @return минимальное значение массива
         */

        public static Number min(Number[] values) {
            Number result = values[0].intValue();
            if (values instanceof Double[]) {
                for (int i = 1; i < values.length; i++) {
                    result = minDouble(result.doubleValue(), values[i].doubleValue());
                }
                return result;
            } else if (values instanceof Integer[]) {
                for (int i = 1; i < values.length; i++) {
                    result = minInt(result.intValue(), values[i].intValue());
                }
                return result;
            } else return null;
        }


}