package by.overone.it.repository;


import by.overone.it.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RequestRepository extends JpaRepository <Request, String> {


}
