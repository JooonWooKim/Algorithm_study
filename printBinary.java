public void printInBinary(int n){
	if(n<2)
		System.out.println(n);	//0과 1을 2진수 그자체로 본다.
	else{
		printInBinary(n/2);		//n을 2로 나눈 "몫"을 먼저 2진수로 변환하여 인쇄한 후
		System.out.println(n%2);	//n을 2로 나눈 나머지를 인쇄한다.
	}
}