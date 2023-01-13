package ro.tuc.ds2022.controllers.handlers;

import org.springframework.web.bind.annotation.*;
import ro.tuc.ds2022.controllers.handlers.dto.Devicedto;
import ro.tuc.ds2022.controllers.handlers.dto.MessageDto;
import ro.tuc.ds2022.entities.Device;

@RestController
@CrossOrigin(origins = "*",methods = { RequestMethod.GET ,RequestMethod.POST }, allowedHeaders = "*")
public class ChatController {

    @PostMapping("/sendChatMessage")
    public void postmethod4(@RequestBody MessageDto message) {





    }

    @PostMapping("/getChatMessages")
    public Device readMeesages(@PathVariable(value = "id") Long Id) {
        return null;

    }

}

