import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];

    public static void main(String args[]) {
        System.out.println("Welcome to Tic-Tac-Toe game");
        board();
        PlayerOption();
    }

    private static void board() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void PlayerOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player select X or O: ");
        char playmakers = sc.next().charAt(0);
        if (playmakers == 'O' || playmakers == 'X') {
            System.out.println("Valid Selection");
            if (playmakers == 'O') {
                playmakers = 'X';
            } else
                playmakers = 'O';
        } else {
            System.out.println("Invalid Selection");
        }
    }
}
