package ru.metadevs.ivan;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CompanyTest {



    @Test
    public void shouldHireWorkerToCompany() {
        Company metadevs = new Company("Metadevs", 2 );
        Employee ivan = new Manager("Ivan", 21);
        Employee lalka = new Specialist("Lalka", 18);


        assertThat(metadevs.getEmployees().length).isEqualTo(3);
    }

    @Test
    public void exampleException(){
        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(()->{
            metadevs.hire(сотрудник, зарплата)
        });
    }
}

//Постараться сделать все тесты до следуюещй неделе (не обязательно).
//Привести к рабочему состоянию Gradle у всех. Приведём все к одному состоянию все методы, что они корректно принимают все.
