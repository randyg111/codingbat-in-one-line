public int maxSpan(int[] nums) {
  return java.util.Arrays.stream(nums).distinct().map(i -> java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).lastIndexOf(i) - java.util.Arrays.stream(nums).boxed().collect(java.util.stream.Collectors.toList()).indexOf(i)+1).max().orElse(0);
}
public int[] fix34(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).map(i -> i > 0 && nums[i-1] == 3 ? 4 : nums[i] != 4 ? nums[i] : java.util.Arrays.stream(nums).filter(j -> j != 3 && j != 4).max().getAsInt()).toArray();
}
public int[] fix45(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).map(i -> i > 0 && nums[i-1] == 4 ? 5 : nums[i] != 5 ? nums[i] : java.util.Arrays.stream(nums).filter(j -> j != 5 && j != 4).max().getAsInt()).toArray();
}
public boolean canBalance(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length).anyMatch(i -> java.util.Arrays.stream(nums).skip(i).sum()*2 == java.util.Arrays.stream(nums).sum());
}
public boolean linearIn(int[] outer, int[] inner) {
  return java.util.Arrays.stream(outer).boxed().collect(java.util.stream.Collectors.toCollection(java.util.HashSet::new)).containsAll(java.util.Arrays.stream(inner).boxed().collect(java.util.stream.Collectors.toCollection(java.util.HashSet::new)));
}
public int[] squareUp(int n) {
  return java.util.stream.IntStream.range(0, n*n).map(i -> i/n >= (n - i%n) - 1 ? (n - i%n) : 0).toArray();
}
public int[] seriesUp(int n) {
  return java.util.stream.IntStream.rangeClosed(1, n).boxed().reduce(java.util.stream.IntStream.empty(), (a, b) -> (java.util.stream.IntStream.concat(a, java.util.stream.IntStream.rangeClosed(1, b))), (a, b) -> a).toArray();
}
public int maxMirror(int[] nums) {
  return java.util.stream.IntStream.range(0, nums.length*nums.length*nums.length).mapToObj(i -> new int[]{i/nums.length/nums.length, i/nums.length%nums.length, i%nums.length}).filter(arr -> arr[0] <= arr[1] && arr[1] + arr[2] < nums.length).filter(arr -> java.util.stream.IntStream.rangeClosed(arr[0], arr[0]+arr[2]).map(i -> nums[i]).boxed().collect(java.util.stream.Collectors.toList()).equals(java.util.stream.IntStream.rangeClosed(arr[1], arr[1]+arr[2]).map(i -> arr[1] + arr[2] - i + arr[1]).map(i -> nums[i]).boxed().collect(java.util.stream.Collectors.toList()))).mapToInt(arr -> arr[2]).max().orElse(-1)+1;
}
public int countClumps(int[] nums) {
  return (int) java.util.stream.IntStream.range(1, java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0), java.util.stream.IntStream.range(1, nums.length).filter(i -> nums[i] != nums[i-1])), java.util.stream.IntStream.of(nums.length)).toArray().length).map(j -> java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0), java.util.stream.IntStream.range(1, nums.length).filter(i -> nums[i] != nums[i-1])), java.util.stream.IntStream.of(nums.length)).toArray()[j] - java.util.stream.IntStream.concat(java.util.stream.IntStream.concat(java.util.stream.IntStream.of(0), java.util.stream.IntStream.range(1, nums.length).filter(i -> nums[i] != nums[i-1])), java.util.stream.IntStream.of(nums.length)).toArray()[j-1]).filter(i -> i >= 2).count();
}
