/*
	赋值运算符
*/
public class OperatorDemo04{
	public static void main(String[] args){
		//把10赋值给int型变量i
		int i = 10;
		System.out.println("i："+i);	//字符串拼接 i:10
		
		//扩展 +=
		//把+=左边和右边的数据加法操作 结果赋值给左边
		i+=20;	
		//i=i+20;	
		System.out.println("i："+i);
		
		//注意
		short s = 10;
		s += 20;		//可以 
		System.out.println("s："+s);
		
		//s = 10;
		//s = s + 20;	//错误 等级提升 20为int s为short 最后结果为int型 而赋值给s是short型 
		//System.out.println("s："+s);
		
		//所以i+=20;与i=i+20不完全相同 结果相同
		//用强制转换 此种方法可以
		s = 10;
		s = (short)(s + 20);	//可以了
		System.out.println("s："+s);
		
		//所以说 += 运算隐含了强制类型转换
		//扩展运算符隐藏了强制类型转化
		//能用扩展运算符的就用扩展运算符
	}
}