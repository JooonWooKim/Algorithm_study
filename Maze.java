public class maze{
	private static int n=8;
	private static int [][] maze = {
		{0, 0, 0, 0, 0, 0, 0, 1},
		{0, 1, 1, 0, 1, 1, 0, 1},
		{0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 0, 0, 1, 1, 0, 0},
		{0, 1, 1, 1, 0, 0, 1, 1},
		{0, 1, 0, 0, 0, 1, 0, 1},
		{0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 1, 1, 0, 1, 0, 0},
	};
    private static final int PATHWAY_COLOR = 0;	//white
	private static final int WALL_COLOR = 1;	//blue
	private static final int BLOCKED_COLOR = 2;	//red, 방문했지만, 꽝인 부분
	private static final int PATH_COLOR = 3;	//green, 방문했지만, 출구가 있을지 없을지 모르는 경우

    public static boolean findmazePath(int x, int y){
	if(x<0 || y<0 || x>=N || y>= N)		//범위를 벗어난 경우
		return false;
	else if (maze[x][y] != PATHWAY_COLOR)	
		return false;
	else if(x==N-1 && y==N-1){			//출구
		maze[x][y] = PATH_COLOR;
		return true;
		}
	else{
		maze[x][y] = PATH_COLOR;		
		if(findMazePath(x-1, y) || findMazePath(x, y+1)
		|| findMazePath(x+1, y) || findMazePath(x, y-1)){		
		//4개중에 탈출하는 통로를 찾는다면
			return true;
			}
		maze[x][y] = BLOCKED_COLOR;	
		//dead end, 출구를 찾지 못한 경우 꽝
		return false;
		}
	}
	public static void main(String[] args){
		printMaze();
		findMazePath(0, 0);
		printMaze();
	}
}
