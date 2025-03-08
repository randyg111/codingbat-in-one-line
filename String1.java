public String helloName(String name) {
  return "Hello " + name + "!";
}
public String makeAbba(String a, String b) {
  return a+b+b+a;
}
public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}
public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2, 4);
}
public String extraEnd(String str) {
  return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
}
public String firstTwo(String str) {
   return str.length() >= 2 ? str.substring(0, 2) : str;
}
public String firstHalf(String str) {
  return str.substring(0, str.length()/2);
}
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}
public String comboString(String a, String b) {
  return a.length() > b.length() ? b+a+b : a+b+a;
}
public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}
public String left2(String str) {
  return str.substring(2) + str.substring(0, 2);
}
public String right2(String str) {
  return str.substring(str.length()-2) + str.substring(0, str.length()-2);
}
public String theEnd(String str, boolean front) {
  return front ? str.substring(0, 1) : str.substring(str.length()-1);
}
public String withouEnd2(String str) {
  return str.length() < 2 ? "" : str.substring(1, str.length()-1);
}
public String middleTwo(String str) {
  return str.substring(str.length()/2-1, str.length()/2+1);
}
public boolean endsLy(String str) {
  return str.indexOf("ly") != -1 && str.indexOf("ly") == str.length()-2;
}
public String nTwice(String str, int n) {
  return str.substring(0, n) + str.substring(str.length()-n);
}
public String twoChar(String str, int index) {
  return index > str.length()-2 || index < 0 ? str.substring(0, 2) : str.substring(index, index+2);
}
public String middleThree(String str) {
  return str.substring(str.length()/2-1, str.length()/2+2);
}
public boolean hasBad(String str) {
  return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
}
public String atFirst(String str) {
  return str.length() == 0 ? "@@" : str.length() == 1 ? str + "@" : str.substring(0, 2);
}
public String lastChars(String a, String b) {
  return (a.length() == 0 ? "@" : a.substring(0, 1)) + (b.length() == 0 ? "@" : b.substring(b.length()-1));
}
public String conCat(String a, String b) {
  return a.length() == 0 ? b : b.length() == 0 ? a : a.charAt(a.length()-1) == b.charAt(0) ? a + b.substring(1) : a + b;
}
public String lastTwo(String str) {
  return str.length() < 2 ? str : str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
}
public String seeColor(String str) {
  return str.indexOf("red") == 0 ? "red" : str.indexOf("blue") == 0 ? "blue" : "";
}
public boolean frontAgain(String str) {
  return str.length() < 2 ? false : str.substring(0, 2).equals(str.substring(str.length()-2));
}
public String minCat(String a, String b) {
  return a.length() < b.length() ? a + b.substring(b.length()-a.length()) : a.substring(a.length()-b.length()) + b;
}
public String extraFront(String str) {
  return str.length() < 2 ? str.substring(0) + str.substring(0) + str.substring(0) : str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
}
public String without2(String str) {
  return str.length() < 2 ? str : str.substring(0, 2).equals(str.substring(str.length()-2)) ? str.substring(2) : str;
}
public String deFront(String str) {    
  return (str.charAt(0) == 'a' ? "a" : "") + (str.charAt(1) == 'b' ? "b" : "") + str.substring(2);
}
public String startWord(String str, String word) {
  return word.length() > str.length() ? "" : str.substring(1, word.length()).equals(word.substring(1)) ? str.substring(0, word.length()) : "";
}
public String withoutX(String str) {
  return str.length() < 2 ? "" : (str.charAt(0) == 'x' ? "" : str.substring(0, 1)) + str.substring(1, str.length()-1) + (str.charAt(str.length()-1) == 'x' ? "" : str.substring(str.length()-1));
}
public String withoutX2(String str) {
  return (str.length() < 1 ? "" : (str.charAt(0) == 'x' ? "" : str.substring(0, 1))) + (str.length() < 2 ? "" : (str.charAt(1) == 'x' ? "" : str.substring(1, 2)) + str.substring(2));
}
