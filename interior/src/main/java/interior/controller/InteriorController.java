package interior.controller;


import interior.model.Interior;
import interior.service.InteriorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/interior")
@AllArgsConstructor
public class InteriorController {

    private final InteriorService interiorService;

    @PostMapping
    public void registerInterior(@RequestBody InteriorRegistrationRequest interiorRegistrationRequest){
        log.info("new offence registration {}", interiorRegistrationRequest);
        interiorService.registerOffence(interiorRegistrationRequest);
    }

    @GetMapping("/{cin}")
    public Interior findByCin(@PathVariable("cin") Integer cin){
        return interiorService.findByCin(cin);
    }
}
