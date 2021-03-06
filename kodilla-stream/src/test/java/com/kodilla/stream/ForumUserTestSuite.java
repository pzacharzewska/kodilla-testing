package com.kodilla.stream;

import com.kodilla.stream.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testGetLocationsOfFriends() {
        ForumUser user1 = new ForumUser("alan1", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "MyaBooth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);

        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);

        user7.addFriend(user1);
        user7.addFriend(user3);

        user10.addFriend(user1);

        user2.addFriend(user3);

        user9.addFriend(user3);

        Assert.assertEquals(3, user1.getLocationOfFriends().size());
        Assert.assertTrue(user1.getLocationOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationOfFriends().contains("Orlando"));

    }

    @Test
    public void testGetLocationsOfFriendsOfFriends() {
        ForumUser user1 = new ForumUser("alan1", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "MyaBooth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);

        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);

        user7.addFriend(user1);
        user7.addFriend(user3);

        user10.addFriend(user1);

        user2.addFriend(user3);

        user9.addFriend(user3);

        Assert.assertEquals(3, user1.getLocationOfFriendsOfFriends().size());
        Assert.assertTrue(user1.getLocationOfFriendsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationOfFriendsOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationOfFriendsOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationOfFriendsOfFriends().contains("Orlando"));
    }

}

