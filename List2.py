def count_evens(nums):
  return len([i for i in range(0, len(nums)) if nums[i] % 2 == 0])
def big_diff(nums):
  return max(nums) - min(nums)
def centered_average(nums):
  return (sum(nums)-max(nums)-min(nums))//(len(nums)-2)
def sum13(nums):
  return sum(nums[i] for i in range(0, len(nums)) if nums[i] != 13 and (i == 0 or nums[i-1] != 13))
def sum67(nums):
  return sum([nums[i] for i in range(0, len(nums)) if 6 not in nums[0:i+1] or 7 in nums[0:i] and nums[i::-1].index(6) > nums[i::-1].index(7, 1)])
def has22(nums):
  return bool(sum(i for i in range(1, len(nums)) if nums[i] == nums[i-1] and nums[i] == 2))
