package tiktaktoe;

import java.util.Arrays;

public class TikTakToe {
    static final char PLAYERX = 'X';
    static final char PLAYERO = 'O';
    private final char[][] map = new char[3][3];

    public void printMap() {
        System.out.println("  1 2 3");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillMap() {
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], '_');
        }
    }

    public boolean isTurn(char player, int row, int col) {
        if (row < 1 || row > 3 || col < 1 || col > 3) {
            return false;
        }
        if (map[row - 1][col - 1] == '_') {
            map[row - 1][col - 1] = player;
            return true;
        } else {
            return false;
        }
    }

    public boolean isDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == '_') return false;
            }
        }
        return true;
    }

    public boolean isWin(char player) {

        for (int i = 0; i < 3; i++) {
            if (map[i][0] == player && map[i][1] == player && map[i][2] == player) return true;
        }

        for (int j = 0; j < 3; j++) {
            if (map[0][j] == player && map[1][j] == player && map[2][j] == player) return true;
        }

        if (map[0][0] == player && map[1][1] == player && map[2][2] == player) return true;
        if (map[0][2] == player && map[1][1] == player && map[2][0] == player) return true;
        return false;
    }

}
