package com.hogiabao7725.financetracker.repository;

import com.hogiabao7725.financetracker.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Optional<Profile> findByEmail(String email);
    Optional<Profile> findByActivationToken(String activationToken);
}
