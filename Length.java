public static int length(String str){
	if(str.equals(""))
		return 0;
	else
		return 1+length(str.substring(1));	
        //substring(1)은 str의 index 1인 위치의 문자를 포함한 문자열을 리턴
		//index1을 제외한 나머지 문자
}