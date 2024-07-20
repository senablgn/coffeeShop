package concrete;

import abstracts.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfReelPerson() {
		
		return true;
	}
	
	

}
