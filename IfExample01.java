/*
	����С����Ҫ�����ˣ�С���ְֶ���˵�����������ͬ�Ŀ��Գɼ�������ͬ�����
		  ��������Կ���С���ĵ÷֣����ó���ʵ��С�����׸û��ʲô����������ڿ���̨���
		  ���裺95-100 ɽ�����г�	90-94 ���ֳ���һ��	80-89 ���ν����� 80����������һ��
	
	����:
		1.С���ɼ�δ֪�����ü���¼��ķ�ʽ��ȡֵ
		2.���ڽ����϶࣬���ڶ����ж� ����if...else...if��ʽʵ��
		3.ÿ���ж϶�Ӧ����
		4.Ϊÿ���ж����ö�Ӧ�Ľ���
*/
import java.util.Scanner;

public class IfExample01{
	public static void main(String[] args){
		//������������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		int score = sc.nextInt();
		
		/*
		if(score>=95 && score<=100){
			System.out.println("ɽ�����г�һ��");
		}else if(score>=90 && score<=94){
			System.out.println("���ֳ�����һ��");
		}else if(score>=80 && score<90){
			System.out.println("���ν�����һ��");
		}else{
			System.out.println("����һ��");
		}
		*/
		
		//�Ľ���
		//���ݲ��ԣ���ȷ���� �߽����ݣ���������
		if(score>100 || score<0){
			System.out.println("������ķ�������");
		}else if(score>=95 && score<=100){
			System.out.println("ɽ�����г�һ��");
		}else if(score>=90 && score<=94){
			System.out.println("���ֳ�����һ��");
		}else if(score>=80 && score<90){
			System.out.println("���ν�����һ��");
		}else{
			System.out.println("����һ��");
		}
	}
}