/*
	ѭ��Ƕ�ף�
		ѭ��������ѭ�����
	����
		�ڿ���̨���һ���Сʱ�ͷ���
		
		���ӷ�Χ��
			0 <= minute < 60
		Сʱ��Χ��
			0 <= hour < 24
*/

public class ForForDemo {
	public static void main(String[] args) {
		
		/*
		for(int minute=0;minute<4;minute++){
			System.out.println("0ʱ"+minute+"��");
		}
		System.out.println("--------");
		for(int minute=0;minute<4;minute++){
			System.out.println("1ʱ"+minute+"��");
		}
		System.out.println("--------");
		for(int minute=0;minute<4;minute++){
			System.out.println("2ʱ"+minute+"��");
		}
		System.out.println("--------");
		*/
		
		/*��ѭ������Сʱ�ķ�Χ����ѭ�����Ʒ��ӵķ�Χ*/
		/*
		//��Ƕ�׸���
		for(int hour=0; hour<3; hour++) {
			for(int minute=0; minute<4; minute++) {
				System.out.println(hour + "ʱ" + minute+"��");
			}
			System.out.println("--------");
		}
		//System.out.println();
		*/
		
		//�������
		for(int hour=0; hour<24; hour++) {
			for(int minute=0; minute<60; minute++) {
				System.out.println(hour + "ʱ" + minute+"��");
			}
			System.out.println("--------");
		}
		
		
	}
}
