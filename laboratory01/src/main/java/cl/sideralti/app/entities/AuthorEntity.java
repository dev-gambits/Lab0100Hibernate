package cl.sideralti.app.entities;

import cl.sideralti.app.enums.GenreType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Table(name = "authors") // authors_lab01
@Data
@AllArgsConstructor
@NoArgsConstructor
// @ToString
public class AuthorEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(length = 9)
    //      @Enumerated(EnumType.ORDINAL)
    //   @Column(columnDefinition = "TINYINT") //TINYINT   --  tinyint
    private GenreType genre;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Author{" + "id=" + id + ", age=" + age
                + ", name=" + name + ", genre=" + genre + '}' + "\n\r";
    }

}
