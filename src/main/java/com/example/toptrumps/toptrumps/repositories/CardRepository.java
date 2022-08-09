package com.example.toptrumps.toptrumps.repositories;

import com.example.toptrumps.toptrumps.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
