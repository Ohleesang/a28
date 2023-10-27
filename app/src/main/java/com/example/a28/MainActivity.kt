package com.example.a28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class Solution {
            fun solution(numbers: IntArray): Int {
                var answer: Int = -1
                var res:IntArray = numbers
                //모든합 - res의합
                answer = 45-res.sum()
                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(1,2,3,4,6,7,8,0))
        a.solution(intArrayOf(5,8,4,0,6,7,9))
    }


}