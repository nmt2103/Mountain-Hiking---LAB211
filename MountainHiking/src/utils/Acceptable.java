package utils;

public interface Acceptable {

  String STUDENT_ID_VALID = "^[Ss|Hh|Dd|Qq|Cc][Ee]\\d{6}$";
  String NAME_VALID = "^.{2,20}$";
  String PHONE_VALID = "^\\d{10}$";
  String EMAIL_VALID = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
  String MOUNTAIN_CODE_VALID = "^\\d$";

  /**
   * Check valid data
   *
   * @param data String to check
   * @param pattern Regex pattern
   * @return True if valid
   */
  static boolean isValid(String data, String pattern) {
    return data.matches(pattern);
  }
}
