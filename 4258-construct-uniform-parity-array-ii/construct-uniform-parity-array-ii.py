class Solution(object):
    def uniformArray(self, nums):
        if min(nums)%2!=0:
            return True
        for i in nums:
            if i%2!=0:
                return False
        return True
        