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

    public CalculateStatistics() {
        this.statistics = statistics;
        this.usersCount = usersCount;
        this.postsAverage = postsAverage;
        this.commentsAverage = commentsAverage;
        this.commentsPerPostAverage = commentsPerPostAverage;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount1 = statistics.postsCount();
        if (usersCount != 0) {
            if (postsCount1 != 0) {
                postsAverage = statistics.postsCount() / this.usersCount;
                commentsAverage = statistics.commentsCount() / this.usersCount;
                commentsPerPostAverage = statistics.commentsCount() / statistics.postsCount();
            } else {
                postsAverage = statistics.postsCount() / this.usersCount;
                commentsAverage = statistics.commentsCount() / this.usersCount;
            }
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
