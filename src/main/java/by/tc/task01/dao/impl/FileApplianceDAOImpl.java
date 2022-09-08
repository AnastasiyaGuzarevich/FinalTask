package by.tc.task01.dao.impl;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.util.Map;


import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;



public class FileApplianceDAOImpl implements ApplianceDAO {

	private final String file = "appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		Map<String, Object> dataCriteria = criteria.getCriteria();
		List<String> resultApp = new ArrayList<>();

		ClassLoader loadFile = FileApplianceDAOImpl.class.getClassLoader();
		File sourceFile = new File(loadFile.getResource(file).getFile());

		try (BufferedReader readFile = new BufferedReader(new FileReader(sourceFile))) {
			String value;
			String data = readFile.readLine();

			while (data != null) {
				if (data.contains(criteria.getGroupSearchName())) {
					for (Map.Entry<String, Object> tempValue : dataCriteria.entrySet()) {
						value = tempValue.getKey() + "=" + tempValue.getValue();
						if (data.contains(value)) {
							resultApp.add(data);
						}
					}
				}
				data = readFile.readLine();
			}
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch (IOException e) {
			throw new DAOException(e);
		}

		return findAppliance(resultApp);
	}

	public List<Appliance> findAppliance(List<String> applianceGroup) {
		List<Appliance> appliences = new ArrayList<Appliance>();
		FileLogic logic = FileLogic.getInctance();

		for (String lineElement : applianceGroup) {
			String[] selectApplName;
			selectApplName = logic.lineCriteria(lineElement);

			String applianceName = selectApplName[0];

			if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initLaptop(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initTabletPC(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initRefrigerator(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initOven(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initRefrigerator(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initSpeakers(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initRefrigerator(selectApplName));
			}

			else if (applianceName.equals(Laptop.class.getSimpleName())) {
				appliences.add(logic.initVacuumCleaner(selectApplName));
			}
		}

		return appliences;
	}

}
