import java.util.Scanner;
class CylinderCalc
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int radius;
		int height;
		double pi = 3.14;
		double area;
		double volume;
		
		System.out.print("원기둥의 반지름 : ");
		radius = input.nextInt();
		area = (radius *= radius) * pi;
		System.out.print("원기둥의 높이 : ");
		height = input.nextInt();
		volume = area * height;
		System.out.println("원기둥의 부피는 " + volume + "입니다.");
	}
}