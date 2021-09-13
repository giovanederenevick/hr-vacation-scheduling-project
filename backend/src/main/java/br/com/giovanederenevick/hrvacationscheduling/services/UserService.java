package br.com.giovanederenevick.hrvacationscheduling.services;

import br.com.giovanederenevick.hrvacationscheduling.dto.UserDTO;
import br.com.giovanederenevick.hrvacationscheduling.entities.User;
import br.com.giovanederenevick.hrvacationscheduling.repositories.UserPeriodRepository;
import br.com.giovanederenevick.hrvacationscheduling.repositories.UserRepository;
import br.com.giovanederenevick.hrvacationscheduling.repositories.VacationDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPeriodRepository userPeriodRepository;


    @Transactional(readOnly = true)
    public Page<UserDTO> findALl(Pageable pageable) {

        userPeriodRepository.findAll();

        Page<User> list = userRepository.findAll(pageable);

        return list.map(UserDTO::new);
    }

    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {

        User user = userRepository.findById(id).get();

        UserDTO userDTO = new UserDTO(user);

        return userDTO;
    }

    public User fromDTO(UserDTO newUserDTO) {

        User user = new User(newUserDTO);

        return user;
    }

    public User insert(User obj) {

        obj.setId(null);
        obj = userRepository.save(obj);

        return obj;
    }
}
