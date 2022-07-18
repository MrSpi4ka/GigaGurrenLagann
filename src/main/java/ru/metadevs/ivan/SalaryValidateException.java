package ru.metadevs.ivan;

public class SalaryValidateException extends IllegalArgumentException {

    public SalaryValidateException (String message){
        super(message);
    }
}
