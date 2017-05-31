package com.example.android.reportcard;

// This is a Report Card for a student that can be used by a school to keep track of the student data regarding the courses in which the student is enrolled and the grades for those courses, as well as to show the Final Result of all grades for the subjects studied by the student: PASS or NO PASS.

public class ReportCard {

    // This is a global constant that represents the number of subjects
    private int subjects = 7;

    // These are global constants that are used to show the Final Result for the student: PASS or NO PASS.
    public String PASS = "PASS";
    public String NO_PASS = "NO PASS";

    // This is a global constant that shows a default value when there is no assigned grade.
    public String NO_GRADE = "NO GRADE";

    // Constants for the grades - they define grades A, B, C, D and E and they are used to assign the grades to the subjects.
    public static final String GRADE_A = "Excellent";
    public static final String GRADE_B = "Great";
    public static final String GRADE_C = "Good";
    public static final String GRADE_D = "Satisfactory";
    public static final String GRADE_E = "Fail";

    // Variables

    // This is a variable for the student name
    private String studentName;

    // This is a variable for the student ID
    private int studentID;

    // This is a variable for the year of study for the student
    private int studentYear;

    // These are the grades for all subjects
    private String gradeProgramming;
    private String gradeMusic;
    private String gradeArts;
    private String gradeMathematics;
    private String gradeReligion;
    private String gradeGeography;
    private String gradeHistory;

    // This is the Final Result that takes into consideration the grades for all subjects
    private String finalResult;

    // This is the empty Constructor
    public ReportCard(){
    }

    // This is the Constructor for most of the variables. It creates a new Report Card object.
    //
    // @param studentName       The name of the student
    // @param studentID         The ID of the student
    // @param studentYear       The year of study for the student
    // @param gradeProgramming  The grade for Programming
    // @param gradeMathematics  The grade for Mathematics
    // @param gradeGeography    The grade for Geography
    // @param gradeReligion     The grade for Religion
    // @param gradeHistory      The grade for History
    // @param gradeMusic        The grade for Music
    // @param gradeArts         The grade for Arts
    //
    public ReportCard(String studentName, int studentID, int studentYear, String gradeProgramming, String gradeMathematics, String gradeGeography, String gradeReligion, String gradeHistory, String gradeMusic, String gradeArts) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentYear = studentYear;
        this.gradeProgramming = NO_GRADE;
        this.gradeMathematics = NO_GRADE;
        this.gradeGeography = NO_GRADE;
        this.gradeReligion = NO_GRADE;
        this.gradeHistory = NO_GRADE;
        this.gradeMusic = NO_GRADE;
        this.gradeArts = NO_GRADE;
    }

    // Getters

    // Get the name of the student
    public String getStudentName() {
        return studentName;
    }

    // Get the ID of the student
    public int getStudentID() {
        return studentID;
    }

    // Get the year of study for the student
    public int getStudentYear() {
        return studentYear;
    }

    // Get the grade for Programming
    public String getGradeProgramming() {
        return gradeProgramming;
    }

    // Get the grade for Mathematics
    public String getGradeMathematics() {
        return gradeMathematics;
    }

    // Get the grade for Geography
    public String getGradeGeography() {
        return gradeGeography;
    }

    // Get the grade for Religion
    public String getGradeReligion() {
        return gradeReligion;
    }

    // Get the grade for History
    public String getGradeHistory() {
        return gradeHistory;
    }

    // Get the grade for Music
    public String getGradeMusic() {
        return gradeMusic;
    }

    // Get the grade for Arts
    public String getGradeArts() {
        return gradeArts;
    }

    //Setters

    // Set the name of the student
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Set the ID of the student
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // Set the year of study for the student
    public void setStudentYear(int studentYear) {
        this.studentYear = studentYear;
    }

    // Set the grade for Programming
    public void setGradeProgramming(String gradeProgramming) {
        this.gradeProgramming = gradeProgramming;
    }

    // Set the grade for Mathematics
    public void setGradeMathematics(String gradeMathematics) {
        this.gradeMathematics = gradeMathematics;
    }

    // Set the grade for Geography
    public void setGradeGeography(String gradeGeography) {
        this.gradeGeography = gradeGeography;
    }

    // Set the grade for Religion
    public void setGradeReligion(String gradeReligion) {
        this.gradeReligion = gradeReligion;
    }

    // Set the grade for History
    public void setGradeHistory(String gradeHistory) {
        this.gradeHistory = gradeHistory;
    }

    // Set the grade for Music
    public void setGradeMusic(String gradeMusic) {
        this.gradeMusic = gradeMusic;
    }

    // Set the grade for Arts
    public void setGradeArts(String gradeArts) {
        this.gradeArts = gradeArts;
    }

    // This method calculates the Final Result for the student by using a for Loop.
    //
    // Create an Array of Strings to keep the grades for the 7 subjects
    // Loop through the Array of Strings and add value 1 to a count integer for any subject that has GRADE E.
    // Compare the count integer with a subjects integer that holds the number of subjects studied by the student by using if, else if statements.
    // If the count integer has a value lower than the value of the subjects integer divided by 2, the Final Result for the student is PASS. If the count integer has a value higher than the value of the subjects integer divided by 2, the Final Result for the student is NO PASS.
    // Return the Final Result.
    //
    public String getFinalResult() {

        // This is an Array of Strings that keeps the grades for the 7 subjects
        String[] subjectsGrades = {gradeProgramming, gradeMathematics, gradeGeography, gradeReligion, gradeHistory, gradeMusic, gradeArts};

        for (String grade : subjectsGrades) {

            // This is an integer used to calculate the Final Result: PASS or NO PASS for the student.
            int count = 0;

            if (grade.equals(GRADE_E)) {
                count++;
            }

            if (count >= subjects / 2) {
                finalResult = NO_PASS;

            } else if (count <= subjects / 2) {
                finalResult = PASS;
            }
        }
        return finalResult;
    }

    // Return the Report Card by using the toString method and a String Builder
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student Name: ");
        builder.append(studentName);
        builder.append("Student ID: ");
        builder.append(studentID);
        builder.append("Student Year: ");
        builder.append(studentYear);
        builder.append("Programming Grade: ");
        builder.append(gradeProgramming);
        builder.append("Mathematics Grade: ");
        builder.append(gradeMathematics);
        builder.append("Geography Grade: ");
        builder.append(gradeGeography);
        builder.append("Religion Grade: ");
        builder.append(gradeReligion);
        builder.append("History Grade: ");
        builder.append(gradeHistory);
        builder.append("Music Grade: ");
        builder.append(gradeMusic);
        builder.append("Arts Grade: ");
        builder.append(gradeArts);
        builder.append("Final Result: ");
        builder.append(finalResult);
        return builder.toString();
    }
}



