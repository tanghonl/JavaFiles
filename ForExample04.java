/*
	������ͳ��
	����ͳ�ơ�ˮ�ɻ��������������ڿ���̨���
		
	������1.����count���ڱ���ˮ�ɻ��������� ��ʼΪ0
		  2.���ж�ˮ�ɻ����Ĺ����в����������Ϊ�޸�count��ֵ count+1
		  3.��ӡ���ս��
*/

public class ForExample04 {
	public static void main(String[] args) {
		//��������ı���
		int count = 0;
		//����ѭ��
		for(int i=100; i<=999; i++) {
			//��ȡÿ��λ�ϵ�ֵ
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100;
			//�ж�
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				count++;
			}
		}
		System.out.println("ˮ�ɻ���������λΪ��"+count);
	}
}