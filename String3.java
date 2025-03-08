public int countYZ(String str) {
  return (int) java.util.Arrays.stream(str.split("[^a-zA-Z]")).filter(s -> s.matches(".*[yYzZ]")).count();
}
public String withoutString(String base, String remove) {
  return base.replaceAll("(?i)" + remove, "");
}
public boolean equalIsNot(String str) {
  return (str.length()-str.replaceAll("is", "").length())/2 == (str.length()-str.replaceAll("not", "").length())/3;
}
public boolean gHappy(String str) {
  return !str.replaceAll("g{2,}", "").contains("g");
}
public int countTriple(String str) {
  return (int) java.util.stream.IntStream.rangeClosed(0, str.length()-3).mapToObj(i -> str.substring(i, i+3)).filter(s -> s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)).count();
}
public int sumDigits(String str) {
  return str.chars().filter(c -> Character.isDigit(c)).reduce(0, (a, b) -> (a + b - 48));
}
public String sameEnds(String string) {
  return string.substring(0, java.util.stream.IntStream.rangeClosed(0, string.length()/2).filter(i -> string.substring(0, i).equals(string.substring(string.length()-i))).max().getAsInt());
}
public String mirrorEnds(String s) {
  return s.substring(0, java.util.stream.IntStream.rangeClosed(0, s.length()).filter(i -> s.substring(0, i).equals(new StringBuilder(s.substring(s.length()-i)).reverse().toString())).max().getAsInt());
}
public int maxBlock(String str) {
  return java.util.stream.IntStream.range(0, (int) java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0), java.util.stream.IntStream.range(1, str.length()).filter(i -> str.charAt(i) != str.charAt(i-1))), java.util.stream.IntStream.of(str.length())).count() - 1).map(j -> java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0), java.util.stream.IntStream.range(1, str.length()).filter(i -> str.charAt(i) != str.charAt(i-1))), java.util.stream.IntStream.of(str.length())).toArray()[j+1] - java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0), java.util.stream.IntStream.range(1, str.length()).filter(i -> str.charAt(i) != str.charAt(i-1))), java.util.stream.IntStream.of(str.length())).toArray()[j]).max().getAsInt();
}
public int sumNumbers(String str) {
  return java.util.Arrays.stream(str.split("\\D+")).mapToInt(s -> s.length() > 0 ? Integer.parseInt(s) : 0).reduce(0, (a, b) -> (a + b));
}
public String notReplace(String str) {
  return str.replaceAll("\\bis\\b", "is not");
}
