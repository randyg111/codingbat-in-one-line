public String doubleChar(String str) {
  return str.chars().mapToObj(c -> ""+(char) c + (char) c).collect(java.util.stream.Collectors.joining());
}
public int countHi(String str) {
  return str.length() - str.replace("hi", "h").length();
}
public boolean catDog(String str) {
  return str.length()-str.replaceAll("cat", "aa").length() == str.length()-str.replaceAll("dog", "aa").length();
}
public int countCode(String str) {
  return str.length() - str.replaceAll("co[a-z]e", "aaa").length();
}
public boolean endOther(String a, String b) {
  return a.length() < b.length() ? b.substring(b.length()-a.length()).equalsIgnoreCase(a) : a.substring(a.length()-b.length()).equalsIgnoreCase(b);
}
public boolean xyzThere(String str) {
  return str.replace(".x", "a").contains("xyz");
}
public boolean bobThere(String str) {
  return str.matches(".*b.b.*");
}
public boolean xyBalance(String str) {
  return !str.contains("x") || (str.contains("y") && !str.substring(str.lastIndexOf("y")).contains("x"));
}
public String mixString(String a, String b) {
  return a.length() > b.length() ? java.util.stream.IntStream.range(0, Math.min(a.length(), b.length())).mapToObj(i -> ""+a.charAt(i)+b.charAt(i)).collect(java.util.stream.Collectors.joining()) + a.substring(b.length()) : java.util.stream.IntStream.range(0, Math.min(a.length(), b.length())).mapToObj(i -> ""+a.charAt(i)+b.charAt(i)).collect(java.util.stream.Collectors.joining()) + b.substring(a.length());
}
public String repeatEnd(String str, int n) {
  return new String(new char[n]).replace("\0", str.substring(str.length()-n));
}
public String repeatFront(String str, int n) {
  return java.util.stream.IntStream.range(0, n).mapToObj(i -> str.substring(0, n-i)).collect(java.util.stream.Collectors.joining());
}
public String repeatSeparator(String word, String sep, int count) {
  return java.util.stream.IntStream.range(0, count).mapToObj(i -> i > 0 ? sep + word : word).collect(java.util.stream.Collectors.joining());
}
public boolean prefixAgain(String str, int n) {
  return str.lastIndexOf(str.substring(0, n)) != 0;
}
public boolean xyzMiddle(String str) {
  return str.length() >= 3 && (str.length() % 2 == 0 ? str.substring(str.length()/2-2, str.length()/2+1).equals("xyz") || str.substring(str.length()/2-1, str.length()/2+2).equals("xyz") : str.substring(str.length()/2-1, str.length()/2+2).equals("xyz"));
}
public String getSandwich(String str) {
  return str.indexOf("bread") == -1 || str.indexOf("bread") == str.lastIndexOf("bread") ? "" : str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")); 
}
public boolean sameStarChar(String str) {
  return java.util.stream.IntStream.range(1, str.length()-1).noneMatch(i -> str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1));
}
public String oneTwo(String str) {
  return str.length() < 3 ? "" : java.util.stream.IntStream.range(0, str.length()-2).filter(i -> i % 3 == 0).mapToObj(i -> str.substring(i+1, i+3) + str.charAt(i)).collect(java.util.stream.Collectors.joining());
}
public String zipZap(String str) {
  return str.replaceAll("z[a-z]p", "zp");
}
public String starOut(String str) {
  return java.util.stream.IntStream.range(0, str.length()).filter(i -> !(str.charAt(Math.max(0, i-1)) == '*' || str.charAt(i) == '*' || str.charAt(Math.min(str.length()-1, i+1)) == '*')).mapToObj(i -> String.valueOf(str.charAt(i))).collect(java.util.stream.Collectors.joining());
}
public String plusOut(String str, String word) {
  return word.matches("\\+*") ? new String(new char[str.length()]).replaceAll("\0", "+") : str.replaceAll(word, "~").replaceAll("[^~]", "+").replaceAll("~", word);
}
public String wordEnds(String str, String word) {
  return java.util.stream.IntStream.rangeClosed(0, str.length()-word.length()).filter(i -> str.substring(i, i+word.length()).equals(word)).mapToObj(i -> (i == 0 ? "" : str.substring(i-1, i)) + (i == str.length()-word.length() ? "" : str.charAt(i+word.length()))).collect(java.util.stream.Collectors.joining());
}
