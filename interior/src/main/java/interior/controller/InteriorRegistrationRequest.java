package interior.controller;

public record InteriorRegistrationRequest(
        Integer cin,
        String firstName,
        String lastName,
        String address,
        String type,
        Boolean rechercher) {
}
