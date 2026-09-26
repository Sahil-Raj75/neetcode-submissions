class Solution {
    static int lb(int[] arr, int x) {
        int s = 0, e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == x) {
                ans = mid;
                e = mid - 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    static int ub(int[] arr, int x) {
        int s = 0, e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == x) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < x) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int left_most = lb(nums, target);
        int right_most = ub(nums, target);

        return new int[] { left_most, right_most };
    }
}