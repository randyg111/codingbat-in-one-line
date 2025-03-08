def make_bricks(small, big, goal):
  return small >= goal or big >= goal / 5 and small >= goal % 5 or big < goal / 5 and small >= goal - big*5
def lone_sum(a, b, c):
  return( a if a != b and a != c else 0) + (b if a != b and b != c else 0) + (c if c != b and a != c else 0)
def lucky_sum(a, b, c):
  return 0 if a == 13 else a if b == 13 else a+b if c == 13 else a+b+c
def no_teen_sum(a, b, c):
  return (0 if a >= 13 and a <= 19 and a != 15 and a != 16 else a) + (0 if b >= 13 and b <= 19 and b != 15 and b != 16 else b) + (0 if c >= 13 and c <= 19 and c != 15 and c != 16 else c)
def round_sum(a, b, c):
  return (a/10 + a%10*2/10)*10 + (b/10 + b%10*2/10)*10 + (c/10 + c%10*2/10)*10
def close_far(a, b, c):
  return abs(a-b) <= 1 and abs(a-c) >= 2 and abs(c-b) >= 2 or abs(a-c) <= 1 and abs(a-b) >= 2 and abs(c-b) >= 2
def make_chocolate(small, big, goal):
  return goal-min(big, goal/5)*5 if goal-min(big, goal/5)*5 <= small else -1
