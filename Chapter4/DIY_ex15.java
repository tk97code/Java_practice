package Chapter4;

import java.util.*;

class Matrix {
	
	private int[][] matrix;
	
	Matrix() {
		matrix = new int[8][8];
	}
	
	public void fillMatrix() {
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
            }
        }
	}
	
	public void displayMatrix() {
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-3d ",matrix[i][j]);
            }
            System.out.println();
        }
	}
}

public class DIY_ex15 {

	public static void main(String[] args) {
		Matrix matrixObj = new Matrix();
		matrixObj.fillMatrix();
		matrixObj.displayMatrix();
		
	}

}
