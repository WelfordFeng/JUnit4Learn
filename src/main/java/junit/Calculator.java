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

/**
 * <p> Title: </p>
 *
 * <p> Description: </p>
 *
 * @author: Guo.Weifeng
 * @version: 1.0
 * @create: 2019/7/25 15:33
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String item : expression.split("\\+")) {
            sum += Integer.valueOf(item);
        }

        return sum;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public int div(int x, int y) {
        return x / y;
    }
}