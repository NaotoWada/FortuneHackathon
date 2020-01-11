package omikuzi;

public class Omikuzi_hantei {
	public String hantei(int fortune) {
	    String answer = null;
	    while(0 <= fortune && fortune <= 9){
	    	answer = "‘å‹g";
	    	break;
	    }
	    while(10 <= fortune && fortune <= 29){
	    	answer = "’†‹g";
	        break;
	    }
	    while(30 <= fortune && fortune <= 59){
	    	answer = "¬‹g";
	        break;
	    }
	    while(60 <= fortune && fortune <= 89){
	    	answer = "‹g";
	    }
	    while(90 <= fortune && fortune <= 99){
	    	answer = "‹¥";
	        break;
	    }
	    return answer;
	}
}
