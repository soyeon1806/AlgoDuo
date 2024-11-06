import math

def solution(r1, r2):
    answer = 0
    duplicated = 0      # 중복될 점 저장(x>0인 범위에서 x축위의 점 갯수)
    for x in range(r2+1):
        # y의 최대범위
        max_y = math.floor(math.sqrt(r2**2 - x**2))
        
        # x가 r1보다 크다면 내부의 원 밖이므로 y의 최솟값은 0
        if(x > r1):
            min_y = 0
        else:
            min_y = math.ceil(math.sqrt(r1**2 - x**2))

        # 만족하는 점의 갯수
        answer += (max_y - min_y + 1)
        
        # 중복체크
        if(x == 0):     
            duplicated += answer
    return answer * 4 - duplicated * 4  # 중복 제거
