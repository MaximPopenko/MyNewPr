package com.it.users;

import com.it.utils.Utils;

import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return new User(resourceBundle.getString("userName"),
                resourceBundle.getString("password"),
                resourceBundle.getString("email")
        );
    }

    public static User getRandomUser() {
        return new User(Utils.getRandomString(15),
        Utils.getRandomString(10),
                Utils.getRandomString(10) + "@mail.com"
        );
    }
    public static List<User> getRandomUsers (int count) {
        return Stream.generate(UserFactory::getRandomUser)
                .limit(count)
                .collect(Collectors.toList());
    }
}
