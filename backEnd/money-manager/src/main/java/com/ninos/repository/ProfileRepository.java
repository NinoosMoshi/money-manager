package com.ninos.repository;

import com.ninos.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    // select * from tbl_profiles where email=?1
    Optional<ProfileEntity> findByEmail(String email);

}
