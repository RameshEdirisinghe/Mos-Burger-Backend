package edu.icet.ecom.service.Impl;

import edu.icet.ecom.dto.Login;
import edu.icet.ecom.entity.LoginEntity;
import edu.icet.ecom.repository.LoginDao;
import edu.icet.ecom.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    final LoginDao loginDao;
    final ModelMapper modelMapper;

    @Override
    public boolean isValid(Login login) {
        List<LoginEntity> userList = loginDao.findByUser(login.getUser());
        if (userList!=null){
            for(LoginEntity loginEntity:userList) {
                if (login.getPassword().equals(loginEntity.getPassword())){
                    return true;
                }
            }
        }
        return false;
    }
}
