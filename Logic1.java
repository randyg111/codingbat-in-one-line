public boolean cigarParty(int cigars, boolean isWeekend) {
  return (cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40);
}
public int dateFashion(int you, int date) {
  return (you <= 2 || date <= 2) ? 0 : (you >= 8 || date >= 8) ? 2 : 1;
}
public boolean squirrelPlay(int temp, boolean isSummer) {
  return (temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100);
}
public int caughtSpeeding(int speed, boolean isBirthday) {
  return isBirthday ? (speed >= 66 && speed <= 85) ? 1 : speed > 85 ? 2 : 0 : (speed >= 61 && speed <= 80) ? 1 : (speed > 80) ? 2 : 0;
}
public int sortaSum(int a, int b) {
  return (a+b >= 10 && a+b <= 19) ? 20 : a+b;
}
public String alarmClock(int day, boolean vacation) {
  return vacation ? day == 0 || day == 6 ? "off" : "10:00" : day == 0 || day == 6 ? "10:00" : "7:00";
}
public boolean love6(int a, int b) {
  return a == 6 || b == 6 || a+b == 6 || Math.abs(a-b) == 6;
}
public boolean in1To10(int n, boolean outsideMode) {
  return outsideMode ? n <= 1 || n >= 10 : n >= 1 && n <= 10;
}
public boolean specialEleven(int n) {
  return n % 11 == 0 || n % 11 == 1;
}
public boolean more20(int n) {
  return n % 20 == 1 || n % 20 == 2;
}
public boolean old35(int n) {
  return !(n%3 == 0 && n%5 == 0) && (n%3 == 0 || n%5 == 0);
}
public boolean less20(int n) {
  return n % 20 == 18 || n % 20 == 19;
}
public boolean nearTen(int num) {
  return num % 10 >= 8 || num % 10 <= 2;
}
public int teenSum(int a, int b) {
  return a >= 13 && a <= 19 || b >= 13 && b <= 19 ? 19 : a+b;
}
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  return !isAsleep && (isMom || !isMorning);
}
public int teaParty(int tea, int candy) {
  return tea < 5 || candy < 5 ? 0 : tea >= candy*2 || candy >= tea*2 ? 2 : 1;
}
public String fizzString(String str) {
  return str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b' ? "FizzBuzz" : str.charAt(0) == 'f' ? "Fizz" : str.charAt(str.length()-1) == 'b' ? "Buzz" : str;
}
public String fizzString2(int n) {
  return n % 15 == 0 ? "FizzBuzz!" : n % 3 == 0 ? "Fizz!" : n % 5 == 0 ? "Buzz!" : Integer.toString(n) + "!";
}
public boolean twoAsOne(int a, int b, int c) {
  return a+b==c || a+c==b || b+c==a;
}
public boolean inOrder(int a, int b, int c, boolean bOk) {
  return bOk ? c > b : b > a && c > b;
}
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  return equalOk ? a <= b && b <= c : a < b && b < c;
}
public boolean lastDigit(int a, int b, int c) {
  return a%10 == b%10 || b%10 == c%10 || a%10 == c%10;
}
public boolean lessBy10(int a, int b, int c) {
  return Math.max(a, Math.max(b, c)) -  Math.min(a, Math.min(b, c)) >= 10;
}
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  return noDoubles & die1 == die2 ? die1%6+die2+1 : die1+die2;
}
public int maxMod5(int a, int b) {
  return a == b ? 0 : a%5 ==  b%5 ? Math.min(a, b) : Math.max(a, b);
}
public int redTicket(int a, int b, int c) {
  return a == b && b == c && a == 2 ? 10 : a == b && b == c ? 5 : b != a && c != a ? 1 : 0;
}
public int greenTicket(int a, int b, int c) {
  return a == b && b == c ? 20 : a == b || a == c || b == c ? 10 : 0;
}
public int blueTicket(int a, int b, int c) {
  return a+b==10||b+c==10||a+c==10 ? 10 : a-c==10||b-c==10 ? 5 : 0;
}
public boolean shareDigit(int a, int b) {
  return a%10==b%10||a/10==b%10||a%10==b/10||a/10==b/10;
}
public int sumLimit(int a, int b) {
  return Integer.toString(a+b).length() > Integer.toString(a).length() ? a : a+b;
}
