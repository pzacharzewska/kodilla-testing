package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int userPostsNumber;

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getUserPostsNumber() {
        return userPostsNumber;
    }

    public ForumUser(final int userID, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int userPostsNumber) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.userPostsNumber = userPostsNumber;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", userPostsNumber=" + userPostsNumber +
                '}';
    }
}
