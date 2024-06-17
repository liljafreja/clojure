import random

def highest_product_of_three(numbers):
    l = len(numbers)
    maximum_product = float("-inf")
    for i in range(l):
        for j in range(i + 1, l):
            for k in range(j + 1, l):
                product = numbers[i] * numbers[j] * numbers[k]
                if product > maximum_product:
                    # print(numbers[i], numbers[j], numbers[k])
                    maximum_product = product
    return maximum_product

def highest_product_of_three(numbers):
    numbers.sort()
    return max(numbers[-1] * numbers[-2] * numbers[-3], numbers[0] * numbers[1] * numbers[-1])


for _ in range(1000):
    test_numbers = [random.randrange(-10, 10) for _ in range(random.randrange(3, 10))]
    print(f"(println (= (highest-product-of-three {test_numbers}) {highest_product_of_three(test_numbers)}))")
