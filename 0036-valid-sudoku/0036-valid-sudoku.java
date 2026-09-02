class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashMap<Integer,HashSet<Integer>> rows = new HashMap<>();
         HashMap<Integer,HashSet<Integer>> columns = new HashMap<>();
         HashMap<String,HashSet<Integer>> squares = new HashMap<>();
            
         for(int i=0;i<9;i++){
            rows.put(i,new HashSet<>());
            columns.put(i,new HashSet<>());
            for(int j=0;j<9;j++){
            String coord = String.format("%d,%d",i/3,j/3);
            squares.put(coord,new HashSet<>());
            }
            
         }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                int val = Character.getNumericValue(board[i][j]);
                if(rows.getOrDefault(i,new HashSet()).contains(val)){
                    return false;
                }
                else{
                    rows.get(i).add(val);
                }
                if(columns.getOrDefault(j,new HashSet()).contains(val)){
                    return false;
                }
                else{
                    columns.get(j).add(val);
                }
                int x = i/3;int y = j/3;
                String coord = String.format("%d,%d",x,y); 
                if(squares.getOrDefault(coord,new HashSet()).contains(val)){
                    return false;
                }
                else{
                    squares.get(coord).add(val);
                }
            }
        }
        return true;

    }
}