package ru.omsu.lab4;

public interface IFunctional<T extends IOneRealArgumentFunction> {
    double calculate(T func);
}