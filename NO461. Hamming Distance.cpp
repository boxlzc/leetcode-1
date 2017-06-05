//#include<iostream>
#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#include<string.h>
//#include<algorithm>
//using namespace std;
/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.*/
/*�����������Ĺ��ܶپ���
���ܶپ��붨�����£�
	������ת����2���ƣ��Ƚ�ÿһbit������Ϊ��ͬ��bit�ĸ�����
	���磺
		1��0001��
		2��0100��
		��һλ�͵���λ��ͬ������ܶپ���Ϊ2*/
/*����˼·��
	���Ƿ���λ����^���ܺͱ�������������������ֻҪ��x^y�м���bit��1�Ϳ�����*/		
		 
class Solution {
public:
    int hammingDistance(int x, int y) {
        int ans=0;
        int ansSequence=x^y;
        while(ansSequence){
            if(ansSequence&1) ans++;
            ansSequence>>=1;
        }
        return ans;
    }
};
