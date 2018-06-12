package ChapterFive;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student s = new Student(); //Student[5]
        int x = 0;
        while (x < 5) {
            // try a for loop next

            s.getGrade(s.examScore[x]);
            System.out.print(s.nameArray[x] + " " + s.examScore[x] + " ");
            System.out.println(s.gradeLetter);
            x++;
        }

    }
}
