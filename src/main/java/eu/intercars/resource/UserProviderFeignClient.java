package eu.intercars.resource;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(
        name = "userProvider",
        url = "https://fakestoreapiserver.reactbd.com",
        configuration = FeignConfig.class)
public interface UserProviderFeignClient extends UserProvider {

    @GetMapping(value = "/users",
            produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    List<UserResponse> getUsers();
}
