import ThreadingConcepts.BankRepo;
import ThreadingConcepts.FirstThread;
import ThreadingConcepts.SecocndThread;
import algorithms.Kadane;
import dsa.TreeHeight;
import graph.CourseSchedule;
import graph.TopologicalSort;

import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        CreateTable createTable = new CreateTable();
//        createTable.createDataBase();
//        createTable.createDb();
//        createTable.addRec();

//        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
//        Kadane kadane = new Kadane(a);
//        System.out.println(kadane.calculateMaxSubArray());
//
//        BankRepo bankRepo = new BankRepo();
//        FirstThread firstThread = new FirstThread(bankRepo);
//        SecocndThread secocndThread = new SecocndThread(bankRepo);
//        Thread thread = new Thread(firstThread);
//        Thread thread1 = new Thread(secocndThread);
//        thread.start();
//        thread1.start();
//        try {
//            thread.join();
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(bankRepo.getBalance("ACC1"));

//        TreeHeight treeHeight = new TreeHeight();
//        treeHeight.addNode(10);
//        treeHeight.addNode(9);
//        treeHeight.addNode(8);
//        treeHeight.addNode(11);
//        treeHeight.addNode(12);
//        treeHeight.addNode(13);
//        System.out.println(treeHeight.heightOfTree());
//
//        Pattern pattern = Pattern.compile("^([a-z][A-Z]){3}@$");
//        Matcher matcher = pattern.matcher("aAaAaA@");
//        System.out.println(matcher.matches());

        TopologicalSort topologicalSort = new TopologicalSort();
        topologicalSort.toposort();
        topologicalSort.getOutput();

        CourseSchedule courseSchedule = new CourseSchedule();
        System.out.println(courseSchedule.isFinishingCoursePossible());

    }
}
