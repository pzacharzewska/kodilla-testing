package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;
    int usersCount;
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

    public double getCommentsPerPostAverage(){
        return commentsPerPostAverage;
    }

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        commentsAverage = statistics.commentsCount() / usersCount;
        postsAverage = statistics.postsCount() / usersCount;
        commentsPerPostAverage = statistics.commentsCount() / statistics.postsCount();
    }

    public void showStatistics(){
        System.out.println("Number of users: " + usersCount);
        System.out.println("Number of posts: " + statistics.postsCount());
        System.out.println("Number of comments: " + statistics.commentsCount());
        System.out.println("Average number of posts per user: " + postsAverage);
        System.out.println("Average number of comments per user: " + commentsAverage);
        System.out.println("Average number of comments per post: " + postsAverage);
        System.out.println("\nSecond way of presentation\n");
        System.out.println("Number of users: " + getUsersCount());
        System.out.println("Number of posts: " + statistics.postsCount());
        System.out.println("Number of comments: " + statistics.commentsCount());
        System.out.println("Average number of posts per user: " + getPostsAverage());
        System.out.println("Average number of comments per user: " + getCommentsAverage());
        System.out.println("Average number of comments per post: " + getCommentsPerPostAverage());

    }
}
