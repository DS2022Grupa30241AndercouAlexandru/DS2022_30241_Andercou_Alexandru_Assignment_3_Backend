package ro.tuc.ds2022.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.tuc.ds2022.entities.Device;
import ro.tuc.ds2022.entities.UserAccount;
import ro.tuc.ds2022.repositories.DeviceRepository;
import ro.tuc.ds2022.repositories.UserRepository;
import ro.tuc.ds2022.services.MappingService;

@Service


public class MappingServiceImplementation implements MappingService {
     @Autowired
    public UserRepository userRepository;

    @Autowired
    public DeviceRepository deviceRepository;


    public void addDeviceToUser(Long userId, Long deviceId) {
        UserAccount ua1= userRepository.findById(userId).get();
        {
            Device dev=deviceRepository.findById(deviceId).get();
            ua1.getDevices().add(dev);
            userRepository.save(ua1);
        }
    }
    public boolean deletedevice(Long ua, Long dev) {

        UserAccount ua1=null;
        try {
             ua1 = userRepository.findById(ua).get();



        }catch(Exception e) {
              return false;
        }

        if(deviceRepository.findById(dev).isPresent())
        {
            Device dev1 = deviceRepository.findById(dev).get();
            dev1.setOwner(null);
            deviceRepository.save(dev1);


            ua1.getDevices().removeIf(dev4->dev1.getId().equals(dev4.getId()));


            userRepository.save(ua1);
             return true;
        }
        return false;
    }

}
