package eu.intercars.resource;

import java.util.List;
import java.util.Random;

public class UserProviderLocalDataRandomTime implements UserProvider {

    @Override
    public List<UserResponse> getUsers() {
        try {
            int randomValue = new Random().nextInt(7) + 2;
            // random delay
            Thread.sleep(randomValue * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return List.of(
                new UserResponse("Kurtis Weissnat", "Elwyn.Skiles", "Telly.Hoeger@billy.biz"),
                new UserResponse("Leanne Graham", "Bret", "Sincere@april.biz"),
                new UserResponse("Mrs. Dennis Schulist", "Leopoldo_Corkery", "Karley_Dach@jasper.info"),
                new UserResponse("Patricia Lebsack", "Karianne", "Julianne.OConner@kory.org"),
                new UserResponse("Ervin Howell", "Antonette", "Shanna@melissa.tv"),
                new UserResponse("Glenna Reichert", "Delphine", "Chaim_McDermott@dana.io"),
                new UserResponse("Nicholas Runolfsdottir V", "Maxime_Nienow", "Sherwood@rosamond.me"),
                new UserResponse("Clementina DuBuque", "Moriah.Stanton", "Rey.Padberg@karina.biz"),
                new UserResponse("Chelsey Dietrich", "Kamren", "Lucio_Hettinger@annie.ca"),
                new UserResponse("Clementine Bauch", "Samantha", "Nathan@yesenia.net")


        );
    }
}
