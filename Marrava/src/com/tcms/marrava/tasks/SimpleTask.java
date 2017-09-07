package com.tcms.marrava.tasks;

import java.util.Calendar;

public class SimpleTask extends AbstractTask {

	@Override
	public void run() {

		System.out.println("Task " + SimpleTask.class.getSimpleName() + " started at " + Calendar.getInstance().getTime());
		
		// Just to example
		int i = 1;
		do {
			System.out.println("Processing order #" + i);
			i++;
		} while (i < 3);

		System.out.println("Task " + SimpleTask.class.getSimpleName() + " terminated at " + Calendar.getInstance().getTime());
	}

}
