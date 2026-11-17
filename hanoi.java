public class Hanoi {

    // 汉诺塔递归函数
    public static void hanoi(int n, char from,
                             char auxiliary, char to) {

        // 递归终止条件
        if (n == 1) {
            System.out.println(from + " -> " + to);
            return;
        }

        // 将 n-1 个圆盘移动到辅助柱
        hanoi(n - 1, from, to, auxiliary);

        // 移动最大的圆盘
        System.out.println(from + " -> " + to);

        // 将 n-1 个圆盘移动到目标柱
        hanoi(n - 1, auxiliary, from, to);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }
}
