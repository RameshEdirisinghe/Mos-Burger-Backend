package edu.icet.ecom.controller;

import edu.icet.ecom.dto.Login;
import edu.icet.ecom.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    final LoginService loginService;

    @GetMapping("/signin")
    public ResponseEntity<Boolean> login(@RequestBody Login login){
        return ResponseEntity.ok(loginService.isValid(login));
    }
}
