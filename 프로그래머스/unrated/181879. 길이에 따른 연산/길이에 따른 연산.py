from functools import reduce

def solution(num_list):
    answer = 0
    
    if len(num_list) >= 11:
        answer = sum(num_list)
    elif len(num_list) <= 10:
        def multi(a, b):
            return a * b
        answer = reduce(multi, num_list)
        
    return answer