import java.util.ArrayList;
import java.util.List;

public class DiamondStrategy extends Strategy
{
	
	List<Integer> Bids;
	
	public DiamondStrategy() {
		Bids = new ArrayList<>();
	}
	
	@Override
	public int getNextMove() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateBids(Integer bids) {
		Bids.add(bids);
		
	}
	
}