package entities;

import com.toddway.shelf.ShelfItem;
import net.dv8tion.jda.core.entities.User;
import settings.Database;

import java.util.ArrayList;

public class UserSets {
    private User user;
    private String path;

    public UserSets(User user, String path) {
        this.user = user;
        this.path = path;
    }
    private ShelfItem item(String key) {
        return Database.shelf.item(path + key);
    }


    private void setFavsongs(ArrayList<String> favsongs) {
        item("favsongs").put(favsongs);
    }
    private ArrayList<String> getFavsongs() {
        if (item("FAVSONGS").exists()) {
            return (ArrayList<String>) item("FAVSONGS").get(ArrayList.class);
        }
        return new ArrayList<String>();
    }
}
