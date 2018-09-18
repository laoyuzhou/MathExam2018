import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MathExam6346 {
	 static String[] quest,answ;
	 static String FILENAME="out.txt";
	 static int n,result=0;
	 static String str;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		n=Integer.parseInt(args[0]);
		quest = new String[n];
		answ = new String[n];
		//判断传入参数的问题
		if(args.length==1) {
			grade1(n);
		}
		else if(args.length==2) {
			int m=Integer.parseInt(args[1]);
			if(m==1) {
				grade1(n);
				//Files();
			}
			else if(m==2) {
				grade2(n);
				//Files();
			}
			else if(m<1||m>2) {
				System.out.println("输入有误，请重新运行");
				System.exit(0);
			}
		}
		else if(args.length<1||args.length>2) {
			System.out.println("输入有误，请重新运行");
			System.exit(0);
		}
		
	}

	private static void grade1(int n) {
		Random re=new Random();
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];//符号数组
		int[] answer =new int[1000];//答案数组
		int n1,n2,i,t;
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
				quest[i-1]="(" + i + ") " + a[i] + " + " + b[i];
				//quest[n]=quest[i-1];
			}
			else {
				result=n1-n2;
				System.out.println("(" + i + ") " + a[i] + " - " + b[i]);
				answer[i]= result;
				quest[i-1]="(" + i + ") " + a[i] + " - " + b[i];
				//quest[n]=quest[i-1];
			}
		}
		
		System.out.println("========标准答案========");
		for(i=1;i<=n;i++) {
			if(c[i] == 0) {
				result=a[i]+b[i];
				System.out.println("(" + i + ") " + a[i] + " + " + b[i]+" = "+result);
				answer[i]= result;
				answ[i-1]="(" + i + ") " + a[i] + " + " + b[i]+" = "+answer[i];
				//answ[n]=answ[i-1];
			}
			else {
				result=a[i]-b[i];
				System.out.println("(" + i + ") " + a[i] + " - " + b[i]+" = "+result);
				answer[i]= result;
				answ[i-1]="(" + i + ") " + a[i] + " - " + b[i]+" = "+answer[i];
				//answ[n]=answ[i-1];
			}
		}
	}
	private static void grade2(int n) {
		Random re=new Random();
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];//符号数组
		int[] answer =new int[1000];//答案数组
		int n1,n2,i,t;
		for(i=1;i<=n;i++)
		{
			n1=re.nextInt(10);
			n2=re.nextInt(10);
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
				System.out.println("(" + i + ") " + a[i] + " × " + b[i]);
				answer[i]= result;
				quest[i-1]="(" + i + ") " + a[i] + " × " + b[i];
				//quest[n]=quest[i-1];
			}
			else {
				System.out.println("(" + i + ") " + a[i] + " ÷ " + b[i]);
				answer[i]= result;
				quest[i-1]="(" + i + ") " + a[i] + " ÷ " + b[i];
				//quest[n]=quest[i-1];
			}
		}
		System.out.println("========标准答案========");
		for(i=1;i<=n;i++) {
			if(c[i] == 0) {
				result=a[i]*b[i];
				System.out.println("(" + i + ") " + a[i] + " × " + b[i]+" = "+result);
				answer[i]= result;
				answ[i-1]="(" + i + ") " + a[i] + " × " + b[i]+" = "+answer[i];
				//answ[n]=answ[i-1];
			}
			else {
				if(b[i]==0) {
					b[i]=re.nextInt(10)+1;
					result=a[i]/b[i];
				}else {
					result=a[i]/b[i];
				}
				
				int yu = a[i]%b[i];
				System.out.println("(" + i + ") " + a[i] + " ÷ " + b[i]+" = "+result+"..."+yu);
				answer[i]= result;
				answ[i-1]="(" + i + ") " + a[i] + " ÷ " + b[i]+" = "+answer[i]+"..."+yu;
				//answ[n]=answ[i-1];
			}
		}
	}
	
//private static void Files() throws IOException {
//	 FileOutputStream fw = null;
//	 File file;
//     String path = "D:\\eclipse\\eclipse项目\\out.txt";
//     try {
//    	 file = new File(path);
//    	 fw = new FileOutputStream(file);
//         if (!file.exists()) {
//             file.createNewFile();
//         }
//         str=quest[n]+"\n"+answ[n];
//         byte[] b=str.getBytes();
//         fw.write(b);
//         fw.flush();
//         fw.close();
//         System.out.println("===========写入文本成功========");
//     } catch (IOException e) {
//         e.printStackTrace();
//     } 
// }
}

	