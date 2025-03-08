public boolean firstLast6(int[] nums) {
  return nums[0] == 6 || nums[nums.length-1] == 6;
}
public boolean sameFirstLast(int[] nums) {
  return nums.length >= 1 && nums[0] == nums[nums.length-1];
}
public int[] makePi() {
  return new int[]{3, 1, 4};
}
public boolean commonEnd(int[] a, int[] b) {
  return a[0] == b[0] || a[a.length-1] == b[b.length-1];
}
public int sum3(int[] nums) {
  return nums[0]+nums[1]+nums[2];
}
public int[] rotateLeft3(int[] nums) {
  return new int[]{nums[1], nums[2], nums[0]};
}
public int[] reverse3(int[] nums) {
  return new int[]{nums[2], nums[1], nums[0]};
}
public int[] maxEnd3(int[] nums) {
  return new int[]{Math.max(nums[0], nums[nums.length-1]), Math.max(nums[0], nums[nums.length-1]), Math.max(nums[0], nums[nums.length-1])};
}
public int sum2(int[] nums) {
  return nums.length == 0 ? 0 : nums.length == 1 ? nums[0] : nums[0]+nums[1];
}
public int[] middleWay(int[] a, int[] b) {
  return new int[]{a[1], b[1]};
}
public int[] makeEnds(int[] nums) {
  return new int[]{nums[0], nums[nums.length-1]};
}
public boolean has23(int[] nums) {
  return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
}
public boolean no23(int[] nums) {
  return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
}
public int[] makeLast(int[] nums) {
  return java.util.stream.IntStream.concat(java.util.Arrays.stream(new int[nums.length*2-1]), java.util.stream.IntStream.of(nums[nums.length-1])).toArray();
}
public boolean double23(int[] nums) {
  return nums.length == 2 && (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3);
}
public int[] fix23(int[] nums) {
  return nums[0] == 2 && nums[1] == 3 ? new int[]{nums[0], 0, nums[2]} : nums[1] == 2 && nums[2] == 3 ? new int[]{nums[0], nums[1], 0} : nums;
}
public int start1(int[] a, int[] b) {
  return (a.length == 0 || a[0] != 1) && (b.length == 0 || b[0] != 1)  ? 0 : (a.length > 0 && a[0] == 1) && (b.length > 0 && b[0] == 1) ? 2 : 1; 
}
public int[] biggerTwo(int[] a, int[] b) {
  return a[0]+a[1]>=b[0]+b[1] ? a : b;
}
public int[] makeMiddle(int[] nums) {
  return new int[]{nums[(nums.length-1)/2],nums[nums.length/2]};
}
public int[] plusTwo(int[] a, int[] b) {
  return new int[]{a[0], a[1], b[0], b[1]};
}
public int[] swapEnds(int[] nums) {
  return nums.length < 2 ? nums : java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(nums[nums.length-1]), java.util.Arrays.stream(nums).limit(nums.length-1).skip(1L)), java.util.stream.IntStream.of(nums[0])).toArray();
}
public int[] midThree(int[] nums) {
  return new int[]{nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2+1]};
}
public int maxTriple(int[] nums) {
  return Math.max(nums[0], Math.max(nums[nums.length/2], nums[nums.length-1]));
}
public int[] frontPiece(int[] nums) {
  return nums.length <= 2 ? nums : new int[]{nums[0], nums[1]};
}
public boolean unlucky1(int[] nums) {
  return nums.length >= 2 && (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3);
}
public int[] make2(int[] a, int[] b) {
  return a.length == 0 ? new int[]{b[0], b[1]} : a.length == 1 ? new int[]{a[0], b[0]} : new int[]{a[0], a[1]};
}
public int[] front11(int[] a, int[] b) {
  return a.length == 0 && b.length == 0 ? new int[0] : a.length == 0 ? new int[]{b[0]} : b.length == 0 ? new int[]{a[0]} : new int[]{a[0], b[0]};
}
