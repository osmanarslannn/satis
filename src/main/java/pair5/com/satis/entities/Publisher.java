package pair5.com.satis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="publishers")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

        @Column(name = "id")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name="name")
        private String name;

        @OneToMany(mappedBy = "publisher")
        private List<Book>books;
}
