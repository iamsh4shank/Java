class revprime {
	public static void main(String[] args){
		int[] revp ;
		revp = new int[24];
		int index=1;
		for (int i=2; i<=100 ; i++){
			for (int j=1; j<i ; j++){
				if (i%j == 0) {
					break;
				}
				else {
					revp[-index]=i;
					index++;
					break ;
				}
			}
		}
	System.out.println(revp);
	}
}
