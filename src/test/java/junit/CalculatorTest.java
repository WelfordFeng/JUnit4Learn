/*
 * Copyright 2001-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * <p> Title: </p>
 *
 * <p> Description: </p>
 *
 * @author: Guo.Weifeng
 * @version: 1.0
 * @create: 2019/7/25 15:36
 */
public class CalculatorTest {

    static Calculator calculator;

    /**静态类，类执行时执行*/
    @BeforeClass
    public static void testBeforeClass() {
        calculator = new Calculator();
        System.out.println("BeforeClass Test");
    }

    /**
     * 每个Test都会运行
     * */
    @Before
    public void testBefore() {
        System.out.println("Before Test");
    }

    @Test
    public void testEvaluate(){
        System.out.println("Run testEvaluate");
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    @Test
    public void testAdd() {
        System.out.println("Run testAdd");
        int sum = calculator.add(2, 3);
        assertEquals(5, sum);
        assertTrue("sum not le 5",sum <= 5);
        assertThat("sum not 5", sum, is(5));
    }

    @Ignore
    @Test(expected = ArithmeticException.class, timeout = 1000)
    public void testDiv() {
        System.out.println("Run testDiv");
        int div = calculator.div(8, 0);

    }

    /**每个Test方法都会执行*/
    @After
    public void testAfter() {
        System.out.println("After Test");
    }

    /**静态类，类执行时执行*/
    @AfterClass
    public static void testAfterClass() {
        calculator = null;
        System.out.println("AfterClass Test");
    }
}