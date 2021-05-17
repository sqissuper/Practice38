package com.company;

public class Main {

    //树根
//    public static int getTreeRoot(String s) {
//        int n = 0;
//        for(int i = 0; i < s.length(); i++) {
//            n += s.charAt(i) - '0';
//        }
//        while(n >= 10) {
//            int sum = 0;
//            while(n != 0) {
//                int tmp = n % 10;
//                sum += tmp;
//                n /= 10;
//            }
//            if(sum >= 10) {
//                n = sum;
//            } else {
//                return sum;
//            }
//        }
//        return n;
//    }


    //变态台阶跳
//    public int jumpFloorII(int target) {
//        if(target == 0) return 0;
//        int[] dp = new int[target + 2];
//        dp[0] = 1;
//        dp[1] = 1;
//        dp[2]  =2;
//        for(int i = 3; i < target  +1; i++) {
//            dp[i] = dp[i - 1] * 2;
//        }
//        return dp[target];
//    }


    //剑指 Offer 52. 两个链表的第一个公共节点
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        if(headA == null || headB == null) return null;
//        int lenA = 0,lenB = 0;
//        ListNode A = headA;
//        ListNode B = headB;
//        while(A != null) {
//            lenA++;
//            A = A.next;
//        }
//        while(B != null) {
//            lenB++;
//            B = B.next;
//        }
//        int len = lenA - lenB;
//        A = headA;
//        B = headB;
//        if(len < 0) {
//            len = lenB - lenA;
//            A = headB;
//            B = headA;
//
//        }
//        while(len != 0) {
//            A = A.next;
//            len--;
//        }
//        while(A != null && B != null) {
//            if(A == B) return A;
//            A = A.next;
//            B = B.next;
//        }
//        return null;
//    }

    //字符串转整数
//    public static int StrToInt(String str) {
//        if(str == null || str.length() == 0) return 0;
//        int f = 1;
//        int index = 0;
//        if(str.charAt(0) == '+') index++;
//        if(str.charAt(0) == '-') {
//            f = -1;
//            index++;
//        }
//        int sum = 0;
//        for(int i = index; i < str.length(); i++) {
//            if(str.charAt(i) - '0' < 0 || str.charAt(i) - '0' > 9) return 0;
//            sum = sum * 10 + str.charAt(i) - '0';
//        }
//        return f * sum;
//    }
    public static void main(String[] args) {
//        String s = "123";
//        System.out.println(StrToInt(s));

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            double n = sc.nextDouble();
//            double r = sc.nextDouble();
//            double cat = 3.14;
//            double c = 2 * cat *r;
//            if(c > n) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
//
//        }
	// write your code here
//        long n = (long) 10E1000;
//        System.out.println(getTreeRoot(n));
    }
}
