package task2;

import java.util.*;

public class Collections {
    // 1. Иосиф Флавий (ArrayList / LinkedList)
    public static int josephus(List<Integer> list) {
        int idx = 0;
        while (list.size() > 1) {
            idx = (idx + 1) % list.size();
            list.remove(idx);
        }
        return list.get(0);
    }

    // 2. Перестановка элементов относительно X без доп. объектов
    public static void partitionList(List<Integer> list, int x) {
        int i = 0, j = list.size() - 1;
        while (i <= j) {
            if (list.get(i) <= x) i++;
            else if (list.get(j) > x) j--;
            else {
                java.util.Collections.swap(list, i, j);
                i++; j--;
            }
        }
    }

    // 3. Сжатие текста по алгоритму Хаффмена (PriorityQueue)
    public static void huffmanCompress(String text) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
        PriorityQueue<Integer> pq = new PriorityQueue<>(freq.values());
        // Логика построения дерева Хаффмена через PriorityQueue
    }

    // 5. Поиск числа, наиболее близкого к заданному
    public static Integer findClosest(TreeSet<Integer> set, int target) {
        Integer lower = set.floor(target);
        Integer higher = set.ceiling(target);
        if (lower == null) return higher;
        if (higher == null) return lower;
        return Math.abs(target - lower) <= Math.abs(higher - target) ? lower : higher;
    }

    // 8. Сжатие списка Z (удаление дублирующих наименований)
    public static List<String> compressNames(List<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    // 9. Слияние двух упорядоченных списков с изменением ссылок
    public static LinkedList<Integer> mergeLists(LinkedList<Integer> c1, LinkedList<Integer> c2) {
        c1.addAll(c2);
        java.util.Collections.sort(c1);
        return c1;
    }
}