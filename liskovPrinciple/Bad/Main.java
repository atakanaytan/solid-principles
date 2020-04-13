package liskovPrinciple.Bad;

public class Main {

    public static void main(String[] args) throws Exception {

        Board twoBoard = new TwoDBoard();
        Board threeBoard = new ThreeDBoard();

        twoBoard.addPoint(11, 51);
        // bad design
        //twoBoard.addPoint(11, 5, 10);

        threeBoard.addPoint(4,2,1);
        //threeBoard.addPoint(1, 56);
    }
}
