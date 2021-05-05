package Concurete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme eklendi : " + game.getId() +  game.getName() + game.getPrice());
		
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun sistemden kaldýrýldý : " + game.getId() + game.getName() + game.getPrice());
		
	}

	@Override
	public void uptade(Game game) {
		System.out.println("Sistem oyunu güncelledi : " + game.getId() + game.getName() + game.getPrice());	
	}

}
