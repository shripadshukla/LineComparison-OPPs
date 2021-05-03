package LineComparionOpps;

public class LineComparisonOOPs {

	int x1;
	int x2;
	int y1;
	int y2;
	int x3;
	int x4;
	int y3;
	int y4;
	
	Integer line1 = (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	
	 Integer line2 = (int) Math.sqrt((y4 - y3) * (y4 - y3) + (x4 - x3) * (x4 - x3));
	
	public LineComparisonOOPs(int x1, int x2, int y1, int y2, int x3, int x4, int y3, int y4) {
		
		x1 = x1;
		x2 = x2;
		y1 = y1;
		y2 = y2;
		
		x3 = x3;
		x4 = x4;
		y3 = y3;
		y4 = y4;
	}
	
	
	public static void main(String []args) {
		
		LineComparisonOOPs UC = new LineComparisonOOPs(2, 4, 6, 10, 4, 6, 8, 12);
		
		
		if(UC.line1.equals(UC.line2))
			
			System.out.println("Lengths of both the lines are equal");
		
		else
			System.out.println("Not equal");
	}
}
