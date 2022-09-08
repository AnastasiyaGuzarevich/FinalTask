package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class FileLogic {

	private static final FileLogic instance = new FileLogic();

	private FileLogic() {
	}

	public static FileLogic getInctance() {
		return instance;
	}

	public String[] lineCriteria(String file) {
		file = file.replace(":", " ");
		file = file.replace(",", " ");
		file = file.replace("=", " ");
		String[] resultText = file.split(" ");

		return resultText;
	}

	public static Appliance initLaptop(String[] laptop) {

		Laptop lptp = new Laptop();
		int intValue;
		double doubleValue;
		String stringValue;

		stringValue = laptop[2];
		intValue = Integer.parseInt(stringValue);
		lptp.setBatteryCapacity(intValue);

		stringValue = laptop[4];
		lptp.setOs(stringValue);

		stringValue = laptop[6];
		intValue = Integer.parseInt(stringValue);
		lptp.setMemoryRom(intValue);

		stringValue = laptop[8];
		intValue = Integer.parseInt(stringValue);
		lptp.setSystemMemory(intValue);

		stringValue = laptop[10];
		doubleValue = Double.parseDouble(stringValue);
		lptp.setCpu(doubleValue);

		stringValue = laptop[12];
		intValue = Integer.parseInt(stringValue);
		lptp.setDisplayInches(intValue);

		Appliance appl = lptp;

		return appl;
	}

	public static Appliance initTabletPC(String[] tabletPC) {

		TabletPC tablet = new TabletPC();
		int intValue;
		String stringValue;

		stringValue = tabletPC[2];
		intValue = Integer.parseInt(stringValue);
		tablet.setBatteryCapacity(intValue);

		stringValue = tabletPC[4];
		intValue = Integer.parseInt(stringValue);
		tablet.setDisplayInches(intValue);

		stringValue = tabletPC[6];
		intValue = Integer.parseInt(stringValue);
		tablet.setMemoryRom(intValue);

		stringValue = tabletPC[8];
		intValue = Integer.parseInt(stringValue);
		tablet.setFlashMemoryCapacity(intValue);

		stringValue = tabletPC[8];
		tablet.setColor(stringValue);

		Appliance appl = tablet;

		return appl;
	}

	public static Appliance initRefrigerator(String[] refridg) {

		Refrigerator refrigerator = new Refrigerator();
		int intValue;
		String stringValue;

		stringValue = refridg[2];
		intValue = Integer.parseInt(stringValue);
		refrigerator.setPowerConsumption(intValue);

		stringValue = refridg[4];
		intValue = Integer.parseInt(stringValue);
		refrigerator.setWeight(intValue);

		stringValue = refridg[6];
		intValue = Integer.parseInt(stringValue);
		refrigerator.setFreezerCapacity(intValue);

		stringValue = refridg[8];
		intValue = Integer.parseInt(stringValue);
		refrigerator.setFreezerCapacity(intValue);

		stringValue = refridg[10];
		intValue = Integer.parseInt(stringValue);
		refrigerator.setHeight(intValue);

		stringValue = refridg[12];
		intValue = Integer.parseInt(stringValue);
		refrigerator.setWidth(intValue);

		Appliance appl = refrigerator;

		return appl;
	}

	public static Appliance initOven(String[] oven) {

		Oven ovenObj = new Oven();
		int intValue;
		String stringValue;

		stringValue = oven[2];
		intValue = Integer.parseInt(stringValue);
		ovenObj.setPowerConsumption(intValue);

		stringValue = oven[4];
		intValue = Integer.parseInt(stringValue);
		ovenObj.setWeight(intValue);

		stringValue = oven[6];
		intValue = Integer.parseInt(stringValue);
		ovenObj.setCapacity(intValue);

		stringValue = oven[8];
		intValue = Integer.parseInt(stringValue);
		ovenObj.setDepth(intValue);

		stringValue = oven[10];
		intValue = Integer.parseInt(stringValue);
		ovenObj.setHeight(intValue);

		stringValue = oven[12];
		intValue = Integer.parseInt(stringValue);
		ovenObj.setWidth(intValue);

		Appliance appl = ovenObj;

		return appl;
	}

	public static Appliance initSpeakers(String[] speaker) {

		Speakers speakersObj = new Speakers();
		int intValue;
		String stringValue;

		stringValue = speaker[2];
		intValue = Integer.parseInt(stringValue);
		speakersObj.setPowerConsumption(intValue);

		stringValue = speaker[4];
		intValue = Integer.parseInt(stringValue);
		speakersObj.setNumberOfSpeakers(intValue);

		stringValue = speaker[6];
		speakersObj.setFrequencyRange(stringValue);

		stringValue = speaker[8];
		intValue = Integer.parseInt(stringValue);
		speakersObj.setCordLength(intValue);

		Appliance appl = speakersObj;

		return appl;
	}

	public static Appliance initVacuumCleaner(String[] vacuumCleaner) {

		VacuumCleaner vacCleaner = new VacuumCleaner();
		int intValue;
		String stringValue;

		stringValue = vacuumCleaner[2];
		intValue = Integer.parseInt(stringValue);
		vacCleaner.setPowerConsumption(intValue);

		stringValue = vacuumCleaner[4];
		vacCleaner.setFilterType(stringValue);

		stringValue = vacuumCleaner[6];
		vacCleaner.setBagType(stringValue);

		stringValue = vacuumCleaner[8];
		vacCleaner.setWandType(stringValue);

		stringValue = vacuumCleaner[10];
		intValue = Integer.parseInt(stringValue);
		vacCleaner.setMotorSpeedRegulation(intValue);

		stringValue = vacuumCleaner[12];
		intValue = Integer.parseInt(stringValue);
		vacCleaner.setCleaningWidth(intValue);

		Appliance appl = vacCleaner;

		return appl;
	}
}
