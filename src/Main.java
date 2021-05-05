import Concurete.CampaignManager;
import Concurete.CustomerManager;
import Concurete.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(0, null, null, 0 , null);
		
		customer.setId(1);
		customer.setFirstName("Melih");
		customer.setLastName("KAYALI");
		customer.setBirthOfYear(2005);
		
		Customer customer1 = new Customer(0, null, null, 0, null);
		customer1.setId(2);
		customer1.setFirstName("Sezer");
		customer1.setLastName("TETÝK");
		customer1.setBirthOfYear(2005);
		
		Game game = new Game(0, null, null);
		game.setId(10);
		game.setName("Battlefield 1");
		game.setPrice("280");
		
		
		Game game1 = new Game(0, null, null);
		game1.setId(11);
		game1.setName("Death Stranding");
		game1.setPrice("399");
		
		
		Campaign campaign = new Campaign(0, null, 0);
		campaign.setId(30);
		campaign.setCampaignName("Haftasonu çýlgýnlýðý");
		campaign.setDiscount(20);
		
		
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		customerManager.add(customer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		
			
	}


}
