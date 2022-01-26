public static void printCharsReverse(String str){
	if(str.length() == 0)
		return;
	else{
		printCharsReverse(str.substring(1));
		System.out.println(str.charAt(0));
	}
}
