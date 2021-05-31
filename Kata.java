public class Kata {

  public static int golfScoreCalculator(String parList, String scoreList) {

  	int score = 0;
  	char[] charArray_parList;
  	char[] charArray_scoreList;

  	charArray_parList = parList.toCharArray();
  	charArray_scoreList = scoreList.toCharArray();

  	for(int i=0; i < charArray_scoreList.length; i++) {
  		score = score + (charArray_scoreList[i] - charArray_parList[i]);
  	}

  	

    return score;
  }
  public static void main(String[] args) {
  	System.out.println(golfScoreCalculator("443454444344544443", "353445334534445344"));
  }
}