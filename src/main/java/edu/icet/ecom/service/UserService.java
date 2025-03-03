package edu.icet.ecom.service;

import edu.icet.ecom.dto.Login;

public interface LoginService {

    boolean isValid(Login login);
}
