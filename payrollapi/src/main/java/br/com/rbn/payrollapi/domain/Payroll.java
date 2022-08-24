package br.com.rbn.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {

    private String workerName;
    private String description;
    private Double hourlyPrice;
    private Double workedHours;
    private Double totalPayment;

}
