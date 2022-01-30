package interior.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Interior {
    @Id
    @SequenceGenerator(
            name = "interior_id_sequence",
            sequenceName = "interior_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "interior_id_sequence"
    )

    private Integer id;
    private Integer cin;
    private String firstName;
    private String lastName;
    private String address;
    private Boolean rechercher;
    private String type;
}
