public class TicTacToe {
    static char[] board = new char[10];
    public static void main(String args[]) {
        System.out.println("Welcome to Tic-Tac-Toe game");
        board();
    }

    public static void board() {

        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
}
