package jwd.pos.features.auth.service;


import jakarta.transaction.Transactional;
import jwd.pos.features.auth.repository.AuthRepo;
import jwd.pos.features.auth.repository.Impl.AuthRepoImpl;
import jwd.pos.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AuthService {


    @Autowired
    private AuthRepoImpl authRepo;



    public User findUserByNameUser(String username) {
     return    authRepo.findUserByName(username);
    }
}
