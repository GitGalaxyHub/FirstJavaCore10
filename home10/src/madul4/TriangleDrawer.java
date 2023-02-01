package madul4;


public class TriangleDrawer {
    public String drawTriangle(int side) {
        StringBuilder sb = new StringBuilder();

        int row = 1;
        while (row <= side) {
            int col = 1;
            while (col <= row) {
                sb.append("*");
                col++;
            }
            sb.append("\n");

            row++;

        }System.out.println(drawTriangle(3));

        return sb.toString();
    }



    public static void main (String[]args){

        }

    }

