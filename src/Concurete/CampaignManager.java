package Concurete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("B�y�k indirim ba�lad�!!! : " + campaign.getCampaignName() );
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("B�y�k indirim maalesef bitti  : " + campaign.getCampaignName() );
		
	}
  
}
