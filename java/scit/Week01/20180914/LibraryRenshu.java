class LibraryRenshu 
{
	public static void main(String[] args) 
	{
		int libDiameter = 22; // ������ ����
		double pi = 3.14; // ������
		int caseWidth = 2; // å���� �ʺ�
		int singleShelfCount = 14; // å�� �ϳ��� ���� ��
		int singleShelfBookCount = 70; // ���� �ϳ��� ���� å �Ǽ�

		double libSize = libDiameter * pi; // ������ �ѷ�
		double totalCaseCount = libSize / caseWidth; // �ִ� å���� ��

		System.out.println(totalCaseCount); // �Ҽ��� ������ ������ å�� ��

		int totalShelfCount = singleShelfCount * (int)totalCaseCount; 
		int totalBookCount = singleShelfBookCount * totalShelfCount;

		System.out.println("å�� ���� : " + (int)totalCaseCount);
		System.out.println("��ü ������ �� : " + (int)totalBookCount);
	}
}