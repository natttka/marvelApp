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
public class ComicsData {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String total;

        private String limit;

        @OneToOne(mappedBy = "data")
        private ComicWrapper comicWrapper;

        @OneToMany(mappedBy = "comicsData", cascade = CascadeType.ALL)
        private List<ComicSummary> results;

        private String count;

        private String offset;
}
