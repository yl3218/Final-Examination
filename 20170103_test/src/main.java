
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
