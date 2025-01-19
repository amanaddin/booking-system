package booking.rest.dto;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import booking.models.User;

@Component
@Mapper(componentModel= "spring")
public interface UserDTOMapper {
    UserLimitedDTO limitedUser(User user);
    List<UserLimitedDTO> limitedUserList(List<User> userList);
}
