package marvelInterface.characterDataWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
    public class CharacterDataContainer
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String total;

        @JsonProperty(value = "limit")
        private String limitt;

        @OneToOne(mappedBy = "data", cascade = CascadeType.ALL)
        @JoinColumn(name ="characterDataWrapper_id")
        private CharacterDataWrapper characterDataWrapper;

        @OneToMany(mappedBy = "characterDataContainer",cascade = CascadeType.ALL)
        private List <CharacterType> results;

        @JsonProperty(value = "count")
        private String countt;

        private String offset;

    }
