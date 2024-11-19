import math

def main():
	INPUT = input().split()
	N = int(INPUT[0])
	M = int(INPUT[1])
	INPUT = input().split()
	A = []
	for Ai in INPUT:
		A.append(int(Ai))
	
	max_A = max(A)
	max_K = max_A + M
	min_K = 0
	
	need = []
	remain = M
	
	for i in A:
		need.append(max_A - i)
		remain -= (max_A - i)
	
	if(remain < 0):
		min_K = max_A
	else:
		min_K = max_A + math.ceil(remain/N)
	print(min_K, max_K)
	
main()
