def string_times(str, n):
  return str*n
def front_times(str, n):
  return str[:3] * n
def string_bits(str):
  return str[0::2]
def string_splosion(str):
  return ''.join(str[0:i] for i in range(1, len(str)+1))
def last2(str):
  return len([str[i:] for i in range(0, len(str)-2) if str[i:i+2] == str[-2:]])
def array_count9(nums):
  return nums.count(9)
def array_front9(nums):
  return 9 in nums[:4]
def array123(nums):
  return bool([i for i in range(0, len(nums)-2) if nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3])
def string_match(a, b):
  return len([i for i in range(0, len(a)-1) if a[i:i+2] == b[i:i+2]])
