package ohtu.data_access;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ohtu.domain.User;
import org.springframework.stereotype.Component;

public class FileUserDao implements UserDao {

    private final File usersFile;
    private List<User> users;

    public FileUserDao() {
        users = new ArrayList<User>();
        usersFile = new File("LoginCucumberUsers");
        try (BufferedReader br = new BufferedReader(new FileReader(usersFile))) {
            for (String line; (line = br.readLine()) != null;) {
                users.add(new User(line.substring(5), br.readLine().substring(5)));
            }
        } catch (IOException ex) {
        }
    }

    @Override
    public List<User> listAll() {
        return users;
    }

    @Override
    public User findByName(String name) {
        for (User user : users) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void add(User user) {
        users.add(user);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(usersFile));
            out.write("name:" + user.getUsername() + "\npass:" + user.getPassword() + "\n");
            out.close();
        } catch (IOException ex) {
        }
    }

}
