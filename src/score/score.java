// Practice #7
package score;

public class score {

	public static void main(String[] args) {
		int score[][] = new int[][] {
			{90,80,80},{85,85,95},{95,70,75},{80,80,90},{90,75,80}
		};

		int sum[] = new int [5];
		double avg[] = new double [5];

		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum[i]+=score[i][j];
			}
			avg[i]=sum[i]/(float)score[i].length;
			
			System.out.printf("ID-%d:  ÇÕ°è=%d,  Æò±Õ=%.2f\n",i,sum[i],avg[i]);
		}
	}

}
