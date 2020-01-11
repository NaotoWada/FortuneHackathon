package omikuzi;
import java.util.Random;

public class Omikuzi_logic {
	
	public class FortuneL{
	    public String omikuzi(String args){
	    //�����_����0�`99�܂ł̐��������
	    Random rand=new Random();
	    int fortune=rand.nextInt(100);
	    
	    //���݂����̔��肪�Ԃ��Ă���
	    Omikuzi_hantei omikuzi_hantei = new Omikuzi_hantei();
	    String answer = omikuzi_hantei.hantei(fortune);

	    return answer;
	    }
	}

}
