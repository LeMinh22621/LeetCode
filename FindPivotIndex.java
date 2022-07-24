import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.text.AbstractDocument.BranchElement;

public class FindPivotIndex {

    // public int myPivot(int pivot, int[] nums) {
    // int s1 = 0;
    // int s2 = 0;
    // for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
    // if (i >= pivot)
    // break;
    // s1 += nums[i];
    // s2 += nums[j];
    // }
    // if (s1 == s2)
    // return pivot;
    // else if (s1 < s2)
    // pivot += 1;
    // else
    // pivot -= 1;
    // return pivot;
    // }

    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int s1 = 0, s2 = 0;
        for (int i = 1; i < nums.length; i++) {
            s1 += nums[i];
        }
        if (s1 == 0)
            return 0;
        for (int i = 1; i < nums.length; i++) {
            if (s1 > s2 || s1 < s2)
                s1 -= nums[i];
            s2 += nums[i - 1];
            if (s1 == s2)
                return i;
            System.out.println(s1 + "----" + s2);
        }
        return pivot;
    }

    public static void main(String[] args) {
        FindPivotIndex ob = new FindPivotIndex();
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 1, -1 };
        int[] nums3 = { -1, -1, -1, -1, -1, -1 };
        System.out.println(ob.pivotIndex(nums));
        System.out.println(ob.pivotIndex(nums1));
        System.out.println(ob.pivotIndex(nums2));
        System.out.println(ob.pivotIndex(nums3));
    }
}
