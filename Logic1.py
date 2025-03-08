def cigar_party(cigars, is_weekend):
  return cigars >= 40 if is_weekend else cigars >= 40 and cigars <= 60
def date_fashion(you, date):
  return 0 if you <= 2 or date <= 2 else 2 if you >= 8 or date >= 8 else 1
def squirrel_play(temp, is_summer):
  return temp >= 60 and temp <= 100 if is_summer else temp >= 60 and temp <= 90
def caught_speeding(speed, is_birthday):
  return 0 if speed <= 65 and is_birthday or speed <= 60 else 1 if speed <= 85 and is_birthday or speed <= 80 else 2
def sorta_sum(a, b):
  return 20 if a+b >= 10 and a+b <= 19 else a+b
def alarm_clock(day, vacation):
  return "7:00" if abs(day-3) < 3 and not vacation else "off" if abs(day-3) == 3 and vacation else "10:00"
def love6(a, b):
  return a == 6 or b == 6 or a+b == 6 or abs(a-b) == 6
def in1to10(n, outside_mode):
  return n <= 1 or n >= 10 if outside_mode else n >= 1 and n <= 10
def near_ten(num):
  return abs(5 - num % 10) > 2
