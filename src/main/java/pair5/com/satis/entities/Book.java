package pair5.com.satis.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="books")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

    public class Book {
        @Column(name = "id")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;


        @Column(name= "isbn")
        private int isbn;

        @Column(name = "book_name")
        private String name;

        @Column(name = "book_page")
        private int page;

        @Column(name = "price")
        private double price;

        @OneToMany(mappedBy = "book")
        private List<BookAuthor>bookAuthors;

        @OneToMany(mappedBy = "book")
        private List<BookCategory>bookCategories;

        @OneToMany(mappedBy = "book")
        private List<OrderDetail>orderDetails;

        @OneToMany(mappedBy = "book")
        private List <Order>orders;

        @ManyToOne
        @JoinColumn(name="publisher_id")
        private Publisher publisher;







}
