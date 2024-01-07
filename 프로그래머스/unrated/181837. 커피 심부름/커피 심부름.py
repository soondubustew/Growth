def solution(order):
    
    americano_price = 4500
    cafelatte_price = 5000
    total_price = 0
    for coffee in order:
        if "iceamericano" in coffee or "americanoice" in coffee or "americano" in coffee or "anything" in coffee:
            total_price += americano_price
        elif "cafelattehot" in coffee or "cafelatteice" in coffee or "cafelatte" in coffee:
            total_price += cafelatte_price
    
    return total_price