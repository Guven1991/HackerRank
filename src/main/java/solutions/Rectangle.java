package solutions;


public class Rectangle {
    int row = 10;
    int column = 8;

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.rectangleWithStar();

    }

    public void rectangleWithStar() {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (i == 0 || i == row - 1) {
                    System.out.print("*  ");
                } else {
                    if (j == 0) {
                        System.out.print("*  ");
                    } else if (j == column - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("   ");
                    }
                }

            }
            System.out.println();
        }
    }
}

