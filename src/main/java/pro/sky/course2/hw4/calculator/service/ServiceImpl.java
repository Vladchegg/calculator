package pro.sky.course2.hw4.calculator.service;

import java.util.Objects;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Override
    public float getSum(float a, float b) {
        return a + b;
    }

    @Override
    public float getMinus(float a, float b) {
        return a - b;
    }

    @Override
    public float getMultiply(float a, float b) {
        return a * b;
    }

    @Override
    public float getDivide(float a, float b) {
        return a / b;
    }
}

