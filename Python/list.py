nums = [1,2,3,4,5]
nums[0] = 11    #Lists are mutable
print(nums[3:])

names = ['Vinayak','John','Smith']
combined = [names,nums]
print(combined)

nums.pop(2)
nums.extend([22,344,55])
print(nums)

x = max(nums)
y = sum(nums)
nums.sort()
print(nums,x,y)
