package api.step;

import api.builders.UserBuilders;
import api.config.Requests;
import api.dto.response.UserDto;
import api.dto.response.get.DeleteUserDto;
import api.dto.response.get.GetEmptyUser;
import api.dto.response.get.GetUserDto;
import api.endpoints.UserEndpoints;
import static api.config.RequestService.request;
import static api.config.ResponseService.empty;
import static api.config.ResponseService.ok;


public class UserSteps {

    Requests requests = new Requests();

    public UserDto createUser() {
        return requests.post((new UserBuilders().userDefaultBuilder()),
                        UserEndpoints.USER_ADD.getEndpoints()).then().spec(ok())
                .extract().body().as(UserDto.class);
    }

    public GetUserDto getUser() {
        return requests.get(request(),
                        UserEndpoints.GET_USER.getEndpoints() + "Test888").then().spec(ok())
                .extract().body().as(GetUserDto.class);
    }
    public GetEmptyUser getEmptyUser() {
        return requests.get(request(),
                        UserEndpoints.GET_USER.getEndpoints() + "Test888").then().spec(empty())
                .extract().body().as(GetEmptyUser.class);
    }


    public DeleteUserDto deleteUser() {
        return requests.delete(request(),
                        UserEndpoints.DELETE_USER.getEndpoints() + "Test888").then().spec(ok())
                .extract().body().as(DeleteUserDto.class);
    }

    public io.restassured.response.ResponseBodyExtractionOptions deleteEmptyUser() {
        return requests.delete(request(),
                        UserEndpoints.DELETE_USER.getEndpoints() + "Test888").then().spec(empty())
                .extract().body();
    }
}
