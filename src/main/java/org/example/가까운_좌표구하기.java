package org.example;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 가까운_좌표구하기 {
    public static void main(String[] args) {
        // 좌표 리스트 초기화 (double 형식)
        double[][] coordinates = {{2.5, -3.5}, {-4.5, 2.0}, {5.0, 2.5}, {-6.0, -2.5}, {3.0, 10.0}};

        Scanner scanner = new Scanner(System.in);
        System.out.print("X 좌표를 입력하세요: ");
        double x = scanner.nextDouble();
        System.out.print("Y 좌표를 입력하세요: ");
        double y = scanner.nextDouble();

        int k = 3; // 가장 가까운 좌표의 개수
        int[] closestIndices = findClosestCoordinates(coordinates, x, y, k);

        if (closestIndices != null) {
            System.out.println("가장 가까운 " + k + "개의 좌표의 인덱스는:");
            for (int i = 0; i < k; i++) {
                System.out.println("인덱스 " + closestIndices[i]);
            }
        } else {
            System.out.println("좌표 리스트가 비어있습니다.");
        }
    }

    public static int[] findClosestCoordinates(double[][] coordinates, double x, double y, int k) {
        if (coordinates.length == 0) {
            // 좌표 리스트가 비어있을 경우 null 반환
            return null;
        }

        // 우선순위 큐를 사용하여 가장 가까운 좌표 k개를 찾음
        PriorityQueue<CoordinateDistance> minHeap = new PriorityQueue<>((a, b) -> Double.compare(b.distance, a.distance));

        for (int i = 0; i < coordinates.length; i++) {
            double distance = Math.sqrt(Math.pow(coordinates[i][0] - x, 2) + Math.pow(coordinates[i][1] - y, 2));
            minHeap.offer(new CoordinateDistance(i, distance));

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] closestIndices = new int[k];
        for (int i = 0; i < k; i++) {
            closestIndices[i] = minHeap.poll().index;
        }

        return closestIndices;
    }

    private static class CoordinateDistance {
        int index;
        double distance;

        public CoordinateDistance(int index, double distance) {
            this.index = index;
            this.distance = distance;
        }
    }
}
