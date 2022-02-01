package finance.controller;

import finance.model.Finance;
import finance.repository.FinanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/finance")
@RequiredArgsConstructor
public class FinanceController {

    private final FinanceRepository financeRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Finance> findAll(){
        return financeRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOffence(@RequestBody Finance finance){
        financeRepository.save(finance);
    }


    @GetMapping("/{cin}")
    public Finance findOffenceByCin(@PathVariable("cin") String cin){

        return financeRepository.findByCin(cin);
    }
}
