package week1.variables;

public class YourSchedule {
    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        System.out.println("+" + "-".repeat(50) + "+");
        printCourseAndTeacher(1, course1, teacher1);
        printCourseAndTeacher(2, course2, teacher2);
        printCourseAndTeacher(3, course3, teacher3);
        printCourseAndTeacher(4, course4, teacher4);
        printCourseAndTeacher(5, course5, teacher5);
        printCourseAndTeacher(6, course6, teacher6);
        printCourseAndTeacher(7, course7, teacher7);
        printCourseAndTeacher(8, course8, teacher8);
        System.out.println("+" + "-".repeat(50) + "+");

    }

    private static void printCourseAndTeacher(int number, String course, String teacher) {
        String truncatedCourse = truncate(course, 26);
        String truncatedteacher = truncate(teacher, 15);
        String paddingBeforeCourse = " ".repeat(26 - truncatedCourse.length());
        String paddingBeforeTeacher = " ".repeat(15 - truncatedteacher.length());

        System.out.println(String.format("| %d | %s%s | %s%s |", number, paddingBeforeCourse, truncatedCourse,
                paddingBeforeTeacher, truncatedteacher));
    }

    private static String truncate(String text, int length) {
        String truncated = text.substring(0, Math.min(text.length(), length));

        if (truncated.length() != text.length()) {
            return truncated.substring(0, truncated.length() - 3) + "...";
        }

        return truncated;
    }
}
