package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.dao.DAOException;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.ServiceException;

import java.util.List;

public class Main {

	public static void main(String[] args) throws ServiceException, DAOException {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 16000);

		appliances = service.find(criteriaTabletPC);
		PrintApplianceInfo.print(appliances);
		

		Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner.add(VacuumCleaner.POWER_CONSUMPTION.toString(), 90);
		criteriaVacuumCleaner.add(VacuumCleaner.CLEANING_WIDTH.toString(), 30);

		appliances = service.find(criteriaVacuumCleaner);
		PrintApplianceInfo.print(appliances);
		

		Criteria criteriaVacuumCleaner2 = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner2.add(VacuumCleaner.FILTER_TYPE.toString(), "B");
		criteriaVacuumCleaner2.add(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), 2900);

		appliances = service.find(criteriaVacuumCleaner2);
		PrintApplianceInfo.print(appliances);

	}

}
