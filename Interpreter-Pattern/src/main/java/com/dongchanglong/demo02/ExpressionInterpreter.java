package com.dongchanglong.demo02;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 表达式解释器
 * @date 2023/11/6 21:46
 * @author DongCL
 */
public class ExpressionInterpreter {
    private Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression){
        String[] elements = expression.split(" ");
        int length = elements.length;
        for (int i = 0; i < (length + 1) / 2; i++) {
            numbers.addLast(new NumExpression(elements[i]));
        }

        for (int i = (length + 1) / 2; i < length; i++) {
            String operator = elements[i];
            //符号必须是 + - * / 否则抛出异常
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if (!isValid) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }

            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();

            Expression result = null;
            //对number1和number2进行运算
            if (operator.equals("+")) {
                result = new PluExpression(exp1,exp2);
            } else if (operator.equals("-")) {
                result = new SubExpression(exp1,exp2);
            } else if (operator.equals("*")) {
                result = new MulExpression(exp1,exp2);
            } else if (operator.equals("/")) {
                result = new DivExpression(exp1,exp2);
            }
            long interpret = result.interpret();
            numbers.addFirst(new NumExpression(interpret));
        }
        if (numbers.size()!=1){
            throw new RuntimeException("无效的表达式");
        }
        return numbers.pop().interpret();
    }
}
