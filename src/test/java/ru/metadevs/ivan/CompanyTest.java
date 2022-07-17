package ru.metadevs.ivan;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CompanyTest {

    @Test
    public void shouldHireWorkerToCompany() {
        Company metaDevs = new Company("Metadevs", 2);
        Employee ivan = new Manager("Ivan", 21);
        Employee pavel = new Specialist("Pavel", 18);
        metaDevs.hire(ivan, 1500);
        metaDevs.hire(pavel, 1200);

        assertThat(metaDevs.getEmployees().length).isEqualTo(2);
        assertThat(metaDevs.employeeByName(ivan.getName())).isEqualTo(ivan);
    }

    @Test
    public void shouldFireNonExistEmployeeFromCompany() {
        Company metaDevs = new Company("Metadevs", 1);
        Employee ivan = new Manager("Ivan", 21);
        Employee pavel = new Specialist("Pavel", 18);
        metaDevs.hire(ivan, 1500);

        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metaDevs.fire(pavel));
    }

    @Test
    public void shouldFireEmployeeFromCompany (){
        Company metaDevs = new Company("Metadevs", 1);
        Employee ivan = new Specialist("Ivan", 21);
        metaDevs.hire(ivan,1500);

        assertThat(metaDevs.getEmployees().length).isEqualTo(1);

        metaDevs.fire(ivan);

        assertThat(metaDevs.getEmployees().length).isEqualTo(0);
    }

//    @Test
//    public void shouldFoundEmployeeNonExistInFromCompany(){
//        Company metaDevs = new Company("Metadevs", 1);
//        Employee ivan = new Manager("Ivan", 21);
//
//
////        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() ->{
////            metaDevs.employeeByName("Ivan");
////        });
//
//    }

    @Test
    public void shouldHireExistEmployeeFromCompany(){
        Company metaDevs = new Company("Metadevs", 1);
        Employee ivan = new Manager("Ivan", 21);
        metaDevs.hire(ivan, 1500);

        assertThatExceptionOfType(EmployeeValidateExceptions.class).isThrownBy(() ->  metaDevs.hire(ivan, 1500));
    }
}

