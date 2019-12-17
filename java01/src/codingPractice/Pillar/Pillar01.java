package codingPractice.Pillar;

import java.util.Arrays;


class Solution01 {
    private int n;
    private boolean[][] hasColumn;
    private boolean[][] hasBeam;

    public int[][] solution(int n, int[][] build_frame) {
        this.n = n + 1;

        hasColumn = new boolean[n + 1][n + 1];
        hasBeam = new boolean[n + 1][n + 1];

        for (int[] frame : build_frame) {
            int x = frame[0], y = frame[1];
            boolean isColumn = frame[2] == 0;
            boolean isRemoving = frame[3] == 0;

            if (isColumn) {
                if (isRemoving) {
                    if (isAvailableToRemoveColumn(x, y)) {
                        hasColumn[x][y] = false;
                    } else {
                        System.out.println("remove column: " + Arrays.toString(frame));
                    }
                } else {
                    if (isAvailableToPlaceColumn(x, y)) {
                        hasColumn[x][y] = true;
                    } else {
                        System.out.println("place column: " + Arrays.toString(frame));
                    }
                }
            } else {
                if (isRemoving) {
                    if (isAvailableToRemoveBeam(x, y)) {
                        hasBeam[x][y] = false;
                    } else {
                        System.out.println("remove beam: " + Arrays.toString(frame));
                    }
                } else {
                    if (isAvailableToPlaceBeam(x, y)) {
                        hasBeam[x][y] = true;
                    } else {
                        System.out.println("place beam: " + Arrays.toString(frame));
                    }
                }
            }
        }

        int numStructures = 0;

        for (int i = 0; i < n + 1; ++i) {
            for (int j = 0; j < n + 1; ++j) {
                if (hasColumn[i][j]) {
                    numStructures++;
                }

                if (hasBeam[i][j]) {
                    numStructures++;
                }
            }
        }

        int[][] result = new int[numStructures][3];
        int k = 0;

        for (int i = 0; i < n + 1; ++i) {
            for (int j = 0; j < n + 1; ++j) {
                if (hasColumn[i][j]) {
                    result[k][0] = i;
                    result[k][1] = j;
                    result[k][2] = 0;

                    k++;
                }

                if (hasBeam[i][j]) {
                    result[k][0] = i;
                    result[k][1] = j;
                    result[k][2] = 1;

                    k++;
                }
            }
        }
        print(result);
        return result;
    }
    
    public void print(int[][] t) {
    	for (int[] i : t) {
    		for (int j : i)
    		System.out.print("[" + j + "]");
    		System.out.print("\n");
    	}
    }
    

    private boolean hasColumn(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && hasColumn[x][y];
    }

    private boolean hasBeam(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && hasBeam[x][y];
    }

    private boolean isAvailableToRemoveColumn(int x, int y) {
        return hasColumn(x, y)
            && (!hasColumn(x, y + 1) || (hasBeam(x - 1, y + 1) || hasBeam(x, y + 1)))
            && (!hasBeam(x, y + 1) || (hasColumn(x + 1, y) || hasBeam(x - 1, y + 1) && hasBeam(x + 1, y + 1)))
            && (!hasBeam(x - 1, y + 1) || (hasColumn(x - 1, y) || hasBeam(x - 2, y + 1) && hasBeam(x, y + 1)));
    }

    private boolean isAvailableToPlaceColumn(int x, int y) {
        return !hasColumn(x, y)
            && (y == 0 || hasBeam(x, y) || hasBeam(x - 1, y) || hasColumn(x, y - 1));
    }

    private boolean isAvailableToRemoveBeam(int x, int y) {
        return hasBeam(x, y)
            && (!hasColumn(x, y) || (y == 0 || hasBeam(x - 1, y) || hasColumn(x, y - 1)))
            && (!hasColumn(x + 1, y) || (y == 0 || hasBeam(x + 1, y) || hasColumn(x + 1, y - 1)))
            && (!hasBeam(x - 1, y) || (hasColumn(x - 1, y - 1) || hasColumn(x, y - 1)))
            && (!hasBeam(x + 1, y) || (hasColumn(x + 1, y - 1) || hasColumn(x + 2, y - 1)));
    }

    private boolean isAvailableToPlaceBeam(int x, int y) {
        return !hasBeam(x, y)
            && (hasColumn(x, y - 1) || hasColumn(x + 1, y - 1) || hasBeam(x - 1, y) && hasBeam(x + 1, y));
    }
}


public class Pillar01 {
	public static void main(String[] args) {
		int[][] build_frame = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};	
		Solution01 func = new Solution01();
		func.solution(5, build_frame);
	}
}
