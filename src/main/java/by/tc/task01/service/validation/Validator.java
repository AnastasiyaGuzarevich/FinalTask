package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;


public class Validator {

	public static boolean criteriaValidator(Criteria criteria, String input) {
		
		boolean valid = true;

		if (!input.equals("")) {
			if (input.equalsIgnoreCase(criteria.getGroupSearchName()) == true) {
				valid = true;
			} else {
				valid = false;
			}
		}

		return valid;
	}

	public static boolean RefrigeratorValidator(Criteria criteria) {

		boolean valid = true;

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Refrigerator.WEIGHT.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())) {
				if (searchCriteria.getValue().getClass() == Double.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Refrigerator.HEIGHT.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Refrigerator.WIDTH.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		return valid;
	}
	
	
	
	public static boolean LaptopValidator(Criteria criteria) {

		boolean valid = true;

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())) {
				if (searchCriteria.getValue().getClass() == Double.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Laptop.OS.toString())) {
				if (searchCriteria.getValue().getClass() == String.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Laptop.MEMORY_ROM.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Laptop.CPU.toString())) {
				if (searchCriteria.getValue().getClass() == Double.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Laptop.DISPLAY_INCHES.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		return valid;
	}

	public static boolean SpeakersValidator(Criteria criteria) {

		boolean valid = true;
		
		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Speakers.FREQUENCY_RANGE.toString())) {
				if (searchCriteria.getValue().getClass() == String.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Speakers.CORD_LENGTH.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}
		
		return valid;
		
	}

	public static boolean TabletPCValidator(Criteria criteria) {

		boolean valid = true;

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.TabletPC.MEMORY_ROM.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.TabletPC.COLOR.toString())) {
				if (searchCriteria.getValue().getClass() == String.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		return valid;
	}


	public static boolean OvenValidator(Criteria criteria) {

		boolean valid = true;

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Oven.POWER_CONSUMPTION.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Oven.WEIGHT.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Oven.CAPACITY.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Oven.DEPTH.toString())) {
				if (searchCriteria.getValue().getClass() == Integer.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Oven.WIDTH.toString())) {
				if (searchCriteria.getValue().getClass() == Double.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		for (HashMap.Entry<String, Object> searchCriteria : criteria.getCriteria().entrySet()) {
			if (searchCriteria.getKey().toString().contains(SearchCriteria.Oven.HEIGHT.toString())) {
				if (searchCriteria.getValue().getClass() == Double.class) {
					valid = true;
				}
			} else {
				valid = false;
			}
		}

		return valid;
	}

}
