### 单元测试

#### 单元测是环境：JUnit4 --> 现在已经是JUnit5
   - 先学JUnit4，然后了解JUnit5的新特性和新内容
   - 再学JUnit4如何测试SpringBoot

#### 什么是单元测试

在开发过程中，写了一个类，类中的方法会不会有Bug？怎么能够检测到Bug？
   - 传统解决方案是：利用main方法，来进行打印测试，但是这种测试不能达到完全将测试用例覆盖的情况，并且需要自己观察结果
   - 引入单元测试，能够尽可能的覆盖所有情况（覆盖情况还是需要自己书写），单元测试能够自动显示测试结果，并提示错误内容

#### 为什么要进行单元测试

   - 重用测试，应付将来的实现的变化
   - 提高士气，明确知道代码是否有问题
   - 多个方法可以同时进行测试
   - 直观展示测试结果，无需检查

#### 放弃断言，使用hamcrest断言，看上去更自然
   1. assertThat
   2. 使用hamcrest的匹配方法
   3. 示例：
   
     - assertThat(n, allOf(greaterThan(1), lessThan(15))); 条件都满足
     - assertThat(n, anyOf(greaterThan(16, lessThan(8)))); 只要满足其中一个
     - assertThat(n, anything());  什么值都通过
     - assertThat(str, is("bjsxt"));  字符串是不是
     - assertThat(str, not("bjsxt")); 字符串不符合
     - assertThat(n, is(not(8)));

     - assertThat(str, containsString("bjsxt")); 字符串包含
     - assertThat(str, endsWith("/")); 字符串结尾
     - assertThat(str, startsWith("/")); 字符串开头
     - assertThat(n, equalTo(nExpected)); 两个对象是不是一致（这里可以比较对象， is比较值）
     - assertThat(str, equalToIgnoringCase("development"); 字符串忽略大小写是否相等
     - assertThat(str, equalToIgnoringWhiteSpace("development")); 字符串忽略空格是否相等

     - assertThat(d, closeTo(3.0, 0.3));  值是否接近3.0， 误差在+-0.3左右
     - assertThat(d, greaterThan(3.0));   大于
     - assertThat(d, lessThan(10.0)); 小于
     - assertThat(d, greaterThanOrEqualTo(5.0)); 大于等于
     - assertThat(d, lessThanOrEqualTo(16.0)); 小于等于

     - assertThat(map, hasEntry("key", "value"));  map包含
     - assertThat(iterable, hasItem("value"));
     - assertThat(map, hasKey("key"));
     - assertThat(map, hasValue("value"));

#### Failure 和 Error
   - Failure 指测试内容出错
   - Error 指测试程序本身出错
#### JUnit4 Annotation
   1. @Test: 测试方法
       - expected=XXException.class
       - timeout=XXX
   2. @Ignore: 被忽略的测试方法
   3. @Before：每个测试方法之前运行
   4. @After: 每个测试方法之后运行
   5. @BeforeClass：所有测试开始之前运行
   6. @AfterClass：所有测试结束之后运行
#### 运行多个测试
##### 注意：
   1. 遵守约定，如：
       - 类放在test包中
       - 类名用XXXTest结尾
       - 方法用testMethod命名
