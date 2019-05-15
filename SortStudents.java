package CollectionsSortStudents;

// Example to show usage of Arraylist, HashSet, TreeSet


import java.util.*;

public class  SortStudents {

    public static void main(String args[]) {

        System.out.println("\n*** Show usage of ArrayList, HashSet and TreeSet through addAll method ***");
        System.out.println("-------------------------------------------------------------------------");

        String[] sarr = {"Vishal","Shashi","Vishal","Mahesh", "Umesh", "Smaran", "Shashi", "Yash", "Mahesh", "amith", "smaran", "Rahul", "Shashi", "Sudheep", "Yash", "Seema"};

        List<String> arrayListstudents = new ArrayList<>();
        Set<String> hashSetstudents = new HashSet<String>();
        Set<String> treeSetstudents = new TreeSet<String>();
        // Load all the Names into ArrayList studentset thru addall method
        System.out.println("\n Arraylist - All records are as is - through addAll method");
        arrayListstudents.addAll(Arrays.asList(sarr));
        System.out.println(arrayListstudents);

        System.out.println();

        // Load all the Names into HashSet studentset thru addall method
        System.out.println("\n Hashset - Duplicates removed but not sorted - through addAll method");
        hashSetstudents.addAll(Arrays.asList(sarr));
        System.out.println(hashSetstudents);

        System.out.println();

        // Load all the Names into Treeset studentset thru addall method
        System.out.println("\n Treeset - Duplicates removed and sorted  - through addAll method");
        treeSetstudents.addAll(Arrays.asList(sarr));
        System.out.println(treeSetstudents);

        System.out.println();

        System.out.println("\n*** Sorting ArrayList through collections sort and by loading into TreeSet ***");
        System.out.println("----------------------------------------------------------------------------");


        System.out.println();


        System.out.println("\nSorting  Arraylist by using collections.sort");
        Collections.sort(arrayListstudents);
        System.out.println(arrayListstudents);


        System.out.println();

        System.out.println("\n Arraylist shuffled by using collections.shuffle ");
        Collections.shuffle(arrayListstudents);
        System.out.println(arrayListstudents);

        System.out.println();

        // Use TreeSet to sort ArrayList we ca remove duplicates values and then sorted;

        Set<String> treesetstudents1 = new TreeSet<String>(arrayListstudents);
        System.out.println("\nLoad ArrayList into Tree Set constructor - it removes duplicates and sorts ");
        System.out.println(treesetstudents1);

        System.out.println();
        //using Hashset we can only remove the duplicates values but not sorted;

        Set<String> Hashsetstudents1 = new HashSet<String>(arrayListstudents);
        System.out.println("\nload ArrayList into Hashset constructor - it removes duplicates but doesn't sort ");
        System.out.println(Hashsetstudents1);
        Set<String> Hashsetstudents2=new HashSet<>(arrayListstudents);

        System.out.println();

        System.out.println("Welcome to sankir Techology Here the results of the students ");

        System.out.println("\n using array list its rempves dupilcates value and its returns value");
        System.out.println(Hashsetstudents2);

        System.out.println();

        List<String> HashtoArraystudents = new ArrayList<String>(Hashsetstudents1);
        System.out.println("\nLoaded hashset sorted by collections.sort after putting into List -Avoid this bad programming");
        Collections.sort(HashtoArraystudents);
        System.out.println(HashtoArraystudents);

        System.out.println();
//Tree set functions
        System.out.println("Using Tree set Function we have to sort and remove duplicates values");
        TreeSet<String> treeSetStudnts=new TreeSet<>(treeSetstudents);
        System.out.println("Student details are stored in the Treeset ");
        System.out.println(treeSetStudnts);

  }

}


