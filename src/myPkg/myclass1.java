package myPkg;

public class myclass1 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int a = 1;
		int b = 1;

		//�e�X�g�R�����g
		//System.out.println("�O�u����" + ++a + "�ɂȂ�܂��B");
		System.out.println("��u����" + b++ + "�ɂȂ�܂��B");
		System.out.println("�e�X�g");
		
		// CMNT �e�ϐ��^�̐錾
		byte bytea = 127;
		short shorta = 1000;
		float floata = 127.5F;
		double doublea = 0.5;

		// CMNT �^�ϊ��p�̕ϐ��̐錾
		int casta;

		// CMNT �^�ϊ������ϐ��̏o��
		casta = (int) bytea;
		System.out.println("byte�^�̕ϊ��F" + casta);

		casta = (int) shorta;
		System.out.println(casta);

		casta = (int) floata;
		System.out.println(casta);

		casta = (int) doublea;
		System.out.println(casta);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void testMethod(String[] args) {
		System.out.println("����ɂ���");
	}

}
