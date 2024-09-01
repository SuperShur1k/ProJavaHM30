package de.telran.myshop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "users")
public class User {
    // добавьте колонки Long userId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    // чтобы генерировалась как IDENTITY

    // @Transient - если не хочу чтобы колонка создавалась в таблице базы данных
    private String password;
    private String login;

    // не является необходимым
//    @OneToOne(mappedBy = "user")
//    private UserDetail userDetail;

//    1. Для User добавьте репозитори и контроллер,
//    в контроллере добавьте методы для создания пользователя,
//    просмотра списка пользователей и
//    пользователя по его идентификатору


}
