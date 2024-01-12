package api.step;

import api.config.Requests;
import api.dto.response.get.GetUserDto;
import api.endpoints.UserEndpoints;

import static api.config.RequestService.requestWithToken;
import static api.config.ResponseService.ok;

public class UserSteps {

    Requests requests = new Requests();

    public GetUserDto getUser() {
        return requests.get(requestWithToken(),
                UserEndpoints.GET_USER.getEndpoints() + "eb26862b-3eda-4d3d-9da6-bfe4c4f8e764").then().spec(ok())
                .extract().body().as(GetUserDto.class);
    }

}
