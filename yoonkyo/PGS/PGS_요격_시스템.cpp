#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<vector<int>> targets)
{
    int answer = 0, i = 0, end = 0;
    sort(targets.begin(), targets.end());
    while (i < targets.size())
    {
        end = targets[i++][1];    // Target의 e에 발사해야, 최대 요격 가능
        answer++;
        while (i < targets.size() && targets[i][0] < end)
        {
            if (targets[i][1] < end) end = targets[i][1];
            i++;
        }
    }
    return answer;
}
