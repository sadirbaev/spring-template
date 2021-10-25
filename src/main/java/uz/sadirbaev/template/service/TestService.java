package uz.sadirbaev.template.service;


import org.springframework.http.ResponseEntity;
import uz.sadirbaev.template.entity.Test;

import java.util.List;

public interface TestService {

    ResponseEntity<List<Test>> getAll();

}
