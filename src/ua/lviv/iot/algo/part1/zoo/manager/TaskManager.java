package ua.lviv.iot.algo.part1.zoo.manager;

import java.util.List;

import ua.lviv.iot.algo.part1.zoo.models.FeedTask;

public interface TaskManager <T> {

	List<FeedTask> prepareTasksFor(T animalsProvider);
}

