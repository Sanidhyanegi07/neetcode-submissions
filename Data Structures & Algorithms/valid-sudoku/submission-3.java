class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            HashSet<Character>h=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                 {
                    if(h.contains(board[i][j]))
                    {
                        return false;
                    }
                    h.add(board[i][j]);
                 }
            }
        }
        for(int i=0;i<9;i++)
        {
            HashSet<Character>h=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.')
                {
                    if(h.contains(board[j][i]))
                    {
                        return false;
                    }
                    h.add(board[j][i]);
                }
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                HashSet<Character>h=new HashSet<>();
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(board[k][l]!='.')
                        {
                            if(h.contains(board[k][l]))
                            {
                                return false;
                            }
                            h.add(board[k][l]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
