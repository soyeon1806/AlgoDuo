def divisor(n):
    result = []
    for d in range(1, n + 1):
        if n % d == 0:
            result.append(d)
    return result

def solution(brown, yellow):
    for yellow_width in divisor(yellow):
        yellow_height = yellow // yellow_width
        if (yellow_width + 2) * (yellow_height + 2) - yellow == brown:
            return [yellow_height + 2, yellow_width + 2]
