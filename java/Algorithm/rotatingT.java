import java.util.Scanner;

public class rotatingT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = {{'#', '#', '#'}, {' ','#',' '}, {' ','#',' '}};

		int count = 0;
		int charLoc = 1;
		boolean direction = true;
		while(true) {
			for (char[] cs : arr) {
				System.out.println(cs);
			}
			
			System.out.print("입력 : ");
			String input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.println("종료합니다.");
				System.exit(0);
			}else {
				char[] arr0 = arr[0];
				char[] arr1 = arr[1];
				char[] arr2 = arr[2];
				if(direction) {
					// char 순서 변경 로직 
					for (int i = 0; i < 3; i++) {
						if(i != count) {
							if(charLoc == 1){
								arr[i][charLoc] = ' ';
								arr[i][charLoc+1] = '#';
							}else {
								arr[i][charLoc] = ' ';
								arr[i][charLoc-1] = '#';
							}
						}
					}
					if(charLoc == 1) {
						charLoc++;
					}else {
						charLoc--;
					}
					// arr 순서 변경 로직
					arr[1] = arr0;
					arr[2] = arr1;
					arr[0] = arr2;
					
					count++;
					if(count == 2) {
						direction = false;
					}
				}else {
					// char 순서 변경 로직
					for (int i = 0; i < 3; i++) {
						if(i != count) {
							if(charLoc == 1){
								arr[i][charLoc] = ' ';
								arr[i][charLoc-1] = '#';
							}else {
								arr[i][charLoc] = ' ';
								arr[i][charLoc+1] = '#';
							}
						}
					}
					if(charLoc == 1) {
						charLoc--;
					}else {
						charLoc++;
					}
					// arr 순서 변경 로직
					arr[2] = arr0;
					arr[0] = arr1;
					arr[1] = arr2;
					count--;
					if(count == 0) {
						direction = true;
					}
				}
			}	
		}
	}
}
