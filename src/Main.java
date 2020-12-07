import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayTest st1 = new ArrayTest("해정이","2014");
		ArrayTest st2 = new ArrayTest("리나","2020");
		ArrayTest st3 = new ArrayTest("기나","2018");
		
		ArrayList <ArrayTest> list = new ArrayList<ArrayTest>(); 
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
		System.out.print("계속 검색하고 싶으면 Y , 종료하고 싶으면 N :");
		String answer1 = sc.next();
		boolean flag =false;
		if(answer1.equals("y")) {
			System.out.print("학생 이름:");
			String answer2 = sc.next();
			for(ArrayTest students : list) {
				if(students.getName().equals(answer2)) {
					System.out.println(answer2+"의 학번은 :"+students.getNo()+"입니다.");
					flag=true;
					
				}
			}
			if(!flag) {
				System.out.print("없는 정보입니다.");
				System.out.println(flag);
			}	
			}else if(answer1.equals("n")) {
				System.out.print("프로그램이 종료되었습니다.");
				break;
			}
		}
	}

}
