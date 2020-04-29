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
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsAverage, 0);
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
        double resultCommentsAverage = calculateStatistics.getCommentsAverage();
        double resultCommentsPerPostAverage = calculateStatistics.getCommentsPerPostAverage();

        Assert.assertEquals(200, resultPostsAverage, 0);
        Assert.assertEquals(0, resultCommentsAverage, 0);
        Assert.assertEquals(0, resultCommentsPerPostAverage, 0);

    }

}
