package by.overone.it.entity;


import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
@Getter
public class Request {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    @Setter
    private String author;
    @Setter
    private String authorId;
    @Setter
    private String message;
    @Setter
    private String requestName;
    @Setter
    private LocalDateTime createDate;


}
