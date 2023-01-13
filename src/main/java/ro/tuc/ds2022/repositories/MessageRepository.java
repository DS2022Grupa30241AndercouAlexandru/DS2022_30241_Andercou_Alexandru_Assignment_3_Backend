package ro.tuc.ds2022.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.tuc.ds2022.entities.Message;
import ro.tuc.ds2022.entities.Role;
import ro.tuc.ds2022.entities.UserAccount;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
         Iterable<Message> findAllByFromAndTo(UserAccount from, UserAccount to);
         Iterable<Message> findAllByFromAndToAndType(UserAccount from, UserAccount to,String type);
}
