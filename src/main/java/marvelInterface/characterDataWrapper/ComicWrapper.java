package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComicWrapper {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String attributionText;

        private String etag;

        private String status;

        @OneToOne(cascade = CascadeType.ALL)
        private ComicsData data;

        private String copyright;

        private String code;

        private String attributionHTML;

}
