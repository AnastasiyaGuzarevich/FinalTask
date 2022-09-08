package by.tc.task01.service.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.Validator;
import by.tc.task01.dao.DAOException;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applDAO = factory.getApplianceDAO();

		List<Appliance> appliances = null;
		boolean check = true;

		check = Validator.LaptopValidator(criteria);

		try {
			if (check == true) {
				appliances = applDAO.find(criteria);
			} else {
				appliances = null;
			}
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return appliances;
	}

}
