package task1;

import java.util.*;

public class Polynomials {
    // 7. Сложение многочленов через HashMap (ключ - степень, значение - коэффициент)
    public static Map<Integer, Double> addPolynomials(Map<Integer, Double> p1, Map<Integer, Double> p2) {
        Map<Integer, Double> res = new HashMap<>(p1);
        for (Map.Entry<Integer, Double> entry : p2.entrySet()) {
            res.put(entry.getKey(), res.getOrDefault(entry.getKey(), 0.0) + entry.getValue());
        }
        return res;
    }

    // 8. Умножение многочленов (списки коэффициентов)
    public static List<Integer> multiplyPolynomials(List<Integer> p1, List<Integer> p2) {
        int[] res = new int[p1.size() + p2.size() - 1];
        for (int i = 0; i < p1.size(); i++) {
            for (int j = 0; j < p2.size(); j++) {
                res[i + j] += p1.get(i) * p2.get(j);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int val : res) result.add(val);
        return result;
    }

    // 14. Операции с HashMap (строки, ключи > 5, ключ == 0, длина строки > 5)
    public static void processHashMap(HashMap<Integer, String> map) {
        map.forEach((k, v) -> {
            if (k > 5) System.out.println("Ключ > 5: " + v);
        });
        if (map.containsKey(0)) System.out.println("Значение при ключей 0: " + map.get(0));
        long product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) product *= entry.getKey();
        }
        System.out.println("Произведение ключей (длина > 5): " + product);
    }
}