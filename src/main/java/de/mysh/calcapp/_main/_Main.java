package de.mysh.calcapp._main;
import de.mysh.calcapp.util.Calculator;
import de.mysh.calcapp.service.ResultWriteService;


public class _Main {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 7;
        int result = Calculator.summarise(num1, num2);
        ResultWriteService.printTheResult(num1, num2, result, "Сумма ");
        result = Calculator.subtract(num1, num2);
        ResultWriteService.printTheResult(num1, num2, result, "Разность ");
        result = Calculator.multiply(num1, num2);
        ResultWriteService.printTheResult(num1, num2, result, "Произведение ");
    }
}
