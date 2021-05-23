package priv.wxl.algorithm.bit;

/**
 * @author xueli.wang
 * @since 2021/03/07 10:16
 */

public class BitAlgorithm {
    public static void main(String[] args) {
        System.out.println(-1 << 31);
        System.out.println(1 << 31);
        System.out.println(-1 << 32);
        System.out.println(1 << 32);
        System.out.println(-1 << 33);
        System.out.println(1 << 33);

        System.out.println(0x10000000);
        System.out.println(-1 >>> 1);
        System.out.println(Integer.toHexString(-1));
        System.out.println(Integer.toHexString(-1 >>> 1));
        System.out.println(Integer.toHexString(-1 >>> 2));
        System.out.println(Integer.toHexString(-1 >>> 3));
    }
}
