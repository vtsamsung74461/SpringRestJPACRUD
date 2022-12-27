package org.example;


@ControllerAdvice
public class EmployeeNotFoundAdvice {
@ResponseBody
@ExceptionHandler(EmployeeNotFoundException.class)
@ResponseStatus(HttpStatus.NOT_FOUND)
String employeeNotFoundHandler(EmployeeNotFoundException ex) {
    return ex.getMessage();
}

}
