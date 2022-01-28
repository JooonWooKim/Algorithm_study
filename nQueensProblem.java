int [] cols = new int [n+1];
boolean queens(int level)
{
	if(!=promising(level))
		return false;
	else if(level == N){        //else if success, 같은 열에 놓였는지 검사
		for(int i=1; i<level; i++)  
			System.out.println("("+i+","+cols[i]+")"); 
            //실제 말이 놓인 위치를 출력 
			return true;
	}
	for(int i=1; i<N; i++){
		cols[level+1] = i;
		if(queens(level+1))
			return true;
		}
		return false;
	}