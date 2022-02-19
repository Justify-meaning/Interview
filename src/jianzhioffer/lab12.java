package jianzhioffer;

/**
 * @Author Justifymeaning
 * @Date 2021/3/20 20:18
 * @Version 1.0
 */
public class lab12 {

//
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (dfs(board, words, i, j, 0))
                    return true;
            }
        }
        return false;   // 所以都不符合 就返回false
    }

//  深度优先搜索 传入五个参数，分别代表数组，要检测的字符串，以及行数，列数和匹配到第几个字符
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k])
            return false;
        if (k == word.length - 1)
            return true;
        board[i][j] = '\0';     //  保证在当前方案中不要走“回头路”，即此次递归
        boolean res = dfs(board, word, i+1, j, k+1) || dfs(board, word, i-1, j, k+1)||
                dfs(board, word, i, j+1, k+1) || dfs(board, word, i, j-1, k+1);
        board[i][j] = word[k];  // 得出结果时，要将已标记的元素重置，因为数组中的元素会被多次访问，只是一条路径中不走“回头路”
        return res;

    }


}
