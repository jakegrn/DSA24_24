import java.util.*;

public class JavaMapAndSetExercises {
    public static void main(String[] args) {
        Student Jake = new Student(4400740, "Jake", "Green");
        System.out.println("Hello and welcome! " + Jake.toString());

        //Creates new string treeset containing names which are case insensitive, without this the treeset will accept capitals and lowercase names which should be duplicates
        //Set<String> names = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        Set<Student> snames = new TreeSet<Student>(new Student.StudentNumberComparator());


        //Creates new string arraylist containing nameList
        List<Student> snameList = new ArrayList<>();

        //Fills namelist with 10 random names using a method from another class
        //RandomLists.generateStudentList(nameList, 10);
        //System.out.println("LIST:");

        RandomLists.generateStudentList(snameList, 10);
        snames.add(new Student(1000000,"John","Smith"));
        snames.add(new Student(1000001,"John","Smith"));

        System.out.println("LIST:");

        //calls on method we created after main
        printCollection(snameList);
        snames.addAll(snameList);
        System.out.println("SET:");
        printCollection( snames);

        System.out.println("SNameList:");
        printCollection(snameList);

//        snames.add(snameList.get(0).studentUpper());
//        System.out.println("SNameList: " + snameList.get(0));
//        snames.add(snameList.get(0));
//
//        printCollection( snames);




    }
    /**
     * Prints all items in the given Collection. The generic type is a “?”
     * so that this can be called with collections of ANY type.
     * System.out.println automatically calls the toString method of the
     * items in the collection. The Collection could be a List or Set.
     */
    public static void printCollection( Collection<?> items) {
        for( Object o : items) {
            System.out.println( o);
        }
        System.out.println( "--");
    }
}