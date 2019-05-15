import java.util.Scanner;
class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true){
			System.out.print("Java 점수 : ");
			int java = input.nextInt();
			if ( java > 100 || java < 0 ){
				System.out.println("잘못 입력했습니다.");
				break;
			}
			System.out.print("Oracle 점수 : ");
			int oracle = input.nextInt();
			if ( oracle > 100 || oracle < 0 ){
				System.out.println("잘못 입력했습니다.");
				break;
			}
			System.out.print("JSP 점수 : ");
			int jsp = input.nextInt();
			if ( jsp > 100 || jsp < 0 ){
				System.out.println("잘못 입력했습니다.");
				break;
			}
			int total = java + oracle + jsp;
			double average = (double)total / 3;
			if ( average >= 90 ) {
				System.out.println("총점 : " + total + " 평균 : " + average + " 등급 : " + "수");
			} else if ( average >= 80) {
				System.out.println("총점 : " + total + " 평균 : " + average + " 등급 : " + "우");				
			} else if ( average >= 70) {
				System.out.println("총점 : " + total + " 평균 : " + average + " 등급 : " + "미");
			} else if ( average >= 60) {
				System.out.println("총점 : " + total + " 평균 : " + average + " 등급 : " + "양");
			} else if ( average < 60) {
				System.out.println("총점 : " + total + " 평균 : " + average + " 등급 : " + "가");
			}
			break;
		}
	}
}