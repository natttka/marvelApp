
package marvelInterface.characterDataWrapper;

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
public class ComicList {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToMany(cascade = CascadeType.ALL)
        private List<ComicSummary> items;

        private String collectionURI;

        private int available;

        private int returned;

        @OneToOne(mappedBy = "comics", cascade = CascadeType.ALL)
        private CharacterType character;
}