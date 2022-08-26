package com.example.javabufferclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReaderTest {
    // BufferedReader는 Exception이 처리를 따로 해줘야 하기 때문에
    // throws를 해주거나 try-catch 로 예외처리를 해줘야 한다.

    public static void main(String[] args) throws Exception{
        // BufferedReader 객체 생성
        // new InputStreamReader 및 System.in
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        // StringTokenizer 객체 선언
        StringTokenizer st = null;

        // String Line 이므로 Integer.parseInt를 이용하여  형변환 해야함
        int n = Integer.parseInt(br.readLine());

        // "1 3 5 7" 식으로 공란 포함 String Line 일시 StringTokenizer 이용
        int[] arrays = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++){
            // 배열마다 토큰을 하나씩 불러서 입력해줌
            arrays[i] = Integer.parseInt(st.nextToken());
        }
    }

}
