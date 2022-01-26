int search(int [] data, int n, int target){
	for(int i=0; i<n; i++)
		if(data[i] == target)
			return i;
		return -1;
	}

// 이 함수의 미션은 data[0]에서 data[n-1]사이에서 target을 검색하는 것 이다.
// 하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉, "암시적 매개변수"이다.
// 0이라는 매개변수는 암시적으로 암시된것이므로 암시적 매개변수라 한다.
