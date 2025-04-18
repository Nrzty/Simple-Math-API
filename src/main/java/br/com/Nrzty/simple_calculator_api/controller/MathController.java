package br.com.Nrzty.simple_calculator_api.controller;

import br.com.Nrzty.simple_calculator_api.exception.UnsupportedMathOperationException;
import br.com.Nrzty.simple_calculator_api.math.SimpleMath;
import br.com.Nrzty.simple_calculator_api.request.converters.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath simpleMath = new SimpleMath();

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Number is not numeric");
        }
        return simpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Number is not numeric");
        }
        return simpleMath.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Number is not numeric");
        }
        return simpleMath.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Number is not numeric");
        }

        if (numberOne.equals("0") || numberTwo.equals("0")) {
            throw new UnsupportedMathOperationException("Division by zero");
        }
        return simpleMath.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Number is not numeric");
        }
        return simpleMath.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping("squareRoot/{number}")
    public Double squareRoot(@PathVariable("number") String number) {
        if (!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Number is not numeric");
        }
        return simpleMath.squareRoot(NumberConverter.convertToDouble(number));
    }
}
