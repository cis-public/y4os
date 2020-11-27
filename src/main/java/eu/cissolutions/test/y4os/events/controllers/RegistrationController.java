package eu.cissolutions.test.y4os.events.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public final class RegistrationController {

    @PostMapping("/register-for-event")
    public void registerForEvent(@RequestParam(required = false) Long id) {
        if (id == null || id != 0) {
            throw new RuntimeException("No ID provided!");
        }
        // Event suchen

        // Customer suchen

        // Customer für Event registrieren
    }
}
