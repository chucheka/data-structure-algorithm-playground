package com.patterns.merged_intervals;

import java.util.*;

public class MergedIntervals {


    /*

        Given an array of meeting time intervals consisting of start and end times[[s1,e1],[s2,e2],...] where si< ei,
        determine if a person could attend all meetings.

        Example 1

        Input: [[0,30],[5,10],[15,20]]
        Output:false

        Example 2

        Input : [[7,10],[2,4]]
        Output:true
     */


    // A person can attend all meetings if the time don't overlap
    public static boolean meeting_room(Interval[] intervals) {

        if (intervals.length < 1) return false;

        if (intervals.length == 1) return true;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));


        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i].start <= intervals[i - 1].end) return false;
        }

        return true;

    }


    /*

        Given an array of meeting time intervals consisting of start and end times[[s1,e1],[s2,e2],...](si< ei),
        find the minimum number of conference rooms required.

        Example 1

        Input: [[0,30],[5,10],[15,20]]
        Output:2

        Example 2

        Input : [[7,10],[2,4]]
        Output:1
     */

    public static int findMinimumMeetingRooms(List<Interval> intervals) {

        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }

        // Sort the list of meeting intervals by start time
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        int minRooms = 0;

        Queue<Interval> minHeap = new PriorityQueue<>(intervals.size(), (a, b) -> Integer.compare(a.end, b.end));

        for (Interval interval : intervals) {

            // Remove all the meetings that have ended. The heap should only contain active meetings
            while (!minHeap.isEmpty() && interval.start >= minHeap.peek().end)
                minHeap.poll();

            // add the new meeting
            minHeap.offer(interval);

            // remember the last maximum number of meeting rooms encountered so far
            // ie if we had needed two rooms at a point and one of them ended just when we're about to start
            // a new one, doesn't mean that the value of minHeap.size() is the needed number of rooms
            minRooms = Math.max(minRooms, minHeap.size());


        }
        return minRooms;
    }

    public static List<Interval> merge(List<Interval> intervals) {


        if (intervals.size() < 2) {
            return intervals;
        }

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        List<Interval> mergedIntervals = new LinkedList<>();

        Iterator<Interval> intervalItr = intervals.iterator();

        Interval interval = intervalItr.next();

        int start = interval.start;
        int end = interval.end;

        while (intervalItr.hasNext()) {

            interval = intervalItr.next();

            if (interval.start <= end) {
                end = Math.max(interval.end, end);
            } else {
                mergedIntervals.add(new Interval(start, end));

                start = interval.start;
                end = interval.end;
            }
        }
        mergedIntervals.add(new Interval(start, end));

        return mergedIntervals;

    }

    public static void main(String[] args) {

        List<Interval> input = new ArrayList<>();

//        input.add(new Interval(0, 30));
//        input.add(new Interval(5, 10));
//        input.add(new Interval(15, 20));

        input.add(new Interval(7, 10));
        input.add(new Interval(2, 4));

//        System.out.println(meeting_room(input.toArray(new Interval[0])));
        System.out.println("THE MINIMUM NUMBER OF MEETING ROOMS " + findMinimumMeetingRooms(input));

        System.out.print("Merged intervals: ");

        for (Interval interval : merge(input))
            System.out.print("[" + interval.start + "," + interval.end + "] ");

    }

}
