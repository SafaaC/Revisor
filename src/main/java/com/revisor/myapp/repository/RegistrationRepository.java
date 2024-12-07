package com.revisor.myapp.repository;
import com.revisor.myapp.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findByEvent(Event Event);
    List<Registration> findByUser(User user);
}