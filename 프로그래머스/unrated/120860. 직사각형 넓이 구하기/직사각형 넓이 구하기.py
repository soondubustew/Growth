def solution(dots):
    x_dots = []
    y_dots = []   
    for (x, y) in dots:
        x_dots.append(x)
        y_dots.append(y)
    x_max = max(x_dots) 
    y_max = max(y_dots)  
    x_min = min(x_dots)  
    y_min = min(y_dots)  
    
    width = x_max - x_min
    height = y_max - y_min
    
    return width * height
