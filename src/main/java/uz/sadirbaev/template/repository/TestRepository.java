package uz.sadirbaev.template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.sadirbaev.template.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
}
