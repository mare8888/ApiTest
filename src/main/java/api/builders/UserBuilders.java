package api.builders;

import api.dto.request.UserDto;

public class UserBuilders {

    public UserDto userDefaultBuilder() {
        return UserDto.builder()
                .userName("Alex000")
                .password("Test123456!")
                .build();
    }
}
