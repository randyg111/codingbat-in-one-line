def double_char(str):
  return ''.join(str[i]*2 for i in range(0, len(str)))
def count_hi(str):
  return str.count('hi')
def cat_dog(str):
  return str.count('cat') == str.count('dog')
def count_code(str):
  return sum(str.count('co'+chr(i)+'e') for i in range(97, 123))
def end_other(a, b):
  return a.lower()[-len(b):] == b.lower() or b.lower()[-len(a):] == a.lower()
def xyz_there(str):
  return str.startswith('xyz') or sum([i if str[i-4] != '.' and str[i-3:i] == 'xyz' else 0 for i in range(4, len(str)+1)]) > 0
