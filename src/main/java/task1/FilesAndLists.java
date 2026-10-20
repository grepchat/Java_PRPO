package task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FilesAndLists {
    // 1. Приветствие по имени из командной строки
    public static void greetUser(String[] args) {
        String name = args.length > 0 ? args[0] : "Гость";
        System.out.println("Привет, " + name + "!");
    }

    // 4. Сравнение пароля
    public static boolean checkPassword(String input) {
        return "Secret123".equals(input);
    }

    // 10. Сортировка строк из файла через ArrayList и Collections.sort()
    public static void sortFileLines(String filePath) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) lines.add(line);
        } catch (IOException e) { System.out.println("Ошибка: " + e.getMessage()); }
        java.util.Collections.sort(lines);
        lines.forEach(System.out::println);
    }

    // 12. Различные слова из файла (HashSet, регистр не важен)
    public static Set<String> getUniqueWords(String filePath) {
        Set<String> words = new HashSet<>();
        try (Scanner scanner = new Scanner(new java.io.File(filePath))) {
            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase().replaceAll("[^a-zA-Z]", ""));
            }
        } catch (Exception e) {}
        return words;
    }

    // 13. Частота встречаемости слов (HashMap, регистр различается)
    public static Map<String, Integer> getWordFrequency(String filePath) {
        Map<String, Integer> map = new HashMap<>();
        try (Scanner scanner = new Scanner(new java.io.File(filePath))) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) map.put(word, map.getOrDefault(word, 0) + 1);
            }
        } catch (Exception e) {}
        return map;
    }
}