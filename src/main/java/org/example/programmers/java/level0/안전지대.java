package org.example.programmers.java.level0;

public class 안전지대 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(board));
//        System.out.println("[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]".replace("[","{").replace("]","}"));
    }

    private static int solution(int[][] board) {
        int sum; // 안전지대의 수를 저장할 변수

        // 탐색한 결과를 담을 새로운 리스트 생성
        int boardXLen = board.length;
        int boardYLen = board[0].length;
        int[][] newBoard = new int[boardXLen][boardYLen];

        // dirX,dirY(좌표)를 기준으로 리스트 전체 탐색
        for (int x = 0; x < boardXLen; x++) {
            for (int y = 0; y < boardYLen; y++) {
                boolean flag = false; // 현재 위치에 지뢰가 있을 시, 조건문을 진행하기 위한 스위치
                if (board[x][y] == 1) {
                    flag = true;
                    newBoard[x][y] = 1;
                }
                if (flag) {
                    changeAround(newBoard, x, y);
                }
            }
        }
        sum = findArea(newBoard);
        return sum;
    }

    private static void changeAround(int[][] newBoard, int x, int y) { // 수정할 리스트, 현재 위치
        // 8방향 탐색을 위한 좌표 리스트
        int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};

        int xLen = newBoard.length;
        int yLen = newBoard[0].length;
        for (int i = 0; i < dirX.length; i++) {
            int aroundXIdx = x + dirX[i];
            int aroundYIdx = y + dirY[i];
            if (aroundXIdx >= 0 && aroundXIdx < xLen && aroundYIdx >= 0 && aroundYIdx < yLen && newBoard[aroundXIdx][aroundYIdx] != 1) {
                newBoard[aroundXIdx][aroundYIdx] += 10;
            }
        }
    }

    private static int findArea(int[][] newBoard) {
        int sum = 0;
        int xLen = newBoard.length;
        int yLen = newBoard[0].length;
        for (int i = 0; i < xLen; i++) {
            for (int j = 0; j < yLen; j++) {
                if (newBoard[i][j] == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printArr(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}