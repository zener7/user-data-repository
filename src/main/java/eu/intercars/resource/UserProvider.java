package eu.intercars.resource;

import java.util.List;

public interface UserProvider {
    List<UserResponse> getUsers();
}
