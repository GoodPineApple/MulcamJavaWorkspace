package aiMatrix;

public class AiMatrix {
	public static void main(String[] args) {
		double[][] six = 
		{{1, 5, 3, 4, 6, 2},
         {7, 3, 2, 1, 3, 8},
         {8, 3, 9, 6, 1, 0},
         {5, 1, 0, 8, 3, 0},
         {0, 9, 7, 4, 3, 2},
         {2, 9, 1, 0, 7, 3}};
		double[][] five = new double[5][5];
		double[][] four = new double[4][4];
		double[][] three = new double[3][3];
		double[][] two = new double[2][2];
		
		for(int j=1; j<5; j++){
			double[][]
			for (int i = 0; i < six.length-j; i++) {
				double a = six[i][i];
				double b = six[i][i+1];
				double c = six[i+1][i];
				double d = six[i+1][i+1];
				
				double result = (a + b + c + d) / 4;
				
				five[i][i] = result; 
			}			
		}
		
		while(){
			
		}
		System.out.println(five[0][0] + "," + five[0][1]);
	}


}