import java.util.Comparator;

public class Student implements Comparable<Student> {

    int id;
    String first;
    String last;

    public Student(int id, String first, String last) {
        this.id = id;
        this.first = first;
        this.last = last;
    }

    public String toString() {
        return this.id + " " + this.first + " " + this.last;
    }

    public int compareTo(Student other) {
        int lastCompare = this.last.compareTo(other.last);
        if ( lastCompare != 0) {
            return lastCompare;
        } else {
            return this.first.compareTo(other.first);
        }
    }
    public static class StudentNumberComparator implements Comparator<Student> {
        public int compare( Student s1, Student s2) {
            return s1.id - s2.id;
        }
    }
}
