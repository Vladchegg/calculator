package pro.sky.course2.hw4.calculator.service;

import pro.sky.course2.hw4.calculator.exception.ZeroDivideException;

@org.springframework.stereotype.Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public float getSum(float a, float b) {
        return a + b;
    }

    @Override
    public float getMinus(float a, float b) {
        return a - b;
    }

    @Override
    public float getMultiply(float a, float b) { return a * b; }

    @Override
    public float getDivide(float a, float b) {
        if (b == 0) {
            throw new ZeroDivideException();
        }
        return a / b;
    }
}

