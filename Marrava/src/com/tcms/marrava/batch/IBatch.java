package com.tcms.marrava.batch;

public interface IBatch {

	/**
	 * This method should be implemented for any type of batch. The batch
	 * implementation to execute should be made here.<br>
	 * 
	 * @return the result of the processing as {@link BatchResult}
	 */
	public BatchResult initialize();

}
