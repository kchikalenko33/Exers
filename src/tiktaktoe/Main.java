package tiktaktoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        TikTakToe tikTakToe = new TikTakToe();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        tikTakToe.fillMap();
        boolean isPlayerX = true;

        while (true) {
            tikTakToe.printMap();
            char player = isPlayerX ? TikTakToe.PLAYERX : TikTakToe.PLAYERO;
            System.out.println("Ход делает " + player);

            try {
                System.out.print("Введите номер строки - ");
                int row = Integer.parseInt(reader.readLine());
                System.out.print("Введите номер колонки - ");
                int col = Integer.parseInt(reader.readLine());

                if (!tikTakToe.isTurn(player, row, col)) {
                    System.out.println("Недопустимый ход! Клетка занята или координаты вне доски. Повторите.");
                    continue;
                }

                if (tikTakToe.isWin(player)) {
                    tikTakToe.printMap();
                    System.out.println("Игрок " + player + " победил!");
                    break;
                }

                if (tikTakToe.isDraw()) {
                    tikTakToe.printMap();
                    System.out.println("Ничья!");
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число (1-3)! Повторите.");
                continue;
            } catch (IOException e) {
                System.out.println("Ошибка ввода. Завершение игры.");
                break;
            }

            isPlayerX = !isPlayerX;
        }
    }
}


