package service;

import entity.Human;
import serviceimpl.query.HumanQuery;

public interface HumanService {
	public Human queryHumanById(HumanQuery humanQuery);
}
