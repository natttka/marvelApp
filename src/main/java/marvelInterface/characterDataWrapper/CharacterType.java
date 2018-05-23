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
public class CharacterType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idd;

    @OneToOne(cascade = CascadeType.ALL)
    private ComicList comics;

    @OneToOne(cascade = CascadeType.ALL)
    private Image thumbnail;

    @ManyToOne(cascade = CascadeType.ALL)
    private CharacterDataContainer characterDataContainer;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    private String name;

    private String modified;

    public String getDescription() {
        return description;
    }
}
