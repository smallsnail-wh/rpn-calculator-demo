package com.wanghuan;

import com.wanghuan.service.OperationService;
import com.wanghuan.service.impl.OperationServicImpl;

/**
 * 程序运行类
 * 
 * @author wanghuan
 *
 */
public class RPNCalculatorApplication {

	public static void main(String[] args) {
		OperationService operationService = new OperationServicImpl();
		operationService.run();
	}
}
