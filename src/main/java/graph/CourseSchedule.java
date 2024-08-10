package graph;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    int[][] a;

    List<List<Integer>> list;
    public CourseSchedule() {
        list = new ArrayList<>();
        int size = 4;
        a = new int[][]{{1,0},{1,2},{2,3},{0,3},{3,1}};
    }

    public boolean isFinishingCoursePossible() {
      for (int i=0;i<4;i++)
      {
          list.add(new ArrayList<>());
      }
      for (int i=0;i<a.length;i++) {
          list.get(a[i][1]).add(a[i][0]);
      }
      for (int i=0;i<4;i++) {
          System.out.println(list.get(i));
          if (list.get(i).isEmpty())
              return true;
      }
      return false;
    }
}
