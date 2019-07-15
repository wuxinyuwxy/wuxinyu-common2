package com.wuxinyu.common.utils;

/**
 * 
 * @ClassName: CMSRuntimeException 
 * @Description: 自定义运行时异常类
 * @author:武鑫宇 
 * @date: 2019年7月15日 上午8:43:42
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: 继承
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @Title:CMSRuntimeException
	 * @Description:无参构造
	 */
	public CMSRuntimeException() {
		super();
	}
	
	/**
	 * 
	 * @Title:CMSRuntimeException
	 * @Description:有参构造
	 * @param message
	 */
	public CMSRuntimeException(String message) {
		super(message);
	}

}
