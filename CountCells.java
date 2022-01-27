private static int BACKGROUND_COLOR = 0;
private static int IMAGE_COLOR = 1;
private static int ALREADY_COUNTED = 2;

public int countCells1(int x, int y){

    if(x<0 || y<0 || x>=N || y>=N)
		return 0;
	else if(grid[x][y] != IMAGE_COLOR)
	    return 0;
    else{
		grid[x][y] = ALREADY_COUNTED;
		return 1				//자기 자신
		+ countCells(x-1, y+1) + countCells(x, y+1)
		+ countCells(x+1, y+1) + countCells(x-1, y)
		+ countCells(x+1, y) + countCells(x-1, y-1)
		+ countCells(x, y-1) + countCells(x+1, y-1);
    }
}

