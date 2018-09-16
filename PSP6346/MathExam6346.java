import java.io.IOException;
import java.util.Random;

public class MathExam6346 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		//�жϴ������������
		if(args.length==1) {
			grade1(n);
		}
		else if(args.length==2) {
			int m=Integer.parseInt(args[1]);
			if(m==1) {
				grade1(n);
			}
			else if(m==2) {
				grade2(n);
			}
			else if(m<1||m>2) {
				System.out.println("������������������");
				System.exit(0);
			}
		}
		else if(args.length<1||args.length>2) {
			System.out.println("������������������");
			System.exit(0);
		}
	}
	private static void grade1(int n) {
		Random re=new Random();
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];//��������
		int[] answer =new int[1000];//������
		int n1,n2,i,t,result=0;
		for(i=1;i<=n;i++)
		{
			n1=re.nextInt(100);
			n2=re.nextInt(100);
			if(n1<n2)
			{
				t=n1;
				n1=n2;
				n2=t;
			}
			a[i]=n1;
			b[i]=n2;
			int operator = re.nextInt(2);
			c[i]=operator;
			if(operator == 0) {
				result=n1+n2;
				System.out.println("(" + i + ") " + a[i] + " + " + b[i]);
				answer[i]= result;
			}
			else {
				result=n1-n2;
				System.out.println("(" + i + ") " + a[i] + " - " + b[i]);
				answer[i]= result;
			}
		}
		System.out.print("========��׼��========");
		for(i=0;i<=n;i++) {
			if(c[i] == 0) {
				result=a[i]+b[i];
				System.out.println("(" + i + ") " + a[i] + " + " + b[i]+" = "+result);
			}
			else {
				result=a[i]-b[i];
				System.out.println("(" + i + ") " + a[i] + " - " + b[i]+" = "+result);
				answer[i]= result;
			}
		}
		
	}
	private static void grade2(int n) {
		Random re=new Random();
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];//��������
		int[] answer =new int[1000];//������
		int n1,n2,i,t,result=0;
		for(i=1;i<=n;i++)
		{
			n1=re.nextInt(10);
			n2=re.nextInt(10);
			a[i]=n1;
			b[i]=n2;
			int operator = re.nextInt(2);
			c[i]=operator;
			if(operator == 0) {
				result=n1*n2;
				System.out.println("(" + i + ") " + a[i] + " �� " + b[i]);
				answer[i]= result;
			}
			else {
				result=n1/n2;
				System.out.println("(" + i + ") " + a[i] + " �� " + b[i]);
				answer[i]= result;
			}
		}
		System.out.print("========��׼��========");
		for(i=0;i<=n;i++) {
			if(c[i] == 0) {
				result=a[i]*b[i];
				System.out.println("(" + i + ") " + a[i] + " �� " + b[i]+" = "+result);
			}
			else {
				result=a[i]/b[i];
				System.out.println("(" + i + ") " + a[i] + " �� " + b[i]+" = "+result);
				answer[i]= result;
			}
		}
	}
}
	

