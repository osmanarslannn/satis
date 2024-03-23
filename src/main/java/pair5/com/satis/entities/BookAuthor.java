package pair5.com.satis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="book_authors")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookAuthor {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

   @ManyToOne
   @JoinColumn(name="book_id")
    private Book book;





}
