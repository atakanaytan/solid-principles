package liskovPrinciple.Good;

import liskovPrinciple.Good.board.Board;
import liskovPrinciple.Good.board.impl.ThreeDBoard;
import liskovPrinciple.Good.board.impl.TwoDBoard;

public class Main {

    public static void main(String[] args) {

        Board<Double> twoBoard = new TwoDBoard<Double>(2);
        Board<Integer> threeBoard = new ThreeDBoard<Integer>(3);

        Movement<Double> movement1 = new Movement<Double>();

        movement1.addMovementDimension("x", 5.20);
        movement1.addMovementDimension("y", 20.10);
        twoBoard.addMovement(movement1);

        Movement<Double> movement2 = new Movement<Double>();
        movement2.addMovementDimension("x", 26.70);
        movement2.addMovementDimension("y", 22.34);
        twoBoard.addMovement(movement2);

        printBoardMovements(twoBoard);


        Movement<Integer> movement3 = new Movement<Integer>();
        movement3.addMovementDimension("x", 5);
        movement3.addMovementDimension("y", 60);
        movement3.addMovementDimension("z",80);
        threeBoard.addMovement(movement3);


        Movement<Integer> movement4 = new Movement<Integer>();
        movement4.addMovementDimension("x", 30);
        movement4.addMovementDimension("y", 60);
        movement4.addMovementDimension("z",90);
        threeBoard.addMovement(movement4);

        printBoardMovements(threeBoard);
    }

    private static <T extends Number> void printBoardMovements(Board<T> board) {

        for (Movement<T> movement : board.getAllMovement()){

            System.out.println(movement);
        }
    }
}
