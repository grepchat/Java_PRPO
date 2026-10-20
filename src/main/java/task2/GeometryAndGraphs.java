package task2;

import java.util.*;

public class GeometryAndGraphs {
    // 4. Класс Неориентированный граф
    public static class Graph {
        private final Map<Integer, List<Integer>> adjList = new HashMap<>();
        public Graph(int vertices) {
            for (int i = 0; i < vertices; i++) adjList.put(i, new ArrayList<>());
        }
        public void addEdge(int u, int v) { adjList.get(u).add(v); adjList.get(v).add(u); }
        public void removeEdge(int u, int v) { adjList.get(u).remove((Integer) v); adjList.get(v).remove((Integer) u); }
    }

    // 11. Прямые по точкам (HashMap)
    public static void findLines(List<Point> points) {
        // Логика вычисления коэффициентов прямых k и b
    }

    // 12. Клетки внутри круга в порядке возрастания расстояния (PriorityQueue)
    public static void findCellsInCircle(double radius) {
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingDouble(c -> c.distance));
        // Заполнение приоритетной очереди клетками
    }

    // 13. Точка пересечения отрезков с минимальной абсциссой (TreeMap)
    public static void findIntersection(List<Segment> segments) {
        TreeMap<Double, Point> intersections = new TreeMap<>();
        // Логика поиска пересечений
    }

    public static class Point { double x, y; }
    public static class Cell { double distance; int x, y; }
    public static class Segment { Point p1, p2; }
}