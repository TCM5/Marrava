package com.tcms.marrava;

import com.tcms.marrava.batch.BatchResult;
import com.tcms.marrava.batch.IBatch;
import com.tcms.marrava.batch.SimpleBatch;

public class Example {

	/**
	 * Just an example for demonstrating
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		IBatch simpleBatch = new SimpleBatch();
		BatchResult batchResult = simpleBatch.initialize();

	}

}
