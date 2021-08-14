/*
 * Write a code that check the input is a multiple of 3 or not without using division or mod.
 */
/*
 * 參考網路上的解法，額外加上詳細注解
 *
 * Set Number = abcde(2進位)
 * abcde = abc<<2 + de
 *       = abc*4 + de
 *       = abc*3 + (abc + de)
 * 舉例：
 * set Number = 24 (11000)      => abcde
 * 11000 = 110<<2 + 00          => 因為3的二進位佔了2位數，所以位移2位數
 *       = 110*4  + 00          => 二進位110 => 十進位6; 110<<1會變成十進位12就是原本的6乘2的意思；110<<2會變成十進位24就是原本的6乘4的意思
 *       = 110*3  + (110 + 00)  => 最前面110*3 代表任何數*3都是3的倍數；所以就看剩下的餘數是否一樣是3的倍數，繼續不斷的重複做一樣的事情就能得到最後答案
 * 110   = 1<<2   + 10
 *       = 1*4    + 10
 *       = 1*3    + (1 + 10)
 * 11    => 3                   => 最後得到3結束
 * 
 * 同理舉例 7 (111)
 * Set Number = abcde
 * abcde = ab<<3 + cde
 *       = ab*8  + cde
 *       = ab*7  + (ab + cde)
 * Set Number = 24 (10101
 * 10101 = 10<<3 + 101
 *       = 10*8  + 101
 *       = 10*7  + (10 + 101)
 * 111   => 7
 * 
 * 同理舉例 13 (1101)
 * Set Number = abcdef
 * abcde = ab<<4 + cdef
 *       = ab*16  + cdef
 *       = ab*13  + (ab*3 + cdef)
 * Set Number = 52 (110100
 * 110100 = 11<<4 + 0100
 *        = 11*16 + 0100
 *        = 11*13 + (11 + 11 + 11 + 0100)
 *        = 11*13 + (11*3 + 0100)
 * 1101   => 13
 * 
 * 任何數字都可以用類似的方式拆出用 & 跟 << 完成的判斷
 * 
 * x = (x >> binaryLength) + (x & n) 適用於 n 每個bit都為1
 * e.g. 3=>11
 *      7=>111
 */

int isMulti3(unsigned int n) {
    if (n == 0 || n == 3) {
        return 1;
    } else if (n < 3) {
        return 0;
    }
    
      n = (n >> 2) + (n & 3);
    
    return isMulti3(n);
}

int isMulti7(unsigned int n) {
    if (n == 0 || n == 7) {
        return 1;
    } else if (n < 7) {
        return 0;
    }

    n = (n >> 3) + (n & 7);

    return isMulti7(n);
}

/**
 * 其他數字判斷，我暫時只能想到最暴力的解法，歡迎提供方法給我
 */ 
int isMulti13(unsigned int n) {
    if (n == 0 || n == 13) {
        return 1;
    } else if (n < 13) {
        return 0;
    }

    n = n - 13;

    return isMulti13(n);
}