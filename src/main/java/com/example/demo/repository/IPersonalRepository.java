package com.example.demo.repository;

import com.example.demo.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonalRepository extends JpaRepository<Personal,Integer> {
    //@Procedure(value = "carcularNomina")

    @Query(value = "CALL carcularNomina(:personal,:mesin,:yearin);", nativeQuery = true)
    List<?> getNomina(@Param("personal") Integer personal,@Param("mesin") Integer mesin,@Param("yearin") Integer yearin);

}
