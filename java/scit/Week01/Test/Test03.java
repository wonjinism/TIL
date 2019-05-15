class Test03 {
	public static void main(String[] args) {
		int output = 1;
		for (int i = 2; ; i++){
			if (output >= 30 ){
				break;
			}
			System.out.print(output + " ");
			if ( i % 2 == 0 ){
				output++;
			} else {
				output += 2;
			}
		}
		System.out.println();
	}
}