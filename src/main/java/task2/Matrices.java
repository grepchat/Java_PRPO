package task2;

public class Matrices {
    // 6. N-местная автостоянка
    public static class Parking {
        private final boolean[] places;
        public Parking(int n) { places = new boolean[n]; }
        public int arrive(int spot) {
            for (int i = spot; i < places.length; i++) if (!places[i]) { places[i] = true; return i; }
            for (int i = 0; i < spot; i++) if (!places[i]) { places[i] = true; return i; }
            return -1; // Нет мест
        }
        public void leave(int spot) { places[spot] = false; }
    }

    // 7. Разреженные матрицы (сумма и произведение)
    public static void sparseMatrices() { /* Реализация циклических списков матриц */ }

    // 10. Двойное шифрование (поиск ключей K1 и K2)
    public static void doubleEncryption() { /* Алгоритм подбора 20-битных ключей */ }

    // 14. Выделение различных фигур на клетчатом листе (HashSet)
    public static void findFigures() { /* Поиск связных компонент через HashSet */ }

    // 15. Прямоугольная подматрица с максимальным количеством одинаковых элементов (ArrayDeque)
    public static void findSubMatrix() { /* Анализ матрицы с ArrayDeque */ }
}