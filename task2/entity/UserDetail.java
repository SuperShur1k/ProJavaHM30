package de.telran.myshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "details")
@Getter
@Setter
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userDetailId;

    private String email;
    private Date dob;
    private String tel;

    @OneToOne
    @JoinColumn(
        name = "user_id", // название колонки внешнего ключа
        referencedColumnName = "userId" // колонка в таблице users
    )
    private User user;

//    2. Для UserDetail добавьте репозитори и контроллер, в контроллере добавьте методы для создания UserDetail для  пользователя с выбранным идентификатором, просмотра UserDetail по идентификатору.
}
