package omikuzi;
import java.util.Random;

public class Omikuzi_logic {
	
	public class FortuneL{
	    public String omikuzi(String args){
	    //ƒ‰ƒ“ƒ_ƒ€‚É0`99‚Ü‚Å‚Ì”š‚ğ“ü—Í
	    Random rand=new Random();
	    int fortune=rand.nextInt(100);
	    
	    //‚¨‚İ‚­‚¶‚Ì”»’è‚ª•Ô‚Á‚Ä‚­‚é
	    Omikuzi_hantei omikuzi_hantei = new Omikuzi_hantei();
	    String answer = omikuzi_hantei.hantei(fortune);

	    return answer;
	    }
	}

}
