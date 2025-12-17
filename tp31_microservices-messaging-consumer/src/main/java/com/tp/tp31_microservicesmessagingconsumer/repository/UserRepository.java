package com.tp.tp31_microservicesmessagingconsumer.repository;

import com.tp.tp31_microservicesmessagingconsumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}