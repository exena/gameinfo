package gameinfoweb.gameinfo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String originalName;

    @ManyToOne
    @JoinColumn(name="board_id", referencedColumnName = "id")
    @JsonIgnore
    private Board board;
}
