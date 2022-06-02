package lecture_08;

public class Main {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1,0,0,0,1,0,1},
        //     {1,0,0,0,0,1,0},
        //     {0,0,1,0,0,0,0},
        //     {0,0,0,0,0,0,0},
        //     {0,0,0,1,0,0,0},
        //     {0,0,1,0,0,0,1}
        // };
        // exitPoint(arr);
        String str = "AabBccDDefG";
        System.out.println(toggleCases(str));
    }

    public static String toggleCases(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ( ch >= 'a' && ch <= 'z' ) {
                char ans = (char)(ch + 'A' - 'a');
                sb.append(ans);
            } else if ( ch >= 'A' && ch <= 'Z' ) {
                char ans = (char)(ch - 'A' + 'a');
                sb.append(ans);
            }
        }
        return sb.toString();
    }

    public static void exitPoint(int[][] arr) {
        // dir - 0 means right
        // dir - 1 means down
        // dir - 2 means left
        // dir - 3 means up

        int row = 0, col = 0;
        int dir = 0;
        while (true) {
            dir = (dir + arr[row][col]) % 4;
            // if (arr[row][col] == 1) {
            //     dir = (dir + 1) % 4;
            // } else {
            //     dir = (dir + 0) % 4;
            // }
            if ( dir == 0 ) {
                col++;
                if (col == arr[0].length) {
                    col--;
                    break;
                }
            } else if ( dir == 1 ) {
                row++;
                if (row == arr.length) {
                    row--;
                    break;
                }
            } else if ( dir == 2 ) {
                col--;
                if (col == -1) {
                    col++;
                    break;
                }
            } else if ( dir == 3 ) {
                row--;
                if (row == -1) {
                    row++;
                    break;
                }
            }
        }
        System.out.println("(" + row + ", " + col + ")");
    }
}
