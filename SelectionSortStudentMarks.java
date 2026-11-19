
public class SelectionSortStudentMarks {
    public static void main(String[] args) {

        int[] marks = {75, 90, 45, 80, 60};

        for (int i = 0; i < marks.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < marks.length; j++) {

                if (marks[j] < marks[min]) {
                    min = j;
                }
            }

            int temp = marks[i];
            marks[i] = marks[min];
            marks[min] = temp;
        }

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
