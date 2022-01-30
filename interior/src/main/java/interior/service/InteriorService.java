package interior.service;

import interior.controller.InteriorRegistrationRequest;
import interior.model.Interior;
import interior.repository.InteriorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class InteriorService {

    private final InteriorRepository interiorRepository;

    public void registerOffence(InteriorRegistrationRequest request) {
        Interior interior = Interior.builder()
                .cin(request.cin())
                .firstName(request.firstName())
                .lastName(request.lastName())
                .address(request.address())
                .rechercher(request.rechercher())
                .type(request.type())
                .build();
        interiorRepository.save(interior);

        log.info("registering  {} ", request);

    }

    public Interior findByCin(Integer cin) {
        return interiorRepository.findByCin(cin);
    }

}
