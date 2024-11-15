def solution(s):
    # if len(s) == 0:
    #     return 1    # 완료
    # elif len(s) == 1:
    #     return 0    # 문자열 길이가 1이면 불가능
    # for i in range(len(s) - 1):
    #     if s[i] == s[i + 1]:
    #         return solution(s[:i] + s[i + 2:])
    # return 0        # 맞는 문자열 없는경우
    
    arr = list(s)   # 스택 생성
    end = -1        # top을 가르키는 ptr

    for i in range(len(arr)):
        if end != -1 and arr[end] == arr[i]:
            # pop
            end -= 1
        else:
            # push
            end += 1
            arr[end] = arr[i]
        i += 1
        
    if end == -1:   # stack empty?
        return 1
    else:
        return 0
