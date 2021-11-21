package chapterEight.TicTacToe;

public class Player {
    public char turn = 'X';

    public void changePlayer() {
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';

        }
    }

    public char getTurn() {
        return turn;
    }


}


