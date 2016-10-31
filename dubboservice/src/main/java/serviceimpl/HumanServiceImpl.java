package serviceimpl;

import dao.HumanDao;
import entity.Human;
import service.HumanService;
import serviceimpl.query.HumanQuery;

public class HumanServiceImpl implements HumanService{

	HumanDao humanDao;
	
	public void setHumanDao(HumanDao humanDao) {
		this.humanDao = humanDao;
	}

	@Override
	public Human queryHumanById(HumanQuery humanQuery) {
		return humanDao.queryHumanById(humanQuery.getId());
	}

}
