import java.util.Scanner;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);
    static char[] board = new char[10];
    public static char playerschoice;

    public static void main(String args[]) {
        System.out.println("Welcome to Tic-Tac-Toe game");
        boardInit();
        playerOption();
        showBoard();
        selectBox();
    }

    private static void boardInit() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void playerOption() {
        System.out.println("Player should select X or O: ");
        playerschoice = sc.next().charAt(0);
        char computerchoice;
        if (playerschoice == 'O' || playerschoice == 'X') {
            System.out.println("Valid Selection");
            if (playerschoice == 'O') {
                computerchoice = 'X';
            } else
                computerchoice = 'O';
        } else {
            System.out.println("Invalid Selection");
        }
    }

    public static void showBoard() {
        System.out.println(" ----------- ");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println(" ----------- ");
    }

    public static void selectBox() {
        System.out.println("Select index between 1 to 9:");
        int index = sc.nextInt();
        if (index > 9 || index < 1) {
            System.out.println("You have chosen wrong index");
            selectBox();
        } else
            board[index] = playerschoice;
            showBoard();
    }
}

