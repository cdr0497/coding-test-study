package withvaba.cote.Ladder;

public class Ladder {

    public static void main(String[] args) {
        char[] answer = getAnswer(5, new int[][]{{1, 3}, {2, 4}, {1, 4}});
//        char[] answer = getAnswer(7, new int[][]{{1, 3, 5}, {1,3,6}, {2, 4}});

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
    }



    private static char[] getAnswer(int n, int[][] ladder){
        // 답 초기화
        char[] answer = initChar(n);

        // 사다리 정보 읽어 위치 변환
        // 사다리 타기 자리 이동 = 서로의 위치를 변환

        // 사다리 정보 형태 [[1,3][2,4,6]]
        for(int[] line : ladder){
            for(int x : line){
                char tmp = answer[x];
                answer[x] = answer[x-1];
                answer[x-1] = tmp;
            }
        }
        return answer;
    }

    private static char[] initChar(int n) {
        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (char)(i+65);
        }
        return answer;
    }
}
