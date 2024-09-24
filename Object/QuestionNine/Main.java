package Object.QuestionNine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';
        char winner = ' ';

        while (winner == ' ' && !game.isFull()) {
            game.displayBoard();
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.isValid(row, col)) {
                game.playMove(currentPlayer, row, col);
                if (game.isWinner(currentPlayer)) {
                    winner = currentPlayer;
                }
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch players
            } else {
                System.out.println("This move is not valid.");
            }
        }

        game.displayBoard();
        if (winner != ' ') {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        scanner.close();
    }
}