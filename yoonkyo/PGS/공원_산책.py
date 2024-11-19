def solution(park, routes):
    height = len(park)
    width = len(park[0])
    GOAL = []
    
    # 시작좌표 찾기 #
    for y in range(height):
        for x in range(width):
            if park[y][x] == 'S':
                START = [x, y]
    
    new_x, new_y = START  # 시작좌표 설정
    
    # 각 경로 처리 #
    for route in routes:
        dir, go = route.split()
        go = int(go)
        
        # 임시 이동 좌표
        step_x, step_y = new_x, new_y
        success = True
        
        if dir == 'E':
            for _ in range(go):
                if step_x + 1 < width and park[step_y][step_x + 1] != 'X':
                    step_x += 1
                else:
                    success = False
                    break
            if success:
                new_x = step_x

        elif dir == 'W':
            for _ in range(go):
                if step_x > 0 and park[step_y][step_x - 1] != 'X':
                    step_x -= 1
                else:
                    success = False
                    break
            if success:
                new_x = step_x

        elif dir == 'N':
            for _ in range(go):
                if step_y > 0 and park[step_y - 1][step_x] != 'X':
                    step_y -= 1
                else:
                    success = False
                    break
            if success:
                new_y = step_y

        elif dir == 'S':
            for _ in range(go):
                if step_y + 1 < height and park[step_y + 1][step_x] != 'X':
                    step_y += 1
                else:
                    success = False
                    break
            if success:
                new_y = step_y
    
    GOAL = [new_y, new_x]
    return GOAL
