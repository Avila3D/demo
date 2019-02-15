/**
 * @author Antonio Avila
 * CS 115 Assignment 2
 */

public class ConnFourService {

    ConnFourPlayer playerOne = new ConnFourPlayer("1","Black");
    ConnFourPlayer playerTwo = new ConnFourPlayer("2","Red");
    ConnFourCell [][] connectFourBoard = new ConnFourCell[6][7];

    public String ConnFourGame() {

        while(true) {

            if (!FoundWinner(connectFourBoard)) { // if no winner, keep playing

                if (playerOne.chipSet == playerTwo.chipSet) { // take player turns

                    // player one's turn

                    while (true) { // repeat choice if column full
                        int col = 0;
                        System.out.println("Player One, choose a column (between 0-6 to drop chip"); // player chooses column
                        // here I would get user input and make that the col value
                        if (DropChip(col, connectFourBoard, playerOne)) { // player one drops or plays chip if column not full
                            DropChip(col, connectFourBoard, playerOne);
                            playerOne.PlayChip(); // takes one chip off player total chip set
                            break;
                        } else {
                            System.out.println("This column is full, choose another");
                        }
                    }     // end of player one turn loop
                } else {

                    // player two's turn

                    while (true) { // repeat choice if column full
                        int col = 0;
                        System.out.println("Player Two, choose a column (between 0-6 to drop chip"); // player chooses column
                        // here I would get user input and make that the col value
                        if (DropChip(col, connectFourBoard, playerTwo)) { // player two drops or plays chip if column not full
                            DropChip(col, connectFourBoard, playerTwo);
                            playerTwo.PlayChip(); // takes one chip off player total chip set
                            break;
                        } else {
                            System.out.println("This column is full, choose another");
                        }
                    } // end of player two turn loop
                }

            } else if (FoundWinner(connectFourBoard)) {
                return " ";
            } else {
                return "It's a tie. Game Over!";
            }
            return "Thank you for playing.";

        } // end of game while true

    }  // end of ConnFourGame

    public boolean FoundWinner(ConnFourCell [][] board) {

        for (int row = 6; row < board.length; row--) { // check for 4 in a row in rows from bottom up
            for(ConnFourCell[] checkCell: board) {

            }

        }
        return false;
    }

    public boolean DropChip(int col, ConnFourCell[][] board, ConnFourPlayer player) { // start filling board with player's chips

        switch (col) {
            case 0:
                int rowCol0 = 6; // always start with the row at the bottom
                if (rowCol0 > -1) { // if it's less than zero then the column is full
                    board[rowCol0][0].setCellValueOf(player.chip.getChipValueOf()); // change cell to reflect player value
                    board[rowCol0][0].setCellColor(player.chip.getChipColor()); // change cell to reflect player color
                    rowCol0 --; // decrement until column is full
                } else {
                    return false; // if column full let player choose a different column
                }
                return true;
            case 1:
                int rowCol1 = 6;
                if (rowCol1 > -1) {
                    board[rowCol1][1].setCellValueOf(player.chip.getChipValueOf());
                    board[rowCol1][1].setCellColor(player.chip.getChipColor());
                    rowCol1--;
                } else {
                    return false;
                }
                return true;
            case 2:
                int rowCol2 = 6;
                if (rowCol2 > -1) {
                    board[rowCol2][2].setCellValueOf(player.chip.getChipValueOf());
                    board[rowCol2][2].setCellColor(player.chip.getChipColor());
                    rowCol2--;
                } else {
                    return false;
                }
                return true;
            case 3:
                int rowCol3 = 6;
                if (rowCol3 > -1) {
                    board[rowCol3][3].setCellValueOf(player.chip.getChipValueOf());
                    board[rowCol3][3].setCellColor(player.chip.getChipColor());
                    rowCol3--;
                } else {
                    return false;
                }
                return true;
            case 4:
                int rowCol4 = 6;
                if (rowCol4 > -1) {
                    board[rowCol4][4].setCellValueOf(player.chip.getChipValueOf());
                    board[rowCol4][4].setCellColor(player.chip.getChipColor());
                    rowCol4--;
                } else {
                    return false;
                }
                return true;
            case 5:
                int rowCol5 = 6;
                if (rowCol5 > -1) {
                    board[rowCol5][5].setCellValueOf(player.chip.getChipValueOf());
                    board[rowCol5][5].setCellColor(player.chip.getChipColor());
                    rowCol5--;
                } else {
                    return false;
                }
                return true;
            case 6:
                int rowCol6 = 6;
                if (rowCol6 > -1) {
                    board[rowCol6][6].setCellValueOf(player.chip.getChipValueOf());
                    board[rowCol6][6].setCellColor(player.chip.getChipColor());
                    rowCol6--;
                } else {
                    return false;
                }
                return true;
            default:
                return false;

        } // end of switch statement

    } // end of Drop Chip class

} // end of ConnFourService class

