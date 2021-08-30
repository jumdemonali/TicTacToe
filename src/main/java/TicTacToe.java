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
        System.out.println("Player should select X or O: ");
        char playerschoice = sc.next().charAt(0);
        char computerchoice;
        if(playerschoice == 'O'|| playerschoice =='x')
        {
            System.out.println("Valid Selection");
            if (playerschoice=='O')
            {
                computerchoice = 'X';
            }
            else
                computerchoice='O';
        }
        else
        {
            System.out.println("Invalid Selection");
        }
    }
}
