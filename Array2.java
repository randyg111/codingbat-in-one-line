public int countEvens(int[] nums) {
  return (int) java.util.Arrays.stream(nums).filter(i -> i % 2 == 0).count();
}
public int bigDiff(int[] nums) {
  return java.util.Arrays.stream(nums).max().getAsInt() - java.util.Arrays.stream(nums).min().getAsInt();
}
public int centeredAverage(int[] nums) {
  return (java.util.Arrays.stream(nums).sum() - java.util.Arrays.stream(nums).max().getAsInt() - java.util.Arrays.stream(nums).min().getAsInt())/(nums.length - 2);
}
public int sum13(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] != 13 && (i == 0 || nums[i-1] != 13)).map(i -> nums[i]).sum();
}
public int sum67(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] != 6 && (i == 0 || java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).subList(0, i).lastIndexOf(7) >= java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).subList(0, i).lastIndexOf(6))).map(i -> nums[i]).sum();
}
public boolean has22(int[] nums) {
  return java.util.stream.IntStream.range(1, nums.length).anyMatch(i -> nums[i-1] == nums[i] && nums[i] == 2);
}
public boolean lucky13(int[] nums) {
  return java.util.Arrays.stream(nums).noneMatch(i -> i == 3 || i == 1);
}
public boolean sum28(int[] nums) {
  return java.util.Arrays.stream(nums).filter(i -> i == 2).sum() == 8;
}
public boolean more14(int[] nums) {
  return java.util.Arrays.stream(nums).filter(i -> i == 1).count() > java.util.Arrays.stream(nums).filter(i -> i == 4).count();
}
public int[] fizzArray(int n) {
  return java.util.stream.IntStream.range(0, n).toArray();
}
public boolean only14(int[] nums) {
  return java.util.Arrays.stream(nums).allMatch(i -> i == 1 || i == 4);
}
public String[] fizzArray2(int n) {
  return java.util.stream.IntStream.range(0, n).mapToObj(i -> Integer.toString(i)).toArray(String[]::new);
}
public boolean no14(int[] nums) {
  return java.util.Arrays.stream(nums).noneMatch(i -> i == 1) || java.util.Arrays.stream(nums).noneMatch(i -> i == 4);
}
public boolean isEverywhere(int[] nums, int val) {
  return java.util.stream.IntStream.range(0, nums.length-1).noneMatch(i -> nums[i] != val && nums[i+1] != val);
}
public boolean either24(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length-1).anyMatch(i -> nums[i] == 2 && nums[i+1] == 2) ^ java.util.stream.IntStream.range(0, nums.length-1).anyMatch(i -> nums[i] == 4 && nums[i+1] == 4);
}
public int matchUp(int[] nums1, int[] nums2) {
  return (int) java.util.stream.IntStream.range(0, nums1.length).filter(i -> nums1[i] != nums2[i] && Math.abs(nums1[i]-nums2[i]) <= 2).count();
}
public boolean has77(int[] nums) {
  return java.util.stream.IntStream.range(1, nums.length).anyMatch(i -> nums[i] == nums[i-1] && nums[i] == 7 || i > 1 && nums[i-2] == nums[i] && nums[i] == 7);
}
public boolean has12(int[] nums) {
  return java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).indexOf(1) != -1 && java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).indexOf(1) < java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).lastIndexOf(2);
}
public boolean modThree(int[] nums) {
  return java.util.stream.IntStream.range(2, nums.length).anyMatch(i -> nums[i] % 2 == nums[i-1] % 2 && nums[i-1] % 2 == nums[i-2] % 2);
}
public boolean haveThree(int[] nums) {
  return java.util.Arrays.stream(nums).filter(i -> i == 3).count() == 3 && java.util.stream.IntStream.range(1, nums.length).noneMatch(i -> nums[i] == nums[i-1] && nums[i] == 3);
}
public boolean twoTwo(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).noneMatch(i -> nums[i] == 2 && ((i == 0 || nums[i-1] != 2) && (i == nums.length-1 || nums[i+1] != 2)));
}
public boolean sameEnds(int[] nums, int len) {
  return java.util.stream.IntStream.range(0, len).noneMatch(i -> nums[i] != nums[nums.length+i-len]);
}
public boolean tripleUp(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length-2).anyMatch(i -> nums[i] + 1 == nums[i+1] && nums[i+1] + 1 == nums[i+2]);
}
public int[] fizzArray3(int start, int end) {
  return java.util.stream.IntStream.range(start, end).toArray();
}
public int[] shiftLeft(int[] nums) {
  return nums.length == 0 ? new int[0] : java.util.stream.IntStream.concat(java.util.stream.IntStream.range(1, nums.length).map(i -> nums[i]), java.util.stream.IntStream.of(nums[0])).toArray();
}
public int[] tenRun(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).map(j -> java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] % 10 == 0).boxed().collect(java.util.stream.Collectors.toCollection(java.util.TreeSet::new)).floor(j) == null ? j : java.util.stream.IntStream.range(0, nums.length).filter(i -> nums[i] % 10 == 0).boxed().collect(java.util.stream.Collectors.toCollection(java.util.TreeSet::new)).floor(j)).map(i -> nums[i]).toArray();
}
public int[] pre4(int[] nums) {
  return java.util.stream.IntStream.range(0, java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).indexOf(4)).map(i -> nums[i]).toArray();
}
public int[] post4(int[] nums) {
  return java.util.stream.IntStream.range(java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).lastIndexOf(4)+1, nums.length).map(i -> nums[i]).toArray();
}
public int[] notAlone(int[] nums, int val) {
  return java.util.stream.IntStream.range(0, nums.length).map(i -> nums[i] == val && i >= 1 && i < nums.length-1 && nums[i-1] != nums[i] && nums[i] != nums[i+1] ? Math.max(nums[i-1], nums[i+1]) : nums[i]).toArray();
}
public int[] zeroFront(int[] nums) {
  return java.util.stream.IntStream.concat(java.util.Arrays.stream(nums).filter(i -> i == 0), java.util.Arrays.stream(nums).filter(i -> i != 0)).toArray();
}
public int[] withoutTen(int[] nums) {
  return java.util.stream.IntStream.concat(java.util.Arrays.stream(nums).filter(i -> i != 10), java.util.Arrays.stream(nums).filter(i -> i == 10).map(i -> 0)).toArray();
}
public int[] zeroMax(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).map(i -> nums[i] != 0 ? nums[i] : java.util.Arrays.stream(nums).skip(i).filter(j -> j % 2 == 1).max().orElse(0)).toArray();
}
public int[] evenOdd(int[] nums) {
  return java.util.stream.IntStream.concat(java.util.Arrays.stream(nums).filter(i -> i % 2 == 0), java.util.Arrays.stream(nums).filter(i -> i % 2 == 1)).toArray();
}
public String[] fizzBuzz(int start, int end) {
  return java.util.stream.IntStream.range(start, end).mapToObj(i -> i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : Integer.toString(i)).toArray(String[]::new);
}
