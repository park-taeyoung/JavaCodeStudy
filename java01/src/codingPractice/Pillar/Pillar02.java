package codingPractice.Pillar;
class Solution02 {
    boolean[][] pillars = new boolean[103][103];
    boolean[][] boards = new boolean[103][103];
    int N;
    public int[][] solution(int n, int[][] build_frame) {
        int[][] answer = {};
        N = n;
        int cnt = 0;     
        for(int i = 0; i < build_frame.length; i++) {
            int x = build_frame[i][0];
            int y = build_frame[i][1];
            int a = build_frame[i][2];
            int b = build_frame[i][3]; 
            if(b == 1) {        //설치
                if(a == 0 && buildPillar(x, y)) {   //기둥
                    pillars[x][y] = true;
                    cnt++;
                }
                else if(a == 1 && buildBoard(x, y)) {           //보
                    boards[x][y] = true;
                    cnt++;
                }
            }
            else {              //삭제
                if(remove(x, y, a)) cnt--;
            }
        }

        answer = new int[cnt][3];
        int idx = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(pillars[i][j]) {
                    answer[idx][0] = i;
                    answer[idx][1] = j;
                    answer[idx][2] = 0;
                    idx++;
                }
                if(boards[i][j]) {
                    answer[idx][0] = i;
                    answer[idx][1] = j;
                    answer[idx][2] = 1;
                    idx++;
                }
            }
        }
        
        print(answer);
        return answer;
    }    
    
    public void print(int[][] t) {
    	for (int[] i : t) {
    		for (int j : i) {
    			System.out.print("[" + j + "]");
//    			System.out.print("\n");
    		}
    	}
    }

   boolean buildPillar(int x, int y) {
        if(y == 0) return true;
        if(pillars[x][y-1]) return true;
        if(boards[x][y]) return true;
        if(x > 0 && boards[x-1][y]) return true;
        return false;
    }

    boolean buildBoard(int x, int y) {
        if(pillars[x][y-1]) return true;
        if(pillars[x+1][y-1]) return true;
        if(x > 0 && boards[x-1][y] && boards[x+1][y]) return true;
        return false;
    }

    boolean remove(int x, int y, int type) {
        boolean flag = true;
        if(type == 0) {
            pillars[x][y] = false;
        }
        else {
            boards[x][y] = false;
        }

        for(int i = 0; i <= N; i++) {
            for(int j = 0; j <= N; j++) {
                if(pillars[i][j]) {
                    pillars[i][j] = false;
                    if(!buildPillar(i, j)) flag = false;
                    pillars[i][j] = true;
                }
                if(boards[i][j]) {
                    boards[i][j] = false;
                    if(!buildBoard(i, j)) flag = false;
                    boards[i][j] = true;
                }
            }
        }
        if(!flag) {
            if(type == 0) {
                pillars[x][y] = true;
            }
            else {
                boards[x][y] = true;
            }
        }
        return flag;
    }
}

public class Pillar02 {
	public static void main(String[] args) {
		int[][] build_frame = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};	
		Solution02 func = new Solution02();
		func.solution(5, build_frame);
	}
}
