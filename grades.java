import java.util.Scanner;
class grades {
	public static void main(String[] args){
	System.out.println("enter the number of students");
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	for (int i=0;i<x;i++){
		int grade=in.nextInt();
		if (grade>40){
			int j = (grade)%5;
			int newGrade=5-j+grade;
			if (newGrade-grade<3){
			int ugrade=newGrade;
			grade=ugrade;
	
}
}
		System.out.println(grade);
}
}
}
				
