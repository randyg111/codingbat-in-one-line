public boolean sleepIn(boolean weekday, boolean vacation) {
  return !weekday || vacation;
}
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return !aSmile^bSmile;
}
public int sumDouble(int a, int b) {
  return a == b ? 4*a : a+b;
}
public int diff21(int n) {
  return n <= 21 ? Math.abs(n-21) : 2 * Math.abs(n-21);
}
public boolean parrotTrouble(boolean talking, int hour) {
  return talking && (hour < 7 || hour > 20);
}
public boolean makes10(int a, int b) {
  return a == 10 || b == 10 || a+b == 10;
}
public boolean nearHundred(int n) {
  return Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10;
}
public boolean posNeg(int a, int b, boolean negative) {
  return negative ? a < 0 && b < 0 : a * b < 0;
}
public String notString(String str) {
  return str.indexOf("not") == 0 ? str : "not " + str;
}
public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1);
}
public String frontBack(String str) {
  return str.length() == 0 || str.length() == 1 ? str : str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
}
public String front3(String str) {
  return str.length() < 3 ? str + str + str : str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
}
public String backAround(String str) {
  return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
}
public boolean or35(int n) {
  return n % 3 == 0 || n % 5 == 0;
}
public String front22(String str) {
  return str.length() < 2 ? str + str + str : str.substring(0, 2) + str + str.substring(0, 2);
}
public boolean startHi(String str) {
  return str.indexOf("hi") == 0;
}
public boolean icyHot(int temp1, int temp2) {
  return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
}
public boolean in1020(int a, int b) {
  return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
}
public boolean hasTeen(int a, int b, int c) {
  return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
}
public boolean loneTeen(int a, int b) {
  return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
}
public String delDel(String str) {
  return str.indexOf("del") == 1 ? str.charAt(0) + str.substring(4) : str;
}
public boolean mixStart(String str) {
  return str.indexOf("ix") == 1;
}
public String startOz(String str) {
  return str.length() == 0 ? "" : str.indexOf("oz") == 0 ? "oz" : str.charAt(0) == 'o' ? "o" : str.charAt(1) == 'z' ? "z" : "";
}
public int intMax(int a, int b, int c) {
  return Math.max(Math.max(a, b), c);
}
public int close10(int a, int b) {
  return Math.abs(a-10) < Math.abs(b-10) ? a : Math.abs(a-10) > Math.abs(b-10) ? b : 0;
}
public boolean in3050(int a, int b) {
  return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
}
public int max1020(int a, int b) {
  return (a >= 10 && a <= 20 && b >= 10 && b <= 20) ? Math.max(a, b) : (a >= 10 && a <= 20) ? a : (b >= 10 && b <= 20) ? b : 0;
}
public boolean stringE(String str) {
  return str.matches("[^e]*[e][^e]*[e]?[^e]*[e]?[^e]*");
}
public boolean lastDigit(int a, int b) {
  return a%10 == b%10;
}
public String endUp(String str) {
  return str.length() < 3 ? str.toUpperCase() : str.substring(0, str.length()-3) + str.substring(str.length()-3).toUpperCase();
}
public String everyNth(String str, int n) {
  return java.util.stream.IntStream.range(0, str.length()).filter(i -> i % n == 0).mapToObj(i -> String.valueOf(str.charAt(i))).collect(java.util.stream.Collectors.joining());
}
