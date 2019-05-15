package step03;

public class FileMgr {
	
	public void printFileType(String str, String[] fa) {
		for (int i = 0; i < fa.length; i++) {
			if (fa[i].endsWith(str)) {
//				int ex = fa[i].indexOf(str);
//				System.out.println(fa[i].substring(0, ex-1));
				System.out.println(fa[i].replace("."+str, ""));
			}
		}
	}

}
