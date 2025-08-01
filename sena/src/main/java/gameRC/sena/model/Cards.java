package gameRC.sena.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity(name="cards")
public class Cards {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cartsId")
    private int cartsId;
    
    @Column(name="characterName", length = 30)
    private String characterName;

    @Column (name="position", length = 30)
    private String position;

    @Column (name="club", length = 40)
    private String club;

    @Lob
    @Column (name="image", columnDefinition = "Text", nullable = false)
    private String image;


    
}
