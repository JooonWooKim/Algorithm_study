public static void printChars(String str){
	if(str.length()==0)
		return;
	else{
		System.out.println(str.charAt(0));	
        //str의 index0을 리턴
		printChars(str.substring(1));		
	}
}