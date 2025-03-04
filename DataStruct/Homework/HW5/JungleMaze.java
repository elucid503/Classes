package Homework.HW5;

import java.util.Arrays;

/**
 * 
 * * * J U N G L E  E S C A P E  A L G O R I T H M * * *
 * 
*/

public class JungleMaze {

	/**
	 * Utility to print a 2D arr/matrix vertically
	*/

	private void print2DMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			System.out.println(Arrays.toString(matrix[i]));

		}

	}

	/**
	 * Utility to check if the current cell position (x,y) is in the maze
	*/

	private boolean isSafe(int maze[][], int x, int y, int sol[][]) {

		int X = maze[1].length;
		int Y = maze.length;

		return (x >= 0) && (x < X) && (y >= 0) && (y < Y) && (maze[x][y] == 1);

	}

	/**
	 * Solves the maze using backtracking
	*/
	
	public boolean solveMaze(int maze[][], int x, int y, int[][] sol) {

		// useful constants

		int X = maze[1].length;
		int Y = maze.length;

		if (x == X - 1 && y == Y - 1) {

			// done

			sol[x][y] = 1;
			return true;

		}

		if (isSafe(maze, x, y, sol)) {

			sol[x][y] = 1; // this will eventually mark all cells that are *part* of the solution

			// try to move "forward" 

			if (solveMaze(maze, x + 1, y, sol)) {

				return true;

			}
			
			// try to move down

			if (solveMaze(maze, x, y + 1, sol)) {

				return true;

			}

			sol[x][y] = 0; // this removes the cell since its not *necessary* for the solution

			return false;

		} else {

			// wrong turn at albuquerque

			return false;

		}

	}

	public static void main(String[] args) {

		// Initiate the maze

		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1, } };

		// Initiate the solution matrix

		int sol[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

		JungleMaze mazeTester = new JungleMaze();

		System.out.println("Maze: ");

		mazeTester.print2DMatrix(maze);

		// Given a maze NxM,

		if (mazeTester.solveMaze(maze, 0, 0, sol)) {

			// print the solution matrix here

			System.out.println("Solution: ");

			mazeTester.print2DMatrix(sol);
			
		} else {

			System.out.println("No solution");

		}

	}
	
}