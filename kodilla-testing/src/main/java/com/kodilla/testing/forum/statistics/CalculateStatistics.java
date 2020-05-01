package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;
    int usersCount;
    int postsCount1;
    double postsAverage;
    double commentsAverage;
    double commentsPerPostAverage;

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public double getPostsAverage() {
        return postsAverage;
    }

    public double getCommentsAverage() {
        return commentsAverage;
    }

    public double getCommentsPerPostAverage() {
        return commentsPerPostAverage;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount1 = statistics.postsCount();
        if (usersCount != 0) {
            postsAverage = statistics.postsCount() / (double) usersCount;
            commentsAverage = statistics.commentsCount() / (double) usersCount;
        }
        if (postsCount1 != 0) {
            commentsPerPostAverage = statistics.commentsCount() / (double) statistics.postsCount();
        }
    }

    public void showStatistics(){
        System.out.println("Number of users: " + getUsersCount());
        System.out.println("Number of posts: " + statistics.postsCount());
        System.out.println("Number of comments: " + statistics.commentsCount());
        System.out.println("Average number of posts per user: " + getPostsAverage());
        System.out.println("Average number of comments per user: " + getCommentsAverage());
        System.out.println("Average number of comments per post: " + getCommentsPerPostAverage());
    }
}
