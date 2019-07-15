package com.wuxinyu.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 在src/test/java中编写测试代码，测试上面的方法  测试方法
 * @author:武鑫宇 
 * @date: 2019年7月15日 上午9:00:01
 */
public class AssertUtilTest {

	//每个类、每个方法上有清晰的注释（6分）
	/**
	 * 
	 * @Title: testIsTrue 
	 * @Description: 测试AssertUtil.isTrue()方法,通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
		String pwd = "123";
		String repwd = "123";
		AssertUtil.isTrue(pwd.equals(repwd), "断言为假");
	}
	
	/**
	 * 
	 * @Title: testIsTrue2 
	 * @Description: 测试AssertUtil.isTrue()方法,不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsTrue2() {
		String pwd = "123";
		String repwd = "333";
		AssertUtil.isTrue(pwd.equals(repwd), "断言为假,无法通过");
	}

	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description: 测试AssertUtil.isFalse()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		String pwd = "123";
		String repwd = "343";
		AssertUtil.isFalse(pwd.equals(repwd), "断言为假");
	}
	
	/**
	 * 
	 * @Title: testIsFalse2 
	 * @Description: 测试AssertUtil.isFalse()方法，不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsFalse2() {
		String pwd = "123";
		String repwd = "123";
		AssertUtil.isFalse(pwd.equals(repwd), "断言为真,无法通过");
	}

	/**
	 * 
	 * @Title: testNotNull 
	 * @Description: 测试AssertUtil.notNull()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testNotNull() {
		//断言对象不为空
		AssertUtil.notNull("", "断言对象不为空");
	}
	
	/**
	 * 
	 * @Title: testNotNull2 
	 * @Description: 测试AssertUtil.notNull()方法,不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testNotNull2() {
		//断言对象不为空
		AssertUtil.notNull(null, "断言对象为空,抛出异常");
	}

	/**
	 * 
	 * @Title: testIsNull 
	 * @Description: 测试AssertUtil.isNull()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsNull() {
		//断言对象必须空
		AssertUtil.isNull(null, "断言对象必须空");
	}
	
	/**
	 * 
	 * @Title: testIsNull2 
	 * @Description: 测试AssertUtil.isNull()方法，不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsNull2() {
		//断言对象必须空
		AssertUtil.isNull("", "对象不空,抛出异常");
	}

	/**
	 * 
	 * @Title: testNotEmptyCollectionOfQString 
	 * @Description: 用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testNotEmptyCollectionOfQString() {
		//断言集合不为空，对象不能空，以及必须包含1个元素。
		List list = new ArrayList<>();
		//添加数据
		list.add("123");
		//调用方法
		AssertUtil.notEmpty(list, "断言集合不为空，对象不能空，以及必须包含1个元素");
	}
	
	/**
	 * 
	 * @Title: testNotEmptyCollectionOfQString2 
	 * @Description: 用List对象测试AssertUtil.notEmpty()方法，不能通过断言测一次（2分）。
	 * @return: void
	 */
	@Test
	public void testNotEmptyCollectionOfQString2() {
		//断言集合不为空，对象不能空，以及必须包含1个元素。
		List list = new ArrayList<>();
		//调用方法
		AssertUtil.notEmpty(list, "集合为空，对象为空，以及不包含1个元素,抛出异常");
	}

	/**
	 * 
	 * @Title: testNotEmptyMapOfQQString 
	 * @Description:用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testNotEmptyMapOfQQString() {
		//断言Map集合不为空，对象不能空，以及必须包含1个元素
		Map<Object,Object> map = new HashMap<>();
		//添加数据
		map.put("123", "小花");
		//调用方法
		AssertUtil.notEmpty(map, "断言Map集合不为空，对象不能空，以及必须包含1个元素");
	}
	
	/**
	 * 
	 * @Title: testNotEmptyMapOfQQString2 
	 * @Description:用Map对象测试AssertUtil.notEmpty()方法，不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testNotEmptyMapOfQQString2() {
		//断言Map集合不为空，对象不能空，以及必须包含1个元素
		Map<Object,Object> map = new HashMap<>();
		//调用方法
		AssertUtil.notEmpty(map, "Map集合为空，对象为空，以及不包含1个元素,抛出异常");
	}
	
	/**
	 * 
	 * @Title: testHasText 
	 * @Description: 用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testHasText() {
		//断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0
		String str = "   123   ";
		//调用方法
		AssertUtil.hasText(str, "断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0");
	}
	
	/**
	 * 
	 * @Title: testHasText2 
	 * @Description: 用String对象测试AssertUtil.hasText()方法,不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testHasText2() {
		//断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0
		String str = "     ";
		//调用方法
		AssertUtil.hasText(str, "断言字符串必须有值，去掉空格，然后判断字符串长度大于0.抛出异常");
	}

	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description: 测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		//断言值必须大于0
		BigDecimal num = new BigDecimal("0.23");
		AssertUtil.greaterThanZero(num, "断言值必须大于0");
	}
	
	/**
	 * 
	 * @Title: testGreaterThanZero2 
	 * @Description:测试AssertUtil. greaterThanZero()方法，不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero2() {
		//断言值必须大于0
		BigDecimal num = new BigDecimal("-0.9");
		AssertUtil.greaterThanZero(num, "断言值必须大于0");
	}

}
