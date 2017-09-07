package com.tcms.marrava.batch;

/**
 * This class represents a VO just to inform the status when a batch is
 * executed.<br>
 * 
 * @author TCMS
 * 
 */
public class BatchResult {

	private boolean success;
	private String resultMsg;

	/**
	 * Default constructor.<br>
	 */
	public BatchResult() {
		// Nothing to do here...
	}

	/**
	 * TODO
	 * 
	 * @param success
	 * @param resultMsg
	 */
	public BatchResult(boolean success, String resultMsg) {
		super();
		this.success = success;
		this.resultMsg = resultMsg;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * @return the resultMsg
	 */
	public String getResultMsg() {
		return resultMsg;
	}

	/**
	 * @param resultMsg
	 *            the resultMsg to set
	 */
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

}
