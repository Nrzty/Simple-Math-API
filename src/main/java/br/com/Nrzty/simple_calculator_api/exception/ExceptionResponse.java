package br.com.Nrzty.simple_calculator_api.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
}
