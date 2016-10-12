package serviceimpl;

import dao.HumanDao;
import entity.Human;
import service.HumanService;

public class HumanServiceImpl implements HumanService{

	HumanDao humanDao;
	
	public void setHumanDao(HumanDao humanDao) {
		this.humanDao = humanDao;
	}

	@Override
	public Human queryHumanById(Integer id) {
		return humanDao.queryHumanById(id);
	}

}
