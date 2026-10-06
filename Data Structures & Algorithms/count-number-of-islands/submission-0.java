class Solution {
    public int numIslands(char[][] grid) {

        int rows  = grid.length;
        int cols  = grid[0].length;

        boolean[][] visited =  new boolean[rows][cols];

        int count =0;
    for(int i = 0 ; i <rows;i++ ) {

            for(int j = 0 ; j< cols; j++) {


                if(grid[i][j]=='1' && !visited[i][j])
                {
                solution(grid,visited, i, j) ;
                count ++;
                }
            
            }
        }
       return count;


        
    }


    public void solution(char[][] grid,boolean[][] visited,int rows, int cols) {

        if(rows<0 || cols <0 || rows>= grid.length|| cols >= grid[0].length
         ||  grid[rows][cols] =='0' || visited[rows][cols] ){
            return;
        } 
        
        visited[rows][cols] =true;
            
        solution(grid,visited,rows-1,cols);
        solution(grid,visited,rows+1,cols);
        solution(grid,visited,rows,cols-1);
        solution(grid,visited,rows,cols+1);
          

    }
}
