package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    @Test

    public void testWhenPostsNumberIsZero(){

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        users.add("Paula");
        int postsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);

    }

    @Test
    public void testWhenPostsNumberIs1000(){

        Statistics statisticsmock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        users.add("Paula");
        int postsCount = 1000;
        when(statisticsmock.postsCount()).thenReturn(postsCount);
        when(statisticsmock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsmock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(200, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);
        System.out.println(calculateStatistics.getPostsAverage());
        System.out.println(postsCount);

    }

    @Test
    public void testWhenCommentsNumberIsZero(){

        Statistics statisticsmock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        users.add("Paula");
        int commentsCount = 0;
        when(statisticsmock.usersNames()).thenReturn(users);
        when(statisticsmock.commentsCount()).thenReturn(commentsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsmock);
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);
    }

    @Test
    public void testWhenCommentsIsLessThanPosts(){
        Statistics statisticsmock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        users.add("Paula");
        int postsCount = 20;
        int commentsCount = 10;
        when(statisticsmock.usersNames()).thenReturn(users);
        when(statisticsmock.commentsCount()).thenReturn(commentsCount);
        when(statisticsmock.postsCount()).thenReturn(postsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsmock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(4, resultPostsAverage, 0);
        Assert.assertEquals(2, resultCommentsAverage, 0);
        Assert.assertEquals(0.5, resultCommentsperPostsAverage, 0);

    }

    @Test
    public void testWhenCommentsIsMoreThanPosts(){
        Statistics statisticsmock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        users.add("Paula");
        int postsCount = 5;
        int commentsCount = 50;
        when(statisticsmock.usersNames()).thenReturn(users);
        when(statisticsmock.commentsCount()).thenReturn(commentsCount);
        when(statisticsmock.postsCount()).thenReturn(postsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsmock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(1, resultPostsAverage, 0);
        Assert.assertEquals(10, resultCommentsAverage, 0);
        Assert.assertEquals(10, resultCommentsperPostsAverage, 0);

    }

    @Test
    public void testWhenUsersNumberIs0(){
        Statistics statisticsmock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        when(statisticsmock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsmock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsperPostsAverage, 0);

    }

    @Test
    public void testWhenUsersNumberIs100(){
        Statistics statisticsmock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            users.add("User #" + i);
        }
        when(statisticsmock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsmock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsperPostsAverage, 0);

        System.out.println(users.size());

    }

}
