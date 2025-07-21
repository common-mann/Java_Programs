def solid_square(n):
    return ["*" * n for _ in range(n)]

def hollow_square(n):
    pattern = []
    for i in range(n):
        if i == 0 or i == n - 1:
            pattern.append("*" * n)
        else:
            pattern.append("*" + " " * (n - 2) + "*")
    return pattern

def checkerboard(n):
    return [("10" * (n//2))[:n] if i % 2 == 0 else ("01" * (n//2))[:n] for i in range(n)]

def diagonal_matrix(n):
    return ["".join("1" if i == j else "0" for j in range(n)) for i in range(n)]

def identity_matrix(n):
    return ["".join("1" if i == j else "0" for j in range(n)) for i in range(n)]

def recursive_triangle(n):
    def helper(current):
        if current == 0:
            return []
        prev = helper(current - 1)
        prev.append("*" * current)
        return prev
    return helper(n)

# Display all patterns
n = 5
patterns = {
    "Solid Square": solid_square(n),
    "Hollow Square": hollow_square(n),
    "Checkerboard": checkerboard(n),
    "Diagonal Matrix": diagonal_matrix(n),
    "Identity Matrix": identity_matrix(n),
    "Recursive Triangle": recursive_triangle(n),
}

# Print each pattern with a label
for name, pattern in patterns.items():
    print(f"\n{name} (n = {n}):")
    for line in pattern:
        print(line)
