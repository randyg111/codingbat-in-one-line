public Map<String, Integer> word0(String[] strings) {
  return java.util.Arrays.stream(strings).collect(java.util.stream.Collectors.groupingBy(i -> i, java.util.stream.Collectors.summingInt(i -> 0)));
}
public Map<String, Integer> wordLen(String[] strings) {
  return java.util.Arrays.stream(strings).distinct().collect(java.util.stream.Collectors.toMap(s -> s, s -> s.length()));
}
public Map<String, String> pairs(String[] strings) {
  return java.util.stream.IntStream.range(0, strings.length).filter(i -> java.util.Arrays.stream(strings).skip(i).filter(s -> s.charAt(0) == strings[i].charAt(0)).count() == 1).mapToObj(i -> strings[i]).collect(java.util.stream.Collectors.toMap(s -> s.substring(0, 1), s -> s.substring(s.length()-1)));
}
public Map<String, Integer> wordCount(String[] strings) {
  return java.util.Arrays.stream(strings).collect(java.util.stream.Collectors.groupingBy(s -> s, java.util.stream.Collectors.summingInt(s -> 1)));
}
public Map<String, String> firstChar(String[] strings) {
  return java.util.Arrays.stream(strings).collect(java.util.stream.Collectors.groupingBy(s -> s.substring(0, 1), java.util.stream.Collectors.joining()));
}
public String wordAppend(String[] strings) {
  return java.util.stream.IntStream.range(0, strings.length).boxed().reduce("", (a, b) -> java.util.Arrays.stream(strings).limit(b+1).filter(s -> s.equals(strings[b])).count() % 2 == 0 ? a+strings[b] : a, (a, b) -> a+b);
}
public Map<String, Boolean> wordMultiple(String[] strings) {
  return java.util.Arrays.stream(strings).distinct().collect(java.util.stream.Collectors.toMap(s -> s, s -> java.util.Arrays.stream(strings).filter(a -> a.equals(s)).count() >= 2));
}
public String[] allSwap(String[] strings) {
  return java.util.stream.IntStream.range(0, strings.length).map(i -> java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i) % 2 == 1 ? java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).get(java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i)-1) : java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i) == java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).size()-1 ? i : java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).get(java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i)+1)).mapToObj(i -> strings[i]).toArray(String[]::new);
}
public String[] firstSwap(String[] strings) {
  return java.util.stream.IntStream.range(0, strings.length).map(i -> java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i) == 1 ? java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).get(java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i)-1) : java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i) == java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).size()-1 || java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i) > 0 ? i : java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).get(java.util.stream.IntStream.range(0, strings.length).boxed().collect(java.util.stream.Collectors.groupingBy(j -> strings[j].charAt(0))).get(strings[i].charAt(0)).indexOf(i)+1)).mapToObj(i -> strings[i]).toArray(String[]::new);
}
