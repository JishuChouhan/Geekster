package com.example.Mail.Integration;

import org.eclipse.angus.mail.util.logging.MailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyObject myObject;
    public static Sub email;
    @GetMapping("objects")
    public String getObjects() {
        // Use the created objects
        String myObjectAsString = myObject.toString();

        // Send the objects as strings via email
        email.setsub(myObjectAsString);
        MailHandler MailHandler = new MailHandler();

        MailHandler.sendmail();
        return myObjectAsString;
    }
}
