package collection.Queue.PriorityQueue;

import java.util.*;

class ProjectInfo5 {

    String pName = null;
    int teamCount = 0;
    int duration = 0;
    ProjectInfo5(String pName, int teamCount, int duration) {

            this.pName = pName;
            this.teamCount = teamCount;
            this.duration = duration;
    }

    public String toString() {

        return "{ Project Name: " + pName + ", Team Count: " + teamCount + ", Duration :" + duration + "\n}";
    }
}

class SortedByDuration implements Comparator {

	public int compare(Object obj1, Object obj2) {
		
		return (((ProjectInfo5)obj1).duration) - (((ProjectInfo5)obj2).duration);
	}
}

class Main5 {

    public static void main(String[] args) {

        PriorityQueue que = new PriorityQueue(new SortedByDuration());

        que.offer(new ProjectInfo5("InstagramClone", 4, 8));
        que.offer(new ProjectInfo5("QuizApp", 2, 5));
        que.offer(new ProjectInfo5("EcommerceWebSite", 8, 15));
        que.offer(new ProjectInfo5("WebBrowser", 3, 6));

        System.out.println(que);
    }
}
