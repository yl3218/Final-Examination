
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
