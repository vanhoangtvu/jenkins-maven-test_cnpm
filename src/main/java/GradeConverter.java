
package your.package.name;

/**
 * Provides grade conversion functionality.
 */
public final class GradeConverter {

    private static final int GRADE_A_MIN = 90;
    private static final int GRADE_B_MIN = 80;
    private static final int GRADE_C_MIN = 71;
    private static final int GRADE_D_MIN = 61;
    private static final int GRADE_E_MIN = 50;

    /**
     * Converts a numeric score to a letter grade.
     *
     * @param score the numeric score (0–100)
     * @return the letter grade
     */
    public static String convert(final int score) {
        if (score <= 100 && score >= GRADE_A_MIN) {
            return "A";
        } else if (score >= GRADE_B_MIN) {
            return "B";
        } else if (score >= GRADE_C_MIN) {
            return "C";
        } else if (score >= GRADE_D_MIN) {
            return "D";
        } else if (score >= GRADE_E_MIN) {
            return "E";
        } else {
            return "Invalid";
        }
    }
}
