package br.com.rbn.payrollapi.resources;

import br.com.rbn.payrollapi.domain.Payroll;
import br.com.rbn.payrollapi.service.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {

        return ResponseEntity.ok().body(service.getPayroll(workerId, payment));
    }
}
