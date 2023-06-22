package org.example.programmers.java.level0;

public class 캐릭터의_좌표 {
    public static void main(String[] args) {
        String[] key_input = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};
        System.out.println(solution(key_input, board));
    }

    private static int[] solution(String[] key_input, int[] board) {
        int tempX = (board[0] - 1) / 2;
        int tempY = (board[1] - 1) / 2;
        int x = 0;
        int y = 0;
        for (String direction : key_input) {
            if (direction.equals("up") && y < tempY) {
                y++;
            } else if (direction.equals("down") && y > -tempY) {
                y--;
            } else if (direction.equals("left") && x > -tempX) {
                x--;
            } else if (direction.equals("right") && x < tempX) {
                x++;
            }
        }
        return new int[]{x, y};
    }
    
}