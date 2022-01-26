public static int factorial(int n)
{
	if(n==0)
		return 1;		//0!은 1이기때문에
	else
		return n*factorial(n-1);	
}
