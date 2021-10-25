package uz.sadirbaev.template.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.sadirbaev.template.entity.Test;
import uz.sadirbaev.template.repository.TestRepository;
import uz.sadirbaev.template.service.TestService;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private final TestRepository repo;

    @Autowired
    public TestServiceImpl(TestRepository repo) {
        this.repo = repo;
    }

    @Override
    public ResponseEntity<List<Test>> getAll() {
        return ResponseEntity.ok(repo.findAll());
    }
}
