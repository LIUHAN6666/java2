public class Varparmeter01 {
	public static void main(String[] args) {
		hsmethod hm =new hsmethod ();
		System.out.println(hm.showScore("丁真", 90.3 ,40.5));
	}	
	}
class hsmethod {
	public String showScore(String name, double... scores) {
		double totalscore = 0;
		for( int i = 0; i < scores.length; i++) {
			totalscore += scores[i];
		}
		return name + "有" + scores.length + "门的成绩总分" + totalscore;
	}
}