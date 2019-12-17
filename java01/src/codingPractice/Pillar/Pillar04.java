package codingPractice.Pillar;

import java.util.ArrayList;

class Solution04 {
    static int N,x,y,a,b;
    static boolean chk[][][];
    static ArrayList<int[]> ans;

    static boolean solve() {
        for(int i=1;i<=N;++i) {
            for(int j=0;j<=N;++j) {
                //±âµÕ
                if(chk[i][j][0]) {
                    //¹Ø¿¡ ±âµÕ ¾ø°í
                    if(!chk[i-1][j][0]) {
                        if(j==0) {
                            if(!chk[i][j][1])return false;
                        }else if(j==N) {
                            if(!chk[i][j-1][1])return false;
                        }else {
                            if(!chk[i][j-1][1] && !chk[i][j][1])return false;
                        }
                    }
                }
                //º¸
                if(chk[i][j][1]) {
                    if(!chk[i-1][j][0] && !chk[i-1][j+1][0]) {
                        if(j==0) {
                            return false;
                        }
                        else {
                            if(!chk[i][j-1][1] || !chk[i][j+1][1])return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public int[][] solution(int n, int[][] build_frame) {
        N=n;
        ans=new ArrayList<>();
        chk=new boolean[N+1][N+1][2]; //±âµÕ º¸

        for(int[] ord : build_frame) {
            x=ord[0];
            y=ord[1];
            a=ord[2]; //±âµÕ, º¸
            b=ord[3]; //¼³ »è
            if(a==0) {
                if(b==0) {
                    chk[y][x][0]=false;
                    if(!solve())chk[y][x][0]=true;
                }else {
                    chk[y][x][0]=true;
                    if(!solve())chk[y][x][0]=false;
                }
            }else {
                if(b==0) {
                    chk[y][x][1]=false;
                    if(!solve())chk[y][x][1]=true;
                }else {
                    chk[y][x][1]=true;
                    if(!solve())chk[y][x][1]=false;
                }
            }
        }
        for(int j=0;j<=N;++j) {
            for(int i=0;i<=N;++i) {
                if(chk[i][j][0]) {
                    ans.add(new int[] {j,i,0});
                }
                if(chk[i][j][1]) {
                    ans.add(new int[] {j,i,1});
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public void print(int[] t) {
    	for(int i : t) {
    		System.out.print("[" + i + "]");
    	}
    }

    
    
}


public class Pillar04 {
	public static void main(String[] args) {
		int[][] build_frame = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};	
		Solution04 func = new Solution04();
		func.solution(5, build_frame);
	}
}
