package cn.ttw.kh;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


    public class Calculator {

        private Map<String, Integer> priority;//���������ȼ�Map

        public Calculator() {
            initPriority();
        }

        private void initPriority() {
            this.priority = new HashMap<>();
            //�����#���ǲ�������ջ�е�ջ��Ԫ�أ���Ϊ�˳��򷽱㴦�����ӵ�
            this.priority.put("#", 0);
            this.priority.put("+", 1);
            this.priority.put("-", 1);
            this.priority.put("*", 2);
            this.priority.put("/", 2);
        }

        //�õ������������ȼ�
        public int getPriority(String operator) {
            //�������Ž������⴦��
            if (operator.matches("[()]")) {
                return -1;
            } else {
                return priority.get(operator);
            }
        }

        //�ж����ȼ��ߵ�
        private boolean isPrior(String one, String another) {
            return getPriority(one) <= getPriority(another);
        }

        //�õ�ջ��Ԫ��
        private <T> T getTopEle(Stack<T> stack) {
            if (stack == null) {
                return null;
            } else {
                return stack.get(stack.size() - 1);
            }
        }

        /**
         * @param expression �������ʽ
         * @return
         * ����׺���ʽת��Ϊ��׺���ʽ
         */
        public Queue<String> toSuffix(String expression) {
            Queue<String> operandQueue = new LinkedList<>();//����������
            Stack<String> operatorStack = new Stack<>();//��������ջ
            operatorStack.push("#");

            String current = "";
            String operator = "";
            String number = "";
            int start = 0;
            int end = 0;
            for (int i = 0; i < expression.length(); i++) {
                current = String.valueOf(expression.charAt(i));
                // ��������֣�ĩβ���end++
                if (current.matches("[\\d\\.]")) {
                    // ������������һ���ַ���ֱ�ӽ��������
                    if (i == expression.length() - 1) {
                        operandQueue.add(current);
                    } else {
                        end++;
                    }
                } else {
                    // ������ַ�
                    // ����������ţ�������ջ
                    if (current.equals("(")) {
                        operatorStack.push(current);
                    } else {
                        // ����������ź�������������Ƚ�ǰ������������
                        number = expression.substring(start, end);
                        if (!number.isEmpty()) {
                            operandQueue.add(number);
                        }
                        // ����������ţ�ִ�г�ջ������������ջ��Ԫ������У�ֱ������ջ���������ţ�������ֱ�ӳ�ջ
                        if (current.equals(")")) {
                            while (!getTopEle(operatorStack).equals("(")) {
                                operandQueue.add(operatorStack.pop());
                            }
                            operatorStack.pop();
                        } else {
                            // ���������������������������ȼ����ڻ��ߵ��ڸ��������ջ��Ԫ�أ�Ȼ�󽫸��������ջ
                            operator = current;
                            while (isPrior(operator, getTopEle(operatorStack))) {
                                operandQueue.add(operatorStack.pop());
                            }
                            operatorStack.push(operator);
                        }
                    }
                    // ��ָ�����ֵ���βָ���1
                    start = end = i + 1;
                }
            }

            for (int i = operatorStack.size() - 1; i > 0; i--) {
                operandQueue.add(operatorStack.pop());
            }

            return operandQueue;
        }


        /**
         * @param expression �������ʽ
         * @return
         * �õ����ʽ�Ľ��
         */
        public double getResult(String expression) {
            Queue<String> suffixQueue = toSuffix(expression);
            Stack<String> suffixStack = new Stack<String>();
            String current = "";
            double frontOperand;
            double backOperand;
            double value = 0;
            for (int i = suffixQueue.size(); i > 0; i--) {
                current = suffixQueue.poll();
                //��������֣���ջ
                if (current.matches("^\\d+(\\.\\d+)*$")) {
                    suffixStack.push(current);
                } else {
                    backOperand = Double.valueOf(suffixStack.pop());
                    frontOperand = Double.valueOf(suffixStack.pop());
                    if (current.equals("+")) {
                        value = frontOperand + backOperand;
                    } else if (current.equals("-")) {
                        value = frontOperand - backOperand;
                    } else if (current.equals("*")) {
                        value = frontOperand * backOperand;
                    } else if (current.equals("/")) {
                        try {
                            value = frontOperand / backOperand;
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                    suffixStack.push(String.valueOf(value));
                }
            }
            String result = suffixStack.get(0);
            return Double.valueOf(result);
        }

    }


class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.getResult("-5"));
    }


}