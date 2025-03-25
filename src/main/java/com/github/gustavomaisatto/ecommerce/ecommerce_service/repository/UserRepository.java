package com.github.gustavomaisatto.ecommerce.ecommerce_service.repository;

import com.github.gustavomaisatto.ecommerce.ecommerce_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
