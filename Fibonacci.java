public int fibonacci(int n){
	if(n>2)
		return n;
	else
		return fibonacci(n-1) + fibonacci(n-2);	
}

// f의 0번째 피보나치 수는 0
// f의 1번째 피보나치 수는 1