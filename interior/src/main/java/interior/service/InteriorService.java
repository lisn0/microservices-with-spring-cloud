package interior.service;

import interior.controller.InteriorRegistrationRequest;
import interior.model.Interior;
import interior.repository.InteriorRepository;
import org.springframework.stereotype.Service;

@Service
public record InteriorService(InteriorRepository interiorRepository) {

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
    }

    public Interior findByCin(Integer cin) {
        return interiorRepository.findByCin(cin);
    }
}
