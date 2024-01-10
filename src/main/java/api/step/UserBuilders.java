package api.step;

import api.dto.request.UserRequest;

public class UserBuilders {

    public UserRequest userDefaultBuilder() {
        return UserRequest.builder()
                .userName("Alex777")
                .password("Test123456!")
                .build();
    }
}
