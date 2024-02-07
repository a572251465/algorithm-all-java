package day01;

public class A000001_打印int位运算内容 {
  
  /**
   * 打印某个int 数值的 32位的值
   *
   * @param num 具体的值
   * @return
   * @author lihh
   */
  public static void print(int num) {
    StringBuffer stringBuffer = new StringBuffer();
    /**
     * 1. int 类型占用的字节大小是4位，一个字节是8个bit位，意味着 如果是int类型的话，占用32个bit位
     * 2. 在Java中，整数类型（int）是32位的，从0到31位进行换算是因为计算机中的二进制位是从右到左编号的，从0开始。每一位都代表了一个二进制数的幂次
     * 3. 所以我们要利用 & 的特性，两者是1 结果才是1，否则结果就是0
     * 4. 这里简单描述下，如果我们运算是 1 << 3  其结果就是 1000，假如我们让 1000 跟 数值 & 的话，最起码知道3的位置上其结果是 0 或是 1
     * 5. 根据上述内容，我们以此类推，就能拿到某个数值的 32位的内容
     *
     */
    for (int i = 31; i >= 0; i--)
      stringBuffer.append((num & (1 << i)) == 0 ? "0" : "1");
    
    System.out.println(stringBuffer);
  }
  
  public static void main(String[] args) {
    print(13456);
  }
}
