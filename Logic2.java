public boolean makeBricks(int small, int big, int goal) {
  return small >= goal || big*5 >= (goal / 5 * 5) && small >= goal % 5 || big*5 < (goal / 5 * 5) && small >= goal - big*5;
}
public int loneSum(int a, int b, int c) {
  return a != b && b != c && a != c ? a+b+c : a == b && b == c ? 0 : a == b ? c : b == c ? a : b;
}
public int luckySum(int a, int b, int c) {
  return a == 13 ? 0 : b == 13 ? a : c == 13 ? a+b : a+b+c;
}
public int noTeenSum(int a, int b, int c) {
  return (a >= 13 && a <= 19 && a != 15 && a != 16 ? 0 : a) + (b >= 13 && b <= 19 && b != 15 && b != 16 ? 0 : b) + (c >= 13 && c <= 19 && c != 15 && c != 16 ? 0 : c); 
}
public int roundSum(int a, int b, int c) {
  return (a % 10 >= 5 ? a / 10 * 10 + 10 : a / 10 * 10) + (b % 10 >= 5 ? b / 10 * 10 + 10 : b / 10 * 10) + (c % 10 >= 5 ? c / 10 * 10 + 10 : c / 10 * 10);
}
public boolean closeFar(int a, int b, int c) {
  return Math.abs(b-a) <= 1 && Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2 || Math.abs(c-a) <= 1 && Math.abs(b-a) >= 2 && Math.abs(c-b) >= 2;
}
public int blackjack(int a, int b) {
  return a <= 21 && b <= 21 ? Math.max(a, b) : a <= 21 ? a : b <= 21 ? b : 0;
}
public boolean evenlySpaced(int a, int b, int c) {
  return Math.max(a, Math.max(b, c)) - Math.min(Math.min(Math.max(a, b), Math.max(b, c)), Math.max(a, c)) == Math.min(Math.min(Math.max(a, b), Math.max(b, c)), Math.max(a, c)) - Math.min(a, Math.min(b, c));
}
public int makeChocolate(int small, int big, int goal) {
  return small >= goal-Math.min(big * 5, goal/5*5) ? goal-Math.min(big * 5, goal/5*5) : -1;
}
