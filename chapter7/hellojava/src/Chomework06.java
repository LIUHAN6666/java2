public class Chomework06{
	public static void main(String[] args) {
		Music M = new Music ("<花>", 599);
		M.play();
		System.out.println(M.getInfo());
	}
	}
class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	public void play() {
		System.out.println("音乐" + name + "正在播放中....时长为" +
	times + "秒");
	}
	public String getInfo() {
		return "音乐" + name + "播放时间为" + times;
	}
}