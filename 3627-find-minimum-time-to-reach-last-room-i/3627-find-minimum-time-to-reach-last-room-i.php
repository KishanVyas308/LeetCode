class Solution {

    /**
     * @param Integer[][] $moveTime
     * @return Integer
     */
    function minTimeToReach($moveTime) {
        $rows = count($moveTime);
        $cols = count($moveTime[0]);
        $time = array_fill(0, $rows, array_fill(0, $cols, PHP_INT_MAX));

        // Priority queue implemented as a min-heap using SplPriorityQueue
        $minHeap = new SplPriorityQueue();
        $minHeap->setExtractFlags(SplPriorityQueue::EXTR_DATA);

        $minHeap->insert([0, 0, 0], 0); // time, x, y
        $time[0][0] = 0;

        $directions = [[1, 0], [-1, 0], [0, 1], [0, -1]];

        while (!$minHeap->isEmpty()) {
            [$currentTime, $x, $y] = $minHeap->extract();

            if ($x === $rows - 1 && $y === $cols - 1) {
                return $currentTime;
            }

            foreach ($directions as [$dx, $dy]) {
                $newX = $x + $dx;
                $newY = $y + $dy;

                if ($newX >= 0 && $newX < $rows && $newY >= 0 && $newY < $cols) {
                    $waitTime = max($moveTime[$newX][$newY] - $currentTime, 0);
                    $newTime = $currentTime + 1 + $waitTime;

                    if ($newTime < $time[$newX][$newY]) {
                        $time[$newX][$newY] = $newTime;
                        $minHeap->insert([$newTime, $newX, $newY], -$newTime);
                    }
                }
            }
        }

        return -1; 
    }
}