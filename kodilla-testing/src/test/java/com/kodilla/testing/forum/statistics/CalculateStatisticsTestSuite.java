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
        int postsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);

    }

    @Test
    public void testWhenPostsNumberIs1000(){

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        int postsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(200, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);
        System.out.println(calculateStatistics.getPostsAverage());
        System.out.println(postsCount);

    }

    @Test
    public void testWhenCommentsNumberIsZero(){

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        int commentsCount = 0;
        int postsCount = 12;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);
    }

    @Test
    public void testWhenCommentsIsLessThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        int postsCount = 20;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsPerPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(4, resultPostsAverage, 0);
        Assert.assertEquals(2, resultCommentsAverage, 0);
        Assert.assertEquals(0.5, resultCommentsPerPostsAverage, 0);
        System.out.println(calculateStatistics.getCommentsPerPostAverage());
        System.out.println(statisticsMock.commentsCount());
        System.out.println(statisticsMock.postsCount());

    }

    @Test
    public void testWhenCommentsIsMoreThanPosts(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        users.add("Kamila");
        users.add("Piotr");
        users.add("Izabela");
        users.add("Ewelina");
        users.add("Adam");
        int postsCount = 5;
        int commentsCount = 50;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(1, resultPostsAverage, 0);
        Assert.assertEquals(10, resultCommentsAverage, 0);
        Assert.assertEquals(10, resultCommentsperPostsAverage, 0);
        System.out.println(calculateStatistics.getPostsAverage());
        System.out.println(calculateStatistics.getCommentsAverage());
        System.out.println(calculateStatistics.getCommentsPerPostAverage());

    }

    @Test
    public void testWhenUsersNumberIs0(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsperPostsAverage, 0);

    }

    @Test
    public void testWhenUsersNumberIs100(){
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++){
            users.add("User #" + i);
        }
        int postsCount = 72;
        int commentsCount = 150;
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double resultPostsAverage = calculateStatistics.getPostsAverage();
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsperPostsAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0.72, resultPostsAverage, 0);
        Assert.assertEquals(1.5, resultCommentsAverage, 0);
        Assert.assertEquals(2.08, resultCommentsperPostsAverage, 0.01);

        System.out.println(users.size());

    }

}
