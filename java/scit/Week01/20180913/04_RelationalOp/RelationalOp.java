public class RelationalOp {
	public static void main(String[] args) {
		RelationalOp op1 = new RelationalOp(); 
		RelationalOp op2 = new RelationalOp();
		RelationalOp op3 = op1;
		RelationalOp op4 = op3;
	
		System.out.println("op1과 op2는 같다 : " + (op1 == op2));
		System.out.println("op1과 op4는 같다 : " + (op1 == op4));
		System.out.println("op2과 op3는 같다 : " + (op2 == op3));
	}

}