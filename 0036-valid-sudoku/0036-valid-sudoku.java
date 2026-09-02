class Solution {
    public boolean isValidSudoku(char[][] board) {
        //  HashMap<Integer,HashSet<Integer>> rows = new HashMap<>();
        //  HashMap<Integer,HashSet<Integer>> columns = new HashMap<>();
        //  HashMap<String,HashSet<Integer>> squares = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();
        //USING computeIfAbsent() instead
        //  for(int i=0;i<9;i++){
        //     rows.put(i,new HashSet<>());
        //     columns.put(i,new HashSet<>());
        //     for(int j=0;j<9;j++){
        //     String coord = String.format("%d,%d",i/3,j/3);
        //     squares.put(coord,new HashSet<>());
        //     }
            
        //  }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                 String squareKey = (i / 3) + "," + (j / 3);
                char val = board[i][j];
                if(rows.computeIfAbsent(i,key->new HashSet<>()).contains(val)
                ||columns.computeIfAbsent(j,key->new HashSet<>()).contains(val)
                ||squares.computeIfAbsent(squareKey,key->new HashSet<>()).contains(val)
                ){
                    return false;
                }
                else{
                    rows.get(i).add(val);
                    columns.get(j).add(val);
                    squares.get(squareKey).add(val);
                }
                
            }
        }
        return true;

    }
}