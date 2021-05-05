package Concurete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Büyük indirim baþladý!!! : " + campaign.getCampaignName() );
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Büyük indirim maalesef bitti  : " + campaign.getCampaignName() );
		
	}
  
}
