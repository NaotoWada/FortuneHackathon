package omikuzi;
import java.util.Random;

public class Omikuzi_logic {
	
	public class FortuneL{
	    public String omikuzi(String args){
	    //ランダムに0〜99までの数字を入力
	    Random rand=new Random();
	    int fortune=rand.nextInt(100);
	    
	    //おみくじの判定が返ってくる
	    Omikuzi_hantei omikuzi_hantei = new Omikuzi_hantei();
	    String answer = omikuzi_hantei.hantei(fortune);

	    return answer;
	    }
	}

}
