package by.khmel.dealerstat.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "advert")
public class Advert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String text;

    private boolean status;

//    @Column(name = "user_id", insertable = false, updatable = false)
//    private Long userId;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_at")
    private String updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany
    @JoinTable(name = "advert_game",
    joinColumns = @JoinColumn(name = "advert_id"),
    inverseJoinColumns = @JoinColumn(name = "game_id"))
    private List<Game> games;
}
