class VarChange
{
	public static void main(String[] args){
	int x = 100;
	int y = 200;
	int temp;
	System.out.println("교환 전 : x=" + x + ", y=" + y);

	temp = x;
	x = y;
	y = temp;
	System.out.println("교환 후 : x=" + x + ", y=" + y);
	}
}