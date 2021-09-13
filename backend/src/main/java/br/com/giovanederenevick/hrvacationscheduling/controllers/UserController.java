package br.com.giovanederenevick.hrvacationscheduling.controllers;

import br.com.giovanederenevick.hrvacationscheduling.dto.UserDTO;
import br.com.giovanederenevick.hrvacationscheduling.entities.User;
import br.com.giovanederenevick.hrvacationscheduling.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<Page<UserDTO>> findAll(Pageable pageable) {

        Page<UserDTO> userPage = userService.findALl(pageable);

        return ResponseEntity.ok(userPage);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {

        UserDTO obj = userService.findById(id);

        return ResponseEntity.ok(obj);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody UserDTO newUserDTO) {

        User obj = userService.fromDTO(newUserDTO);

        obj = userService.insert(obj);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(obj.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }
}
