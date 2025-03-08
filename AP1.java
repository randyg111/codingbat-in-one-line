public boolean scoresIncreasing(int[] scores) {
  return java.util.stream.IntStream.range(1, scores.length).noneMatch(i -> scores[i] < scores[i-1]);
}
public boolean scores100(int[] scores) {
  return java.util.stream.IntStream.range(1, scores.length).anyMatch(i -> scores[i] == scores[i-1] && scores[i] == 100);
}
public boolean scoresClump(int[] scores) {
  return java.util.stream.IntStream.range(2, scores.length).anyMatch(i -> Math.abs(scores[i]-scores[i-1]) <= 2 && Math.abs(scores[i-1]-scores[i-2]) <= 2 && Math.abs(scores[i]-scores[i-2]) <= 2);
}
public int scoresAverage(int[] scores) {
  return Math.max(java.util.Arrays.stream(scores).limit(scores.length/2).sum()/(scores.length/2), java.util.Arrays.stream(scores).skip(scores.length/2).sum()/(scores.length/2));
}
public int wordsCount(String[] words, int len) {
  return (int) java.util.Arrays.stream(words).filter(s -> s.length() == len).count();
}
public String[] wordsFront(String[] words, int n) {
  return java.util.Arrays.stream(words).limit(n).toArray(String[]::new);
}
public List wordsWithoutList(String[] words, int len) {
  return java.util.Arrays.stream(words).filter(s -> s.length() != len).collect(java.util.stream.Collectors.toList());
}
public boolean hasOne(int n) {
  return Integer.toString(n).contains("1");
}
public boolean dividesSelf(int n) {
  return Integer.toString(n).chars().noneMatch(c -> c - 48 == 0 || n % (c-48) != 0);
}
public int[] copyEvens(int[] nums, int count) {
  return java.util.Arrays.stream(nums).filter(i -> i % 2 == 0).limit(count).toArray();
}
public int[] copyEndy(int[] nums, int count) {
  return java.util.Arrays.stream(nums).filter(i -> i >= 0 && i <= 10 || i >= 90 && i <= 100).limit(count).toArray();
}
public int matchUp(String[] a, String[] b) {
  return (int) java.util.stream.IntStream.range(0, a.length).filter(i -> a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0)).count();
}
public int scoreUp(String[] key, String[] answers) {
  return java.util.stream.IntStream.range(0, key.length).map(i -> key[i] == answers[i] ? 4 : answers[i].equals("?") ? 0 : -1).sum();
}
public String[] wordsWithout(String[] words, String target) {
  return java.util.Arrays.stream(words).filter(s -> !s.equals(target)).toArray(String[]::new);
}
public int scoresSpecial(int[] a, int[] b) {
  return java.util.Arrays.stream(a).filter(i -> i % 10 == 0).max().orElse(0) + java.util.Arrays.stream(b).filter(i -> i % 10 == 0).max().orElse(0);
}
public int sumHeights(int[] heights, int start, int end) {
  return java.util.stream.IntStream.range(start, end).map(i -> Math.abs(heights[i+1]-heights[i])).sum();
}
public int sumHeights2(int[] heights, int start, int end) {
  return java.util.stream.IntStream.range(start, end).map(i -> heights[i+1] > heights[i] ? 2*Math.abs(heights[i+1]-heights[i]) : Math.abs(heights[i+1]-heights[i])).sum();
}
public int bigHeights(int[] heights, int start, int end) {
  return (int) java.util.stream.IntStream.range(start, end).filter(i -> Math.abs(heights[i+1]-heights[i]) >= 5).count();
}
public int userCompare(String aName, int aId, String bName, int bId) {
  return aName.compareTo(bName) != 0 ? (int) Integer.signum(aName.compareTo(bName)) : Integer.compare(aId,bId);
}
public String[] mergeTwo(String[] a, String[] b, int n) {
  return java.util.stream.Stream.concat(java.util.Arrays.stream(a), java.util.Arrays.stream(b)).distinct().sorted().limit(n).toArray(String[]::new);
}
public int commonTwo(String[] a, String[] b) {
  return (int) java.util.Arrays.stream(a).distinct().filter(i -> java.util.Arrays.asList(b).contains(i)).count();
}
