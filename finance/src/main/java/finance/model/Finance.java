package finance.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "finance")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Finance {
    @Id
    public String id;
    public String cin;
    public String name;
    public String type;
    public String description;

}
