package by.khmel.dealerstat.controller;

import by.khmel.dealerstat.entity.PasswordResetToken;
import by.khmel.dealerstat.entity.User;
import by.khmel.dealerstat.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PasswordController {

    private PasswordService passwordService;


    @Autowired
    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping("/auth/forgot_password")
    public ResponseEntity<User> forgotPassword(@RequestBody User user) {
        if (passwordService.resetPassword(user)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    @PostMapping("/auth/reset")
    public ResponseEntity<PasswordResetToken> updatePassword(@RequestBody PasswordResetToken passwordResetToken) {
        if (passwordService.updatePassword(passwordResetToken)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
