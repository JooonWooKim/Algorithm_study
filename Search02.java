int search(int [] data, int begin, int end, int target){
	if(begin>end)
		return -1;
	else if(target == data([begin])
		return begin;
	else
		return search(data, begin+1, end, target);
}

// 이 함수의 미션은 data[begin]에서 data[end]사이에서 target을 검색한다. 
// 즉, 검색 구간의 시작점을 "명시적"으로 지정한다.