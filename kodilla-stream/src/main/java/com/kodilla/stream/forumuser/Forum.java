package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    public Forum() {
        userList.add(new ForumUser(1, "Anastazja Milczak", 'F', 1989, 1, 16, 30));
        userList.add(new ForumUser(2,"Bartosz Bartoszak", 'M', 2003, 6, 18, 15));
        userList.add(new ForumUser(3, "Zbigniew Zesta", 'M', 2000, 4, 1, 5));
        userList.add(new ForumUser(4, "Janek Henryk", 'M', 1997, 5, 29, 76 ));
        userList.add(new ForumUser(5, "Natalia Janeczek", 'F', 1988, 4, 15, 18));
        userList.add(new ForumUser(6, "Olga Filipczak", 'M', 2010, 12, 7, 3));
        userList.add(new ForumUser(7, "Bożena Kowalska", 'F', 2005, 10, 11, 17));
        userList.add(new ForumUser(8, "Antoni Bączek", 'M', 1996, 8, 28, 0));
        userList.add(new ForumUser(9, "Jarosław Tokarczuk", 'M', 1991, 10, 10, 44));
        userList.add(new ForumUser(10, "Magdalena Oligarska", 'F', 1994, 3, 22, 18));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }

}
