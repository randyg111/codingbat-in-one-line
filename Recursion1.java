public int factorial(int n) {
  return n == 0 ? 1 : factorial(n-1)*n;
}
public int bunnyEars(int bunnies) {
  return 2*bunnies;
}
public int fibonacci(int n) {
  return n == 0 ? 0 : n == 1 ? 1 : fibonacci(n-1)+fibonacci(n-2);
}
public int bunnyEars2(int bunnies) {
  return bunnies%2 == 0 ? bunnies/2*5 : bunnies/2*5+2;
}
public int triangle(int rows) {
  return rows*(rows+1)/2;
}
public int sumDigits(int n) {
  return n == 0 ? 0 : n%10+sumDigits(n/10);
}
public int count7(int n) {
  return n == 0 ? 0 : n%10 == 7 ? 1+count7(n/10) : count7(n/10);
}
public int count8(int n) {
  return n == 0 ? 0 : n%100 == 88 ? 2+count8(n/10) : n%10 == 8 ? 1+count8(n/10) : count8(n/10);
}
public int powerN(int base, int n) {
  return (int) Math.pow(base, n);
}
public int countX(String str) {
  return str.length() - str.replace("x", "").length();
}
public int countHi(String str) {
  return str.length() - str.replaceAll("hi", "h").length();
}
public String changeXY(String str) {
  return str.replaceAll("x", "y");
}
public String changePi(String str) {
  return str.replaceAll("pi", "3.14");
}
public String noX(String str) {
  return str.replaceAll("x", "");
}
public boolean array6(int[] nums, int index) {
  return index < nums.length && (nums[index] == 6 || array6(nums, index+1));
}
public int array11(int[] nums, int index) {
  return index >= nums.length ? 0 : nums[index] == 11 ? array11(nums, index+1)+1 : array11(nums, index+1);
}
public boolean array220(int[] nums, int index) {
  return index < nums.length - 1 && (nums[index]*10 == nums[index+1]  || array220(nums, index+1));
}
public String allStar(String str) {
  return str.length() <= 1 ? str : str.charAt(0)+""+'*'+allStar(str.substring(1));
}
public String pairStar(String str) {
  return str.length() == 0 || str.length() == 1 ? str : str.charAt(0) == str.charAt(1) ? str.charAt(0)+""+'*'+pairStar(str.substring(1)) : str.charAt(0)+pairStar(str.substring(1));
}
public String endX(String str) {
  return str.length() == 0 ? str : str.charAt(0) == 'x' ? endX(str.substring(1))+'x' : str.charAt(0)+endX(str.substring(1));
}
public int countPairs(String str) {
  return str.length() <= 2 ? 0 : str.charAt(0) == str.charAt(2) ? 1+countPairs(str.substring(1)) : countPairs(str.substring(1));
}
public int countAbc(String str) {
  return str.length() < 3 ? 0 : str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba") ? 1+countAbc(str.substring(1)) : countAbc(str.substring(1));
}
public int count11(String str) {
  return str.length() < 2 ? 0 : str.substring(0, 2).equals("11") ? 1+count11(str.substring(2)) : count11(str.substring(1));
}
public String stringClean(String str) {
  return str.length() < 2 ? str : str.charAt(0) == str.charAt(1) ? stringClean(str.substring(1)) : str.charAt(0) + stringClean(str.substring(1));
}
public int countHi2(String str) {
  return str.length() < 2 ? 0 : str.substring(0, 2).equals("hi") ? 1 + countHi2(str.substring(2)) : str.length() < 3 ? 0 : str.substring(0, 3).equals("xhi") ? countHi2(str.substring(3)) : str.substring(1, 3).equals("hi") ? 1 + countHi2(str.substring(3)) : countHi2(str.substring(1));
}
public String parenBit(String str) {
  return str.substring(str.indexOf("("), str.indexOf(")")+1);
}
public boolean nestParen(String str) {
  return str.length() == 0 || str.charAt(0) == '(' && str.charAt(str.length()-1) == ')' && nestParen(str.substring(1, str.length()-1));
}
public int strCount(String str, String sub) {
  return str.length() < sub.length() ? 0 : str.substring(0, sub.length()).equals(sub) ? 1 + strCount(str.substring(sub.length()), sub) : strCount(str.substring(1), sub);
}
public boolean strCopies(String str, String sub, int n) {
  return n == 0 || !(str.length() < sub.length()) && (str.substring(0, sub.length()).equals(sub) ? strCopies(str.substring(1), sub, n-1) : strCopies(str.substring(1), sub, n));
}
public int strDist(String str, String sub) {
  return str.length() < sub.length() ? 0 : str.startsWith(sub) && str.endsWith(sub) ? str.length() : str.startsWith(sub) ? strDist(str.substring(0, str.length()-1), sub) : strDist(str.substring(1), sub);
}
