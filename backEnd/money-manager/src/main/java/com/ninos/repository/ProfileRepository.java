package com.ninos.repository;

import com.ninos.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    // select * from tbl_profiles where email=?1
    Optional<ProfileEntity> findByEmail(String email);

    // @Query("SELECT p FROM ProfileEntity p WHERE p.activationToken = ?1")
    //or
    // @Query(value = "SELECT * FROM tbl_profiles WHERE activation_token = ?1", nativeQuery = true)
    Optional<ProfileEntity> findByActivationToken(String activationToken);

}
