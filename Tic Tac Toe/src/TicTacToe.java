import java.util.Scanner;

public class TicTacToe {
    char[][] board = new char[3][3];
    char currentPlayer;
    TicTacToe()
    {
        currentPlayer = 'X';
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                board[i][j]='-';
            }
        }
    }
    public void printBoard()
    {
        System.out.println("-------------");
        for (int i=0;i<3;i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public boolean move(int row, int column)
    {
        if(row>=0 && row<=2 && column>=0 && column<=2 && board[row][column]=='-')
        {
            board[row][column]=currentPlayer;
            return true;
        }
        return false;
    }
    public boolean checkWin()
    {
        for(int i=0;i<3;i++)
        {
            if(board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println("row");
                return true;
            }
            else if(board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                System.out.println("Column");
                return true;
            }
        }
        if(board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] != '-' &&
        board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            System.out.println("Diagonal");
            return true;
        }
        return false;
    }

    public boolean full(){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(board[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
    public void play()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe !!!");
        while(true)
        {
            printBoard();
            System.out.println("Player "+currentPlayer+" Choose a row and column (0-2)");
            int row = sc.nextInt();
            int column = sc.nextInt();

            if(move(row,column))
            {
                if(checkWin())
                {
                    System.out.println(currentPlayer+" Wins");
                    break;
                } else if (full()) {
                    System.out.println("Its a Tie !!!!");
                    break;
                }
                if(currentPlayer=='X') {
                    currentPlayer = 'O';
                }
                else {
                    currentPlayer='X';
                }
            }
            else
            {
                System.out.println("Invalid Move");
            }
            //break;
        }

    }
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
