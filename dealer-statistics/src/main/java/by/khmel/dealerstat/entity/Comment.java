package by.khmel.dealerstat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Long userId;

    private int mark;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "approved")
    private boolean isApproved;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
