import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleStrategy extends Strategy
{

	public SimpleStrategy() {
		
	}
	
	@Override
	public int getNextMove() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int output=sc.nextInt();
		sc.close();
		return output;
	}

	@Override
	public void updateBids(Integer bid) {
		// Do nothing
		return;
	}
	
}