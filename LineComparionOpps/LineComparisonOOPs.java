package LineComparionOpps;

public class LineComparisonOOPs {

	int x1 = 2;
	int x2 = 4;
	int y1 = 6;
	int y2 = 10;
	
	int x3 = 4;
	int x4 = 8;
	int y3 = 10;
	int y4 = 14;
	
	public void Comparemethod() {
		
		Integer line1 = (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		Integer line2 = (int) Math.sqrt((y4 - y3) * (y4 - y3) + (x4 - x3) * (x4 - x3));
		
			
			System.out.println(line1.compareTo(line2));
			System.out.println("Hence, line1 is less than line2");
		
	}
	
	public static void main(String [] args) {
		
		LineComparisonOOPs Cmp = new LineComparisonOOPs();
		Cmp.Comparemethod();
	}
}
