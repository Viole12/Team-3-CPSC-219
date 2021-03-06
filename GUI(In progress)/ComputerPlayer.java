
/*
* Import necessary package(s)
*/
import java.util.Random;

public class ComputerPlayer extends Thread{
	

	private TokenColor computerColor = TokenColor.BLANK;
	private GameBoard gameBoard = null;
	private int col ;
	private int row ;


	public ComputerPlayer(GameBoard aGameBoard, TokenColor aColor){
	    gameBoard = aGameBoard;
	    computerColor = aColor;
	}
	/*
	  * Result of method: Generate random input of column and row for the Computer to
	  * place their piece on their turn. A valid input which in our
	  * game must be between 1 and 8 for both rows and columns.
	  */

	public int setRandomCol () {
		Random rand = new Random();
		col = rand.nextInt(7);
		col += 1;
		return (col) ;
	}

	public int setRandomRow () {
		Random rand = new Random();
		row = rand.nextInt(7);
		row += 1;
		return (row) ;
	}

	/*
	  * Result of method: First do the setRandomCol and setRandomRow methods to get the input,
	  * then check if the random numbers entered by
	  * the Computer is a valid space on the board via the checkAdjacentCells.
	  * Once this has been done, the flip method is called upon to check to
	  * see whether a game piece placed in the row and column specified is capable of flipping
	  * the opposite color's pieces. If not, since this is a rule of how to play Othello,
	  * the Computer needs to generate another Random number for rows and columns again
	  * Which row and column you wish to move to will be re-prompted.
	  */

	public boolean makeMove()  {			
		boolean status = false;
		if (gameBoard.checkForValidMove(computerColor) == true) {
			while (status == false) {
				setRandomRow();
				setRandomCol(); 
						
				///CORNERS OP 
				/* 1st Priority
				 * Result of CORNERS OP is to give prioritizing for Computers to give its input
				 * on the uppermost and lowermost corners on the board because the Human Player
				 * would not be able to flip to retake the position again.
				 */
				if (gameBoard.checkAdjacentCells(0,0,computerColor)== true && 
					gameBoard.flip(0,0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(0, 7, computerColor)== true &&
					gameBoard.flip(0, 7, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 0, computerColor)== true &&
					gameBoard.flip(7, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 7, computerColor)== true &&
					gameBoard.flip(7, 7, computerColor, false) != 0) {
					status = true ;
				}
				///////////////////////////////////////////////////////////////////////////////////
						
						
				/// Edges of Board & Priority
				/* 2nd Priority
				 * Result of Edges of Board & Priority is to give prioritizing for Computer Player
				 * to give its input on the tip of the board because the Human Player would not 
				 * easily be able to flip to retake the position again.
				 */
				else if (gameBoard.checkAdjacentCells(1, 0, computerColor)== true &&
					gameBoard.flip(1, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(6, 0, computerColor)== true &&
					gameBoard.flip(6, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(1, 7, computerColor)== true &&
					gameBoard.flip(1, 7, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(6, 7, computerColor)== true &&
					gameBoard.flip(6, 7, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(0, 1, computerColor)== true &&
					gameBoard.flip(0, 1, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(0, 2, computerColor)== true &&
					gameBoard.flip(0, 2, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(0, 3, computerColor)== true &&
					gameBoard.flip(0, 3, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(0, 4, computerColor)== true &&
					gameBoard.flip(0, 4, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(0, 5, computerColor)== true &&
					gameBoard.flip(0, 5, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(2, 0, computerColor)== true &&
					gameBoard.flip(2, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(3, 0, computerColor)== true &&
					gameBoard.flip(4, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(4, 0, computerColor)== true &&
					gameBoard.flip(4, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(5, 0, computerColor)== true &&
					gameBoard.flip(5, 0, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 1, computerColor)== true &&
					gameBoard.flip(7, 1, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 2, computerColor)== true &&
					gameBoard.flip(7, 2, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 3, computerColor)== true &&
					gameBoard.flip(7, 3, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 4, computerColor)== true &&
					gameBoard.flip(7, 4, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 5, computerColor)== true &&
					gameBoard.flip(7, 5, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(7, 6, computerColor)== true &&
					gameBoard.flip(7, 6, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(2, 7, computerColor)== true &&
					gameBoard.flip(2, 7, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(3, 7, computerColor)== true &&
					gameBoard.flip(3, 7, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(4, 7, computerColor)== true &&
					gameBoard.flip(4, 7, computerColor, false) != 0) {
					status = true ;
				}
				else if (gameBoard.checkAdjacentCells(5, 7, computerColor)== true &&
					gameBoard.flip(5, 7, computerColor, false) != 0) {
					status = true ;
				}
				//////////////////////////////////////////////////////////////////////////////////////
						
				
				/// Random with most flipped pieces
				/*3rd Priority
				 * Result of this method is for Computer Player to only move in the
				 * most possible flipping position.
				 */
				
				else if (gameBoard.checkAdjacentCells(row, col, computerColor) == true && 
					gameBoard.flip(row, col, computerColor, false) != 0) {	
					int Aflip = 1 ;
						while (gameBoard.checkAdjacentCells(row, col, computerColor) == true &&
							gameBoard.flip(row, col, computerColor, false) > Aflip){
							Aflip = gameBoard.flip(row, col, computerColor, false) ;
						}	
					status = true ;
				}
			}
		}
		return status;
	}
/*
 
    /// We're  making below's code into comments because there exist bug which freezes the game
	/// so it's better for us to not implement it, but we show you that we're capable of making more AI
			
	/// Medium Level AI  // Computer only move in most flipped chesses
	public boolean makeMove2() {
		boolean status = false;
		if (gameBoard.checkForValidMove(computerColor) == true){
			while (status == false) {
		    	setRandomRow();
		    	setRandomCol();

		    	///Random with most flipped pieces
		    	if (gameBoard.checkAdjacentCells(row, col, computerColor) == true &&
		    	    gameBoard.flip(row, col, computerColor, false) != 0) {
		    		int Aflip = 1 ;
		    		while (gameBoard.checkAdjacentCells(row, col, computerColor) == true &&
		    			gameBoard.flip(row, col, computerColor, false) > Aflip){
		    	    	Aflip = gameBoard.flip(row, col, computerColor, false) ;
		    	   }
		    		status = true ;
		    		}
		     } 
		}
		return status;
	}
			
	///Easy Level AI   // Totally random move
	public boolean makeMove3() {
		boolean status = false;
		if (gameBoard.checkForValidMove(computerColor) == true){
			while (status == false) {
				setRandomRow();
			    setRandomCol();
			    
			    ///Random with most flipped pieces
			    while (gameBoard.checkAdjacentCells(row, col, computerColor) == true &&
			    	gameBoard.flip(row, col, computerColor, false) != 0) {
			    		status = true ;
			    }
			} 
		}
		return status;
	}
*/

}
