package pers.anliven.learningjava.chapter12;

import java.util.Scanner;

public class T05Scanner {

	public static void main(String[] args) {

		// 示例：hasNext()和next()
		Scanner testScan1 = new Scanner(System.in);
		System.out.println("next()方法获取输入，按Enter键退出：");
		if (testScan1.hasNext()) { // hasNext()方法判断是否还有输入
			String str1 = testScan1.next(); // next()方法获取输入
			System.out.println("输入的数据为：" + str1);
		}

		// 示例：hasNextLine()和nextLine()
		Scanner testScan2 = new Scanner(System.in);
		System.out.println("nextline()方法获取输入，按Enter键退出：");
		if (testScan2.hasNextLine()) { // hasNext()方法判断是否还有输入
			String str2 = testScan2.nextLine(); // nextLine()方法获取输入
			System.out.println("输入的数据为：" + str2);
		}

		// 示例：hasNextFloat()和nextFloat()
		Scanner testScan3 = new Scanner(System.in);
		float f = 0.0f;
		System.out.print("nextFloat()方法获取float型数据输入，按Enter键退出：：");
		if (testScan3.hasNextFloat()) { // hasNextFloat()方法判断是否还有输入
			f = testScan3.nextFloat(); // nextFloat()方法获取输入
			System.out.println("float型数据：" + f);
		} else {
			System.out.println("非float型数据");
		}

		// 示例：hasNextDouble()和nextDouble()
		Scanner testScan4 = new Scanner(System.in);
		double sum = 0;
		int number = 0;
		System.out.print("nextDouble()方法获取double型数据输入，输入“end”退出：");
		if (testScan4.hasNextDouble()) { // hasNextDouble()方法判断是否还有输入
			while(testScan4.hasNextDouble()) { 
				double x = testScan4.nextDouble(); // nextDouble()方法以Enter(回车键)为结束符
				number = number + 1;
				sum = sum + x;
			}
			System.out.println(number + "个数的和为" + sum);
			System.out.println(number + "个数的平均值是" + (sum / number));
		} else {
			System.out.println("非double型数据");
		}

		testScan1.close();
		testScan2.close();
		testScan3.close();
		testScan4.close();
		System.out.println("已关闭所有输入");
	}
}

/*### java.util.Scanner类
可以通过java.util.Scanner类获取用户的输入，并且支持正则表达式。
对于指定的类型数据，可以使用形似hasNextXxx()的方法进行验证和nextXxx()方法来读取。
更多详细信息可查看JDK API文档。

### next()方法与nextLine()方法的区别
常用next()、nextLine()等方法获取输入的数据；hasNext()、hasNextLine()等方法判断是否还有输入的数据。
- next()方法：直到读取有效字符后，才可以结束输入，才将其后的空白作为分隔符或者结束符；自动去除有效字符之前的空白。
- nextLine()方法：以Enter为结束符；可以获得空白。*/