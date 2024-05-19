class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        if not timeSeries: return 0

        poisoned = 0

        for i in range(len(timeSeries) - 1):
            poisoned += min(duration, timeSeries[i + 1] - timeSeries[i])
        
        return poisoned + duration
