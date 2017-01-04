主程式
``` java
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CStudent student1 = new CStudent("Ariel", 92, 85); //於 main() 方法中宣告 2 個 CStudent 類別的物件 stu1 及 stu2
		CStudent student2 = new CStudent("zeze", 67, 89);
		
		student1.show(); //於main() method 中呼叫物件 stu1、stu2 的 show () 方法
		student2.show();

		CStudent stus[] = new CStudent[5]; //宣告一學生物件陣列

//		String[] names = {"john", "alice", "bob", "mary", "tom"}; //這個是我原本打的 但老師說太複雜 他等於下面的 五個new
//		int[] english = { 10, 40, 5, 80, 30};
//		int[] math = { 10, 100, 50, 80, 40};
//
//		for(int i = 0; i<5; i++){
//			stus[i] = new CStudent(names[i],english[i],math[i]);
//		}

		stus[0] = new CStudent("john", 10, 10); //new 5 個 CStudent 物件存入該陣列
		stus[1] = new CStudent("alice", 40, 100);
		stus[2] = new CStudent("bob", 5, 50);
		stus[3] = new CStudent("mary", 80, 80);
		stus[4] = new CStudent("tom", 30, 40);

		//找出陣列中成績最佳的 CStudent 物件
		CStudent temp = new CStudent("temp", 0, 0); //這邊先設定一個最差的成績
		for(CStudent stu:stus){ //for 迴圈 一個一個取出來
			if(stu.calculate()>temp.calculate()){ //如果取出來的CStudent物件比最差的成績好 或是 比上一個好成績還要更好
				temp = stu; //就讓該物件等於暫存的物件
			}
		}
		temp.show(); //都跑完了 那 暫存的陣列一定是最好的 根據題目把他列印出來



	}
}
```
CStudent 類別
``` java
public class CStudent { //第一題的要求的類別

	private String name;
	private int english;
	private int math;

	public CStudent (String str, int e,int m) { //建立一有引數的 CStudent (String str, int e,int m) 建構元
		this.name = str;
		this.english = e;
		this.math = m;
	}

	 public float calculate(){ //該方法可以計算該學生物件英文及數學成績的平均分數，並傳回平均分數給呼叫者。
		 float temp = english+math; //因為會有分數產生所以要使用浮點數來運算
		return (float) (temp / 2);
	 }

	 public void show(){ //可以印出 CStudent 物件的所有成員變數之值，同時必須呼叫上題定義的 calculate()以取得英文及數學成績的平均分數，然後印出英文及數學成績的平均分數。
//		 System.out.println(String.format("name: %10s english: %3d math: %3d calculate: %2f" ,name,english,math,calculate()));
		 System.out.print("name: " + name + " ");
		 System.out.print("english: " + english + " ");
		 System.out.print("math: " + math + " ");
		 System.out.println("calculate: " + calculate()); //同時必須呼叫上題定義的 calculate()以取得英文及數學成績的平均分數 重要！！
	 }
}

```
