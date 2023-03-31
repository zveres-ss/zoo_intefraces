package ua.lviv.iot.algo.part1.zoo.manager.impl;

import java.util.List;

import ua.lviv.iot.algo.part1.zoo.impl.WaterZoo;
import ua.lviv.iot.algo.part1.zoo.manager.TaskManager;

public class WaterZooAnimalsFeedManager {
	
	@SuppressWarnings("rawtypes")
	private List<TaskManager> managers;
	
	private WaterZoo zoo;
	
	public void feedAnimals() {
		for (var manager: managers) {
			manager.prepareTasksFor(zoo);
		}
	}
	
	

}
