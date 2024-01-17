package api.builders;

import api.dto.request.UserDto;

public class UserBuilders {

    public UserDto userDefaultBuilder() {
        return UserDto.builder()
                .username("Test888")
                .build();
    }
}
