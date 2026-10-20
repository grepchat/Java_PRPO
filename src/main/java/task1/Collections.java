package task1;

import java.io.File;
import java.util.*;

public class Collections {
    // 2. Аргументы в обратном порядке
    public static void printArgsReverse(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) System.out.println(args[i]);
    }

    // 3. Список каталога и подкаталогов
    public static void listCatalog(File dir, List<String> result) {
        if (dir != null && dir.exists()) {
            for (File file : dir.listFiles()) {
                result.add(file.getAbsolutePath());
                if (file.isDirectory()) listCatalog(file, result);
            }
        }
    }

    // 5. Суммы и произведения аргументов-чисел
    public static void calcArgs(String[] args) {
        int sum = 0; long product = 1;
        for (String arg : args) {
            int val = Integer.parseInt(arg);
            sum += val; product *= val;
        }
        System.out.println("Сумма: " + sum + ", Произведение: " + product);
    }

    // 6. Пересечение и объединение множеств
    public static void setOperations() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> union = new HashSet<>(set1); union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1); intersection.retainAll(set2);
    }

    // 9. Отрицательные в конец, положительные в начало без доп. объектов
    public static void rearrangeList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            while (left < right && list.get(left) >= 0) left++;
            while (left < right && list.get(right) < 0) right--;
            if (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
            }
        }
    }

    // 11. Проверка скобок через стек
    public static boolean checkBrackets(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) return false;
            }
        }
        return stack.isEmpty();
    }

    // 15. Функция поиска диапазона итераторов по символу
    public static List<String> findRangeByChar(List<String> list, char ch) {
        List<String> res = new ArrayList<>();
        for (String s : list) {
            if (!s.isEmpty() && s.charAt(0) == ch) res.add(s);
        }
        return res;
    }
}