package com.educandoweb.Course.Repositories;

import com.educandoweb.Course.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User,Long> {
}
