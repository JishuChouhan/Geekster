package com.example.Mail.Integration;

import jakarta.annotation.Nullable;
import org.eclipse.angus.mail.util.logging.MailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class MyController {
    @Autowired
    private MyObject myObject;
    public static SimpleMailMessage email;
    @GetMapping("objects")
    public String getObjects() {
        // Use the created objects
        String myObjectAsString = myObject.toString();

        // Send the objects as strings via email
        email.setSubject(myObjectAsString);
        MailHandler MailHandler = new MailHandler();

        MailHandler.setMailProperties(new Properties());
        return myObjectAsString;
    }
}
