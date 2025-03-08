public String stringTimes(String str, int n) {
  return new String(new char[n]).replaceAll((char)0+"", str);
}
public String frontTimes(String str, int n) {
  return new String(new char[n]).replaceAll((char)0+"", str.substring(0, Math.min(3, str.length())));
}
int countXX(String str) {
  return (int) java.util.stream.IntStream.range(0, str.length()-1).mapToObj(i -> str.substring(i, i+2)).filter(s -> s.equals("xx")).count();
}
boolean doubleX(String str) {
  return str.indexOf("x") != str.lastIndexOf("x") && str.charAt(str.indexOf("x")+1) == 'x';
}
public String stringBits(String str) {
  return java.util.stream.IntStream.range(0, str.length()).filter(i -> i % 2 == 0).mapToObj(i -> String.valueOf(str.charAt(i))).collect(java.util.stream.Collectors.joining());
}
public String stringSplosion(String str) {
  return java.util.stream.IntStream.rangeClosed(0, str.length()).mapToObj(i -> str.substring(0, i)).collect(java.util.stream.Collectors.joining());
}
public int last2(String str) {
  return (int) java.util.stream.IntStream.range(0, str.length()-2).mapToObj(i -> str.substring(i, i+2)).filter(s -> s.equals(str.substring(str.length()-2))).count();
}
public int arrayCount9(int[] nums) {
  return (int) java.util.Arrays.stream(nums).filter(i -> i == 9).count();
}
public boolean arrayFront9(int[] nums) {
  return nums.length == 0 ? false : nums.length == 1 ? nums[0] == 9 : nums.length == 2 ? nums[0] == 9 || nums[1] == 9 : nums.length == 3 ? nums[0] == 9 || nums[1] == 9 || nums[2] == 9 : nums[0] == 9 || nums[1] == 9 || nums[2] == 9 || nums[3] == 9;
}
public boolean array123(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length-2).mapToObj(i -> (""+nums[i]+nums[i+1]+nums[i+2])).anyMatch(s -> s.equals("123"));
}
public int stringMatch(String a, String b) {
  return (int) java.util.stream.IntStream.range(0, Math.min(a.length(), b.length())-1).filter(i -> a.substring(i, i+2).equals(b.substring(i, i+2))).count();
}
public String stringX(String str) {
  return str.length() <= 2 ? str : str.charAt(0) + str.substring(1, str.length()-1).replaceAll("x", "") + str.charAt(str.length()-1);
}
public String altPairs(String str) {
  return java.util.stream.IntStream.range(0, str.length()).filter(i -> i % 4 == 0 || i % 4 == 1).mapToObj(i -> String.valueOf(str.charAt(i))).collect(java.util.stream.Collectors.joining());
}
public String stringYak(String str) {
  return str.replace("yak", "");
}
public int array667(int[] nums) {
  return (int) java.util.stream.IntStream.range(0, nums.length-1).filter(i -> nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)).count();
}
public boolean noTriples(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length-2).noneMatch(i -> nums[i] == nums[i+1] && nums[i+1] == nums[i+2]);
}
public boolean has271(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length-2).anyMatch(i -> nums[i] + 5 == nums[i+1] && Math.abs(nums[i] - 1 - nums[i+2]) <= 2);
}
