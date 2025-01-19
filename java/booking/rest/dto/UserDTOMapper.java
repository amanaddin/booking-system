package booking.rest.dto;

import java.util.List;

import org.mapstruct.Mapper;

import booking.models.User;

@Mapper(componentModel= "spring")
public interface UserDTOMapper {
    UserLimitedDTO limitedUser(User user);
    List<UserLimitedDTO> limitedUserList(List<User> userList);
}
