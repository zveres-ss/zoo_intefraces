package ua.lviv.iot.algo.part1.zoo.manager.impl;

import java.util.List;

import ua.lviv.iot.algo.part1.zoo.BeaverHost;
import ua.lviv.iot.algo.part1.zoo.manager.TaskManager;
import ua.lviv.iot.algo.part1.zoo.models.FeedTask;

public class BeaverFeedingTaskManager implements TaskManager<BeaverHost> {


	@Override
	public List<FeedTask> prepareTasksFor(BeaverHost animalsProvider) {
		
		for (var beaver : animalsProvider.getBeavers()) {
			
		}
		return null;
	}

}
