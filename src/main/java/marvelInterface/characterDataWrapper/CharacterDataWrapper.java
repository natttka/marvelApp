package marvelInterface.characterDataWrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CharacterDataWrapper {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String attributionText;

        private String etag;

        private String status;

        @OneToOne(cascade = CascadeType.ALL)
        private CharacterDataContainer data;

        private String copyright;

        private String code;


        public void setId(Long id) {
                this.id = id;
        }

        public void setAttributionText(String attributionText) {
                this.attributionText = attributionText;
        }

        public void setEtag(String etag) {
                this.etag = etag;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public void setData(CharacterDataContainer data) {
                this.data = data;
        }

        public void setCopyright(String copyright) {
                this.copyright = copyright;
        }

        public void setCode(String code) {
                this.code = code;
        }


        public Long getId() {
                return id;
        }

        public String getAttributionText() {
                return attributionText;
        }

        public String getEtag() {
                return etag;
        }

        public String getStatus() {
                return status;
        }

        public CharacterDataContainer getData() {
                return data;
        }
        public String getCopyright() {
                return copyright;
        }

        public String getCode() {
                return code;
        }


}

