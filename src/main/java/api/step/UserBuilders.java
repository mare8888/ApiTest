package api.step;

import api.dto.request.UserRequest;

public class UserBuilders {

    public UserRequest userDefaultBuilder() {
        return UserRequest.builder()
                .userName("user12")
                .password("12345678Qa!")
                .build();
    }
}
