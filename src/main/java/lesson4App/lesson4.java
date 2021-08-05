package lesson4App;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    /**
     * Игровая карта
     */
    public static char[][] map;
    /**
     * Размер поля
     */
    public static final int SIZE = 3;
    /**
     * Сколько точек для победы
     */
    public static final int DOTS_TO_WIN = 3;
    /**
     * Пустая ячейка
     */
    public static final char DOT_EMPTY = '*';

    public static final char DOT_X = 'X';

    public static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            printMap();
            aiTurn();
            if (checkWin(DOT_O)) {
                System.out.println("Выиграл компуктер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            printMap();

        }
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Инициализирует и заполняет карту пустыми  ячейками
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Валидная ли ячейка
     *
     * @param x
     * @param y
     * @return
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;

    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
        System.out.printf("Робот ходит в точку %d %d", x + 1, y + 1);

        System.out.println();

    }

    public static boolean checkWin(char sym) {
        int counterToHorizontal =0;
        int counterToWinCross =0;
        int counterToWinVertical =0;
        for (int i = 0; i < map.length; i++) {
            for (int j =0; j<map.length;j++){
                if(map[i][j]==sym){
                    counterToWinVertical ++;
                }
                if (map[j][i]==sym){
                    counterToHorizontal ++;
                }
            }
            for(int j = map.length -1 ; j>=0; j--){
                if (map[j][i]==sym){
                    counterToWinCross ++;
                    break;
                }
            }
            if(counterToWinCross == 3 || counterToWinVertical== 3 || counterToHorizontal== 3){
                return true;
            }
            counterToHorizontal =0;
            counterToWinVertical = 0;
        }

        return false;

    }
}

