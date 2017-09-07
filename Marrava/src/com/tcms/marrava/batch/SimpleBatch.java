package com.tcms.marrava.batch;

import java.util.Calendar;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import com.tcms.marrava.tasks.AbstractTask;
import com.tcms.marrava.tasks.SimpleTask;

public class SimpleBatch implements IBatch {

	/**
	 * This is the task to execute, where the calling to business logic should be
	 * made
	 */
	private AbstractTask task = new SimpleTask();

	/**
	 * This is the starting date of the batch. This example starts at 00:00 of the
	 * first execution day
	 */
	private static Calendar startingDateHour = Calendar.getInstance();
	static {
		startingDateHour.set(Calendar.HOUR_OF_DAY, 0);
		startingDateHour.set(Calendar.MINUTE, 0);
		startingDateHour.set(Calendar.SECOND, 0);

	}

	/**
	 * This is period of the tasking. Is based on the starting date, and will one
	 * day to miliseconds. So based on this, the task will run at 00:00 every day
	 */
	private long taskPeriod = TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS);

	@Override
	public BatchResult initialize() {
		Timer timer = new Timer();
		timer.schedule(task, startingDateHour.getTime(), taskPeriod);
		// for a more convinent test, uncomment this to check the Batch running every 10 seconds 
		//timer.schedule(task, startingDateHour.getTime(), 10000);

		/**
		 * This is just an example case, but some logic should be made to validate if
		 * the batch was succeed or not
		 */
		return new BatchResult(false, "Batch execution stopped");
	}

}
